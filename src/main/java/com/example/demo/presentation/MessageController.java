package com.example.demo.presentation;

import com.example.demo.data.JpaMessageRepository;
import com.example.demo.data.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageController {
    @Autowired
    private JpaMessageRepository repository;

    @GetMapping
    public List<Message> messages() {
        return repository.findAll();
    }

    @PostMapping(consumes = "application/json")
    public void newMessage(@RequestBody Message message) {
        this.repository.save(message);
    }
}
