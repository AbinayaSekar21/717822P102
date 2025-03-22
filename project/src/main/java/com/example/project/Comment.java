package com.example.project;

public class Comment {
    private int id;
    private int postid;
    private String content;

    // Constructors
    public Comment() {}

    public Comment(int id, int postid, String content) {
        this.id = id;
        this.postid = postid;
        this.content = content;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getPostid() { return postid; }
    public void setPostid(int postid) { this.postid = postid; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", postid=" + postid +
                ", content='" + content + '\'' +
                '}';
    }
}
