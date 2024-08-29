package ci.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@Entity
@DiscriminatorValue(value = "teacher")
public class Teacher extends Person {
    private String matiere;
}
