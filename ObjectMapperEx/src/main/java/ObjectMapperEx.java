import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.InnerClassPersonDto;
import dto.PersonDto;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class ObjectMapperEx {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        // Java Object ->  JSON
        Person personToJSON = new Person("zooneon", 25, "seoul");
        try {
            objectMapper.writeValue(new File("src/person.json"), personToJSON);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // JSON -> Java Object
        String json = "{\"name\":\"zooneon\",\"age\":25,\"address\":\"seoul\"}";
        try {
            Person deserializedPerson = objectMapper.readValue(json, Person.class);
            System.out.println(deserializedPerson);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        // complicated JSON -> Java Object
        String complicatedJson = "{\n" +
                "  \"name\": \"zooneon\",\n" +
                "  \"age\": 25,\n" +
                "  \"address\": \"seoul\",\n" +
                "  \"contact\": {\n" +
                "    \"phone_number\": \"0102222\",\n" +
                "    \"email\": \"foo@google.com\"\n" +
                "  },\n" +
                "  \"job\": {\n" +
                "    \"working\": true,\n" +
                "    \"workplace\": {\n" +
                "      \"name\": \"Sejong Univ.\",\n" +
                "      \"position\": \"student\"\n" +
                "    }\n" +
                "  }\n" +
                "}";

        // first try
        try {
            Map<String, Object> person = objectMapper.readValue(complicatedJson, new TypeReference<Map<String, Object>>() {});
            String name = person.get("name").toString();
            Map<String, String> contact = (Map<String, String>) person.get("contact");
            String phoneNumber = contact.get("phone_number");
            Map<String, Object> job = (Map<String, Object>) person.get("job");
            Map<String, String> workplace = (Map<String, String>) job.get("workplace");
            String workplaceName = workplace.get("name");

            System.out.println(name);
            System.out.println(phoneNumber);
            System.out.println(workplaceName);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        // second try
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            PersonDto personDto = objectMapper.readValue(complicatedJson, PersonDto.class);
            System.out.println(personDto);
            System.out.println(personDto.getName());
            System.out.println(personDto.getContact().getPhoneNumber());
            System.out.println(personDto.getJob().getWorkplace().getName());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        // third try
        try {
            InnerClassPersonDto innerClassPersonDto = objectMapper.readValue(complicatedJson, InnerClassPersonDto.class);
            System.out.println(innerClassPersonDto);
            System.out.println(innerClassPersonDto.getName());
            System.out.println(innerClassPersonDto.getContact().getPhoneNumber());
            System.out.println(innerClassPersonDto.getJob().getWorkplace().getName());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
