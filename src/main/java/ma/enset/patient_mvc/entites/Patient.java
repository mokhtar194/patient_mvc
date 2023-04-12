package ma.enset.patient_mvc.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    @Column(
            length = 50
    )
    private String nom;
    @Temporal(TemporalType.DATE)
    private Date datNaissance;
    private boolean malade;
    private int score;
}
