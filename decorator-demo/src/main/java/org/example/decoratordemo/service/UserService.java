package org.example.decoratordemo.service;

import org.example.decoratordemo.dto.UserResponseDTO;


public interface UserService {
    UserResponseDTO getById(int id);
}
