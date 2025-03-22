package com.example.project;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListOfComments {

    @JsonProperty("comments")
    private List<Comment> comments;

    public ListOfComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "ListOfComments{" +
                "comments=" + comments +
                '}';
    }
}
