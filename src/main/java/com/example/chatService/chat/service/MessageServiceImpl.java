package com.example.chatService.chat.service;


import com.example.chatService.chat.model.Message;
import com.example.chatService.chat.repository.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    MessageMapper messageMapper;

    @Override
    public Integer insertChatLog(Message message) {
        return messageMapper.insertChatLog(message);
    }

    @Override
    public List<Message> getAllChatLog() {
        return messageMapper.getAllChatLog();

    }
}
