package dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@NoArgsConstructor
public class InnerClassPersonDto {

    private String name;
    private InnerContact contact;
    private InnerJob job;

    @Getter
    @NoArgsConstructor
    @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
    public class InnerContact {

        private String phoneNumber;
        private String email;
    }

    @Getter
    @NoArgsConstructor
    public class InnerJob {

        private boolean working;
        private InnerWorkplace workplace;

        @Getter
        @NoArgsConstructor
        public class InnerWorkplace {

            private String name;
            private String position;
        }
    }
}
