package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")  // Allow all origins (you can limit this later)
public class ResumeController {

    // Default route for home
    @GetMapping("/")
    public String home() {
        return "Welcome to Smart Resume Analyzer Backend!";
    }

    // Test route
    @GetMapping("/test")
    public String testApi() {
        return "Backend is running!";
    }

    // Resume upload route
    @PostMapping("/upload")
    public ResponseEntity<Map<String, Object>> uploadResume(@RequestParam("file") MultipartFile file) {
        Map<String, Object> response = new HashMap<>();

        if (file.isEmpty()) {
            response.put("message", "No file uploaded");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }

        // Simulate resume scoring (random score for now)
        int score = new Random().nextInt(100);
        response.put("fileName", file.getOriginalFilename());
        response.put("score", score);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
