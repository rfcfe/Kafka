package com.dailycodebuffer.cab_book_user.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @KafkaListener(topics = "cab-location", groupId = "user-Group")
    public void cabLocation(String location) {
        System.out.println(location);

    }
}
