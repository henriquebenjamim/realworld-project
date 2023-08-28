package realworld.realworldproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import realworld.realworldproject.dtos.UserDTO;
import realworld.realworldproject.entities.User;
import realworld.realworldproject.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public User findUserById(Long id) throws Exception {
        return this.repository
                .findUserById(id)
                .orElseThrow(() -> new Exception("User not found."));
    }

    public User createUser(UserDTO data) {
        User newUser = new User(data);
        this.saveUser(newUser);
        return newUser;
    }

    public void saveUser(User user) {
        this.repository.save(user);
    }
}
