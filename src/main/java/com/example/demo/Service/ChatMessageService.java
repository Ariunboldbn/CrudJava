package com.example.demo.Service;

import com.example.demo.Model.ChatMessage;
import com.example.demo.Repository.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatMessageService {

    @Autowired
    private ChatRepository chatRepository;

    public List<ChatMessage> getAllMessages() {
        return chatRepository.findAll();
    }
}
