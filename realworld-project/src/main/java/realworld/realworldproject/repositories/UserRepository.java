package realworld.realworldproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import realworld.realworldproject.entities.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findUserById(Long id);
}
