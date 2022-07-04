package com.wys.user.registration.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class userRegisService {
    private final userRepository userRepository;
@Autowired
    public userRegisService(userRepository userRepository) {
    this.userRepository = userRepository;
    }

    public  List<userRegis> getUser(){
    return userRepository.findAll();
    }

    public void addNewUser(userRegis userRegis) {
    userRepository.save(userRegis);
}

    public void deleteUser( Long userId ) {
    //userRepository.findById(userId);
        userRepository.deleteById(userId);
    }
}
