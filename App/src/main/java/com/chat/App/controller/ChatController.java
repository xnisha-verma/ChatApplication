package com.chat.App.controller;

import com.chat.App.model.ChatMessage;
import com.chat.App.model.ChatMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;
import java.util.List;

@Controller
public class ChatController {

    @Autowired
    private ChatMessageRepository chatMessageRepository;

    @MessageMapping("/chat/{roomId}/sendMessage")
    @SendTo("/topic/room/{roomId}")
    public ChatMessage sendMessage(@DestinationVariable Long roomId, ChatMessage message) {
        message.setRoomId(roomId);
        return chatMessageRepository.save(message);
    }

    @MessageMapping("/chat/{roomId}/typing")
    @SendTo("/topic/room/{roomId}/typing")
    public String typing(@DestinationVariable Long roomId, String username) {
        return username;
    }

    @GetMapping("/api/messages/{roomId}")
    @ResponseBody
    public List<ChatMessage> getHistory(@PathVariable Long roomId) {
        List<ChatMessage> messages = chatMessageRepository.findTop50ByRoomIdOrderByTimestampDesc(roomId);
        Collections.reverse(messages);
        return messages;
    }

    @GetMapping({"/", "/chat"})
    public String home() {
        return "chat";
    }
}
