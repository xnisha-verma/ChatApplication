package com.chat.App.controller;

import com.chat.App.model.FileEntity;
import com.chat.App.model.RoomEntity;
import com.chat.App.model.UserEntity;
import com.chat.App.model.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

/**
 * Basic REST controllers to support future UI implementations for 
 * Authentication, Room Management, and File Uploads.
 */
@RestController
@RequestMapping("/api/v1")
public class AdminController {

    // --- Users API ---
    @PostMapping("/users/register")
    public UserEntity registerUser(@RequestBody UserEntity user) {
        // TODO: Hash password, save to DB using UserRepository
        return user;
    }

    @GetMapping("/users")
    public List<UserEntity> getAllUsers() {
        // TODO: Fetch from UserRepository
        return Collections.emptyList();
    }

    @Autowired
    private RoomRepository roomRepository;

    // --- Rooms API ---
    @PostMapping("/rooms")
    public RoomEntity createRoom(@RequestBody RoomEntity room) {
        return roomRepository.save(room);
    }

    @GetMapping("/rooms")
    public List<RoomEntity> getRooms() {
        return roomRepository.findAll();
    }

    // --- Files API ---
    @PostMapping("/files/upload")
    public String uploadFile() {
        // TODO: Handle MultipartFile upload and save FileEntity
        return "File uploaded successfully";
    }
}
