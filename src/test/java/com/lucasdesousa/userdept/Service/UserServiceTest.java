package com.lucasdesousa.userdept.Service;


import com.lucasdesousa.userdept.Repository.UserRepository;
import com.lucasdesousa.userdept.entities.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    UserService userService;
    @Mock
    UserRepository userRepository;


    @BeforeEach
    void setup() {
        userService = new UserService(userRepository);
    }

    @Test
    void findAll() {
        List<User> testeUsuario = new ArrayList<>();
        User estevao = new User();
        User lucas = new User();

        testeUsuario.add(estevao);
        testeUsuario.add(lucas);

        Mockito.when(userRepository.findAll()).thenReturn(testeUsuario);
        List<User> result = userService.findAll();

        Assertions.assertIterableEquals(testeUsuario, result);

    }

    @Test
    void findById() {
        int id = 1;
        Long n = (long) id;
        User lucas = new User();

        Mockito.when(userRepository.findById(n)).thenReturn(Optional.of(lucas));
        User result = userService.findById(n);
        Assertions.assertEquals(result, lucas);

    }

    @Test
    void insert() {
        User lucas = new User();
        Mockito.when(userRepository.save(lucas)).thenReturn(lucas);
        User result = userService.insert(lucas);
        Assertions.assertEquals(lucas, result);
    }
}