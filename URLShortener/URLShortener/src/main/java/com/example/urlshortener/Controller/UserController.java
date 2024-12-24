package com.example.urlshortener.Controller;

import com.example.urlshortener.Dto.UserDTO;
import com.example.urlshortener.Services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserDTO> postUser(@RequestBody UserDTO userDto){
        UserDTO userSavedDto = userService.postUser(userDto);
        return ResponseEntity.ok(userSavedDto);
    }
}
