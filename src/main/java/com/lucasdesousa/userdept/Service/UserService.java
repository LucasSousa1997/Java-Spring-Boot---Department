package com.lucasdesousa.userdept.Service;

import com.lucasdesousa.userdept.Repository.UserRepository;
import com.lucasdesousa.userdept.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;


    public UserService(UserRepository userRepository) {
        this.repository = userRepository;
    }

    public List<User> findAll() {
        List<User> result = repository.findAll();
        return result;
    }


    public User findById(Long id) {
        User result = repository.findById(id).get();
        return result;
    }


    public User insert(User user) {
        User result = repository.save(user);
        return result;
    }
}
