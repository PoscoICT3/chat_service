package com.example.chatService.chat.service;

import com.example.chatService.chat.model.Message;

import java.util.List;

public interface MessageService {
    Integer insertChatLog(Message message);
    List<Message> getAllChatLog();
}
