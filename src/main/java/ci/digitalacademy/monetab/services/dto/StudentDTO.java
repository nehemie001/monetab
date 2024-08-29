package ci.digitalacademy.monetab.services.dto;

import ci.digitalacademy.monetab.models.Person;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDTO extends PersonDTO {

    private String matricule;
}
