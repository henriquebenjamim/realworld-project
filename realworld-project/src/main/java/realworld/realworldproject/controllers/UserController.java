package realworld.realworldproject.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import realworld.realworldproject.entities.User;
import realworld.realworldproject.repositories.UserRepository;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserRepository users;

    private UserController(UserRepository users) {
        this.users = users;
    }

    @PostMapping("login")
    @ResponseStatus(HttpStatus.CREATED)
    public User save (@RequestBody User user) {
        return users.save(user);
    }

//    @GetMapping("{id}")
//    public User get(@PathVariable Long id) {
//        return users.findById(id);
//    }


    @GetMapping("{username}")
    public User get(@PathVariable String username) {
        return users.findByUsername(username)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found."));
    }


}
