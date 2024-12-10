package com.feedback.rest_feedback.Controller;

import com.feedback.rest_feedback.Model.model;
import com.feedback.rest_feedback.feedbackservice.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/feedbacks")
@CrossOrigin(origins = "*")
public class controller {
    @Autowired
    private service feedbackService;

    @GetMapping
    public List<model> getAllFeedbacks() {
        return feedbackService.getAllFeedbacks();
    }

    @PostMapping
    public model addFeedback(@RequestBody model feedback) {
        return feedbackService.addFeedback(feedback);
    }

    @PutMapping("/{id}/approve")
    public model approveFeedback(@PathVariable Integer id) {
        return feedbackService.approveFeedback(id);
    }

    @DeleteMapping("/{id}")
    public void deleteFeedback(@PathVariable Integer id) {
        feedbackService.deleteFeedback(id);
    }

    @GetMapping("/average")
    public Double getAverageRating() {
        return feedbackService.getAverageRating();
    }
}
