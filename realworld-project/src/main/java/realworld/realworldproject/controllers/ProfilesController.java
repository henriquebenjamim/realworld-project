package realworld.realworldproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import realworld.realworldproject.domain.profile.Profile;
import realworld.realworldproject.dtos.profile.ProfileDTO;
import realworld.realworldproject.services.ProfileService;

@RestController()
@RequestMapping("api/profiles")
public class ProfilesController {

    @Autowired
    private ProfileService profileService;

    @PostMapping("create")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Profile> Post(@RequestBody ProfileDTO profile) {
        Profile newProfile = profileService.createProfile(profile);
        return new ResponseEntity<>(newProfile, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Profile> GetProfileById(@PathVariable Long id) throws Exception {
        Profile profile = profileService.findProfileById(id);
        return new ResponseEntity<>(profile, HttpStatus.CREATED);
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
