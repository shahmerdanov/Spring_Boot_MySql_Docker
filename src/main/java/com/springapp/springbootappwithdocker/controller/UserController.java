package com.springapp.springbootappwithdocker.controller;

import com.springapp.springbootappwithdocker.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/user/{id}")
    public ResponseEntity<String> getUserName(@PathVariable Long id){
        String name = userService.getUserNameById(id);
        return  new ResponseEntity<>(name, HttpStatus.OK);
    }
}
