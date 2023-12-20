package com.gf.back.spring.security.angular.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author Gianluca Ferruzzi
 * @version 1.0
 * @since 12/19/23
 */

@RestController
public class HomeController {


    @GetMapping("messages")
    public ResponseEntity<List<String>> messages(){
        return  ResponseEntity.ok(Arrays.asList("first","second"));
    }
}
