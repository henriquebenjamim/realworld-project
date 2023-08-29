package realworld.realworldproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import realworld.realworldproject.domain.profile.Profile;

import java.util.Optional;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

    Optional<Profile> findByUsername(String username);

    Optional<Profile> findProfileById(Long id);
}
