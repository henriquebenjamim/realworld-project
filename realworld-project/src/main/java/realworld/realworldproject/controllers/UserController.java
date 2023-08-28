package realworld.realworldproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import realworld.realworldproject.dtos.UserDTO;
import realworld.realworldproject.entities.User;
import realworld.realworldproject.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping("login")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<User> Post(@RequestBody UserDTO user) {
        User newUser = userService.createUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<User> GetUserById(@PathVariable Long id) throws Exception {
        User user = userService.findUserById(id);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

//    @PutMapping("{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void update(@PathVariable Long id,
//                       @RequestBody @Valid realworld.realworldproject.entities.User user) {
//        users
//                .findById(id)
//                .map(existingUser -> {
//                    user.setId(existingUser.getId());
//                    users.save(user);
//                    return existingUser;
//                }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
//                        "User not found."));
//    }


}
