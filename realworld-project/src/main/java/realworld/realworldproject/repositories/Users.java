package realworld.realworldproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import realworld.realworldproject.entities.User;

public interface Users extends JpaRepository<User, Integer> {

}
