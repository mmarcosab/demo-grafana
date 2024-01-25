package com.chatbot.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public ResponseEntity<?> getHome() {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/home-error")
    public ResponseEntity<?> getHomeWithError() {
        return ResponseEntity.badRequest().build();
    }

}
