package com.example.project;
import java.util.List;

public class ListOfPosts {
    private List<Post> posts;

    // Constructor
    public ListOfPosts(List<Post> posts) {
        this.posts = posts;
    }

    // Getter and Setter
    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    // toString Method
    @Override
    public String toString() {
        return "ListOfPosts{" +
                "posts=" + posts +
                '}';
    }
}

