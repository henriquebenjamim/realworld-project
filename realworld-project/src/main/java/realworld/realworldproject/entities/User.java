package realworld.realworldproject.entities;


import lombok.*;
import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;

    @Column(name = "username", length = 40)
    private String username;

    @Column(name = "email", length = 52)
    private String email;

    @Column(name = "password", length = 100)
    private String password;

}
