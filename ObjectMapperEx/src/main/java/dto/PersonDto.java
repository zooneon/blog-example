package dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@NoArgsConstructor
public class PersonDto {

    private String name;
    private Contact contact;
    private Job job;
}
