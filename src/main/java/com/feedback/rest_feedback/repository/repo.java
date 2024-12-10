package com.feedback.rest_feedback.repository;

import com.feedback.rest_feedback.Model.model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface repo extends JpaRepository<model, Integer> {
    
    @Query("SELECT AVG(f.rating) FROM model f WHERE f.approved = true")
    Double findAverageRating();
}
