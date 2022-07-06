package com.example.chatService.chat.controller;

import com.example.chatService.chat.model.Message;
import com.example.chatService.chat.service.MessageService;
import com.example.chatService.chat.service.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetChatController {
    @Autowired
    MessageService messageService;

    @GetMapping("/chat/list")
    public List<Message> receiveAllPublicMessage() {
        return messageService.getAllChatLog();
    }
}
