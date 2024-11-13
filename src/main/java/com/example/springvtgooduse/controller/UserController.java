package com.example.springvtgooduse.controller;

import com.example.springvtgooduse.model.User;
import com.example.springvtgooduse.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository)  {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> getAllUsers() throws InterruptedException {
        Thread.sleep(3000);
        return userRepository.findAll();
    }

    @GetMapping("/baduse")
    public int badUse() throws InterruptedException {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        return numbers.stream().reduce(0, (subtotal, element) -> subtotal + 1);
    }


}
