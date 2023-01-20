package com.example.springbootchatgpt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatGPTController {

    @GetMapping("/")
    public String hello() {
        return "Hello World!";
    }

    @PostMapping ("/answerthequestions")
    public String aa( String text) {
        try {
            return ChatGPTService.chatGPT(text);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
