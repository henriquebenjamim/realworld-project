package realworld.realworldproject.entities;


import lombok.*;
import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column(name = "username", length = 40)
    private String username;

    @Column(name = "email", length = 52)
    private String email;

    @Column(name = "password", length = 100)
    private String password;

    @Column(name = "bio", length = 30)
    private String bio;

    @Column(name = "image", length = 300)
    private String image;

}
