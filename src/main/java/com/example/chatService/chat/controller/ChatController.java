package com.example.chatService.chat.controller;

import com.example.chatService.chat.model.Message;
import com.example.chatService.chat.service.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {
    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @Autowired
    MessageServiceImpl messageService;

    // 다수의 대상인지에 따라서 사용되는 채널이 달라진다

    @MessageMapping("/message") // app/messagedddd
    @SendTo("/chatroom/public")
    public Message receivePublicMessage(@Payload Message message){
        Integer dbInsert = messageService.insertChatLog(message);
        return message;

        //update
    }
}
