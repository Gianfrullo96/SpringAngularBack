package com.gf.back.spring.security.angular.controller;

import com.gf.back.spring.security.angular.dtos.CredentialsDto;
import com.gf.back.spring.security.angular.dtos.SignUpDto;
import com.gf.back.spring.security.angular.dtos.UserDto;
import com.gf.back.spring.security.angular.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

/**
 * @author Gianluca Ferruzzi
 * @version 1.0
 * @since 12/19/23
 */
@RequiredArgsConstructor
@RestController
public class AuthController {

    private final UserService userService;


    @PostMapping("/login")
    public ResponseEntity<UserDto> login(@RequestBody @Valid CredentialsDto credentialsDto) {
        UserDto userDto = userService.login(credentialsDto);
        return ResponseEntity.ok(userDto);
    }

    @PostMapping("/register")
    public ResponseEntity<UserDto> register(@RequestBody @Valid SignUpDto user) {
        UserDto createdUser = userService.register(user);
        return ResponseEntity.created(URI.create("/users/" + createdUser.getId())).body(createdUser);
    }

}
