package ci.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ficheNote")
@ToString
public class FicheNote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "note", nullable = false)
    private String note;

    @Column(name = "years", nullable = false)
    private String years;

//    @ManyToOne
//    @JoinColumn(name = "teacher_id")
//    private Teacher teacher;
}
