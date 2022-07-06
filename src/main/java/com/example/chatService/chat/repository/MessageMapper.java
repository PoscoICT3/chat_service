package com.example.chatService.chat.repository;

import com.example.chatService.chat.model.Message;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MessageMapper {
    Integer insertChatLog(Message message);
    List<Message> getAllChatLog();
}
