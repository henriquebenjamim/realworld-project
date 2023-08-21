package realworld.realworldproject.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import realworld.realworldproject.entities.User;
import realworld.realworldproject.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    private User findUserById(Long id) throws Exception {
        return this.repository.findById(id).orElseThrow(() -> new Exception("User not found."));
    }
}
