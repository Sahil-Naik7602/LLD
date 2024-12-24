package com.example.urlshortener.Services;

import com.example.urlshortener.Dto.UserDTO;
import com.example.urlshortener.Entities.UserEntity;
import com.example.urlshortener.Repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public UserDTO postUser(UserDTO userDto) {
        UserEntity user = new UserEntity();
        user.setName(userDto.getName());
        user.setEmailId(userDto.getEmailId());
        userRepository.save(user);
        return modelMapper.map(user,UserDTO.class);
    }
}
