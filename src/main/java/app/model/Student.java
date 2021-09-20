package app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "STUDENT")
public class Student {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    @Column(name = "F_NAME", nullable = false)
    private String firstName;

    @Column(name = "L_NAME", unique = true, length = 25)
    private String lastName;

    @Column(name = "CONTACT_NO", length = 15)
    private String contactNo;

    @OneToOne
    private City city;
}
