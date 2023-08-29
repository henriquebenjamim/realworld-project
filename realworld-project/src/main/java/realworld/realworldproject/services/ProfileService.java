package realworld.realworldproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import realworld.realworldproject.domain.profile.Profile;
import realworld.realworldproject.dtos.profile.ProfileDTO;
import realworld.realworldproject.repositories.ProfileRepository;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository repository;

    public Profile findProfileById(Long id) throws Exception {
        return this.repository.findProfileById(id).orElseThrow(() -> new Exception("Profile not found."));
    }
    public Profile createProfile(ProfileDTO data) {
        Profile newProfile = new Profile(data);
        this.saveProfile(newProfile);
        return newProfile;
    }

    public void saveProfile(Profile profile) {
        this.repository.save(profile);
    }
}
