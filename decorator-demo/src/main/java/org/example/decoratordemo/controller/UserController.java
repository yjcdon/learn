package org.example.decoratordemo.controller;

import org.example.decoratordemo.dto.UserResponseDTO;
import org.example.decoratordemo.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/getById/{id}")
    public UserResponseDTO getById(@PathVariable int id) {
        return userService.getById(id);
    }
}
