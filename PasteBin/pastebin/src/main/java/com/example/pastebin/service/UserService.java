package com.example.pastebin.service;

import com.example.pastebin.dto.UserDTO;
import com.example.pastebin.entity.UserEntity;
import com.example.pastebin.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    public UserDTO createUser(UserDTO userDTO) {
        UserEntity userToBeSaved = modelMapper.map(userDTO, UserEntity.class);
        UserEntity savedUser = userRepository.save(userToBeSaved);
        return modelMapper.map(savedUser,UserDTO.class);
    }
}
