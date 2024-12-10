package com.feedback.rest_feedback.feedbackservice;

import com.feedback.rest_feedback.Model.model;
import java.util.List;

public interface service{
    List<model> getAllFeedbacks();
    model addFeedback(model feedback);
    model approveFeedback(Integer id);
    void deleteFeedback(Integer id);
    Double getAverageRating();
}
