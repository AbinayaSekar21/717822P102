package com.example.project;

import java.util.List;

public class ListOfComments {
    private List<Comment> comments;

    // Constructor
    public ListOfComments(List<Comment> comments) {
        this.comments = comments;
    }

    // Getter
    public List<Comment> getComments() {
        return comments;
    }

    // Setter
    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    // ToString Method
    @Override
    public String toString() {
        return "ListOfComments{" +
                "comments=" + comments +
                '}';
    }
}
