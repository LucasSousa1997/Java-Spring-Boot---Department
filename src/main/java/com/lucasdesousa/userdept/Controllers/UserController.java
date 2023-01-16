package com.lucasdesousa.userdept.Controllers;


import com.lucasdesousa.userdept.Service.UserService;
import com.lucasdesousa.userdept.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")

public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }


    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping
    public User insert(@RequestBody User user) {
        return userService.insert(user);
    }

}
