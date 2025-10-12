package org.example.decoratordemo.service.impl;

import org.example.decoratordemo.dto.UserResponseDTO;
import org.example.decoratordemo.service.UserService;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserResponseDTO getById(int id) {
        return new UserResponseDTO(id, "yjcdon", 22);
    }
}
