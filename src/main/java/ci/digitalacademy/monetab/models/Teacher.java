package ci.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "teacher")
@ToString
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "matiere", nullable = false)
    private String matiere;

    @OneToMany
    private Set<FicheNote> ficheNotes;
}
