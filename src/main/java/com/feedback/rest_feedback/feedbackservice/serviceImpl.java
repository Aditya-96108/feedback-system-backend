package com.feedback.rest_feedback.feedbackservice;

import com.feedback.rest_feedback.Model.model;
import com.feedback.rest_feedback.repository.repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class serviceImpl implements service {
    @Autowired
    private repo feedbackRepository;

    @Override
    public List<model> getAllFeedbacks() {
        return feedbackRepository.findAll();
    }

    @Override
    public model addFeedback(model feedback) {
        return feedbackRepository.save(feedback);
    }

    @Override
    public model approveFeedback(Integer id) {
        model feedback = feedbackRepository.findById(id).orElseThrow(() -> new RuntimeException("Feedback not found"));
        feedback.setApproved(true);
        return feedbackRepository.save(feedback);
    }

    @Override
    public void deleteFeedback(Integer id) {
        feedbackRepository.deleteById(id);
    }

    @Override
    public Double getAverageRating() {
        Double avgRating = feedbackRepository.findAverageRating();
        return avgRating == null ? 0.0 : avgRating;
    }

}
