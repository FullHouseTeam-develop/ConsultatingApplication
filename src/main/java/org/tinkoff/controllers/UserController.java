package org.tinkoff.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.tinkoff.database.entity.User;
import org.tinkoff.database.repository.UserRepository;

import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/user")
@SessionAttributes("user")
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;

    @GetMapping
    public Optional<User> showUserForm()
    {
        return userRepository.findById(8);
    }
}
