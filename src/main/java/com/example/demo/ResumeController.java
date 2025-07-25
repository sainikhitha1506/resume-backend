package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000") // Allow React frontend
public class ResumeController {

    @GetMapping("/")
    public String testApi() {
        return "Backend is running!";
    }

    @PostMapping("/upload")
    public ResponseEntity<Map<String, Object>> uploadResume(@RequestParam("file") MultipartFile file) {
        Map<String, Object> response = new HashMap<>();

        if (file.isEmpty()) {
            response.put("message", "No file uploaded");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }

        // Simulate resume scoring logic (for now random)
        int score = new Random().nextInt(100);
        response.put("fileName", file.getOriginalFilename());
        response.put("score", score);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
