
package com.example.project;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Comment {
    private int id;

    @JsonProperty("postid")  
    private int postId;

    private String content;

    // Constructors
    public Comment() {}

    public Comment(int id, int postId, String content) {
        this.id = id;
        this.postId = postId;
        this.content = content;
    }

    public int getId() {
        return id; 
    }
    public void setId(int id) { 
        this.id = id; 
    }

    public int getPostId() { 
        return postId; 
    }
    public void setPostId(int postId) { 
        this.postId = postId; 
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) { 
        this.content = content; 
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", postId=" + postId +
                ", content='" + content + '\'' +
                '}';
    }
}
