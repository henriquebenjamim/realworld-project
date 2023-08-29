package realworld.realworldproject.domain.profile;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import realworld.realworldproject.dtos.profile.ProfileDTO;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "profile")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private String username;

    private String bio;

    private String image;

    public Profile(ProfileDTO data) {
        this.username = data.username();
        this.bio = data.bio();
        this.image = data.image();
    }

}
