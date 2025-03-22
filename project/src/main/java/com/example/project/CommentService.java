package com.example.project;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class CommentService {
    private final WebClient webClient;

    // Constructor for WebClient
    public CommentService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://20.244.56.144/test").build();
    }

    // Fetch comments for a given postId
    public List<Comment> getCommentsByPostId(int postId) {
        return webClient.get()
                .uri("/posts/{postId}/comments", postId)
                .retrieve()
                .bodyToMono(CommentResponse.class)
                .block() // Blocking for synchronous call
                .getComments();
    }
}

// Class to handle API response
class CommentResponse {
    private List<Comment> comments;

    public List<Comment> getComments() { return comments; }
    public void setComments(List<Comment> comments) { this.comments = comments; }
}
