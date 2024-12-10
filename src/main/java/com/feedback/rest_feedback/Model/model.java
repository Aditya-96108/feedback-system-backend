package com.feedback.rest_feedback.Model;

import jakarta.persistence.*;

@Entity
public class model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private int rating;

    @Column(length = 500)
    private String comment;

    private boolean approved = false;

    // Default constructor
    public model() {
    }

    // Constructor with all fields
    public model(int rating, String comment, boolean approved) {
        this.rating = rating;
        this.comment = comment;
        this.approved = approved;
    }

    // Getter for id
    public Integer getId() {
        return id;
    }

    // Setter for id
    public void setId(Integer id) {
        this.id = id;
    }

    // Getter for rating
    public int getRating() {
        return rating;
    }

    // Setter for rating
    public void setRating(int rating) {
        this.rating = rating;
    }

    // Getter for comment
    public String getComment() {
        return comment;
    }

    // Setter for comment
    public void setComment(String comment) {
        this.comment = comment;
    }

    // Getter for approved
    public boolean isApproved() {
        return approved;
    }

    // Setter for approved
    public void setApproved(boolean approved) {
        this.approved = approved;
    }
}
