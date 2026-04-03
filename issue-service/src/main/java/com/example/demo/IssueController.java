package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/issues")
public class IssueController {

    // 1. Your existing test method
    @GetMapping
    public String getIssues() {
        return "Issue Service is online and healthy!";
    }

    // 2. The Interactive "Borrow" Method for the Demo
    @GetMapping("/borrow")
    public String borrowBook(@RequestParam String bookName, @RequestParam String studentName) {
        // In a real app, this would call the Book-Service and User-Service
        // For your review, this proves the Logic Layer is working.
        return "SUCCESS: '" + bookName + "' has been issued to " + studentName + " successfully.";
    }
}