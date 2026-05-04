package com.chat.App.config;

import com.chat.App.model.RoomEntity;
import com.chat.App.model.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private RoomRepository roomRepository;

    @Override
    public void run(String... args) throws Exception {
        if (roomRepository.count() == 0) {
            RoomEntity general = new RoomEntity();
            general.setName("General");
            general.setType("PUBLIC");

            RoomEntity tech = new RoomEntity();
            tech.setName("Tech Talk");
            tech.setType("PUBLIC");

            RoomEntity random = new RoomEntity();
            random.setName("Random");
            random.setType("PUBLIC");

            roomRepository.saveAll(Arrays.asList(general, tech, random));
        }
    }
}
