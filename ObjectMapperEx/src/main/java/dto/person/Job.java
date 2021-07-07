package dto.person;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@NoArgsConstructor
public class Job {

    private boolean working;
    private Workplace workplace;
}
