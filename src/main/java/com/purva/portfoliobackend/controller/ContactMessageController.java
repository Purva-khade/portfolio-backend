package com.purva.portfoliobackend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.purva.portfoliobackend.entity.ContactMessage;
import com.purva.portfoliobackend.repository.ContactMessageRepository;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "http://localhost:5173")
public class ContactMessageController {

    private final ContactMessageRepository repository;

    public ContactMessageController(ContactMessageRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ContactMessage saveMessage(@RequestBody ContactMessage contactMessage) {
        return repository.save(contactMessage);
    }
}