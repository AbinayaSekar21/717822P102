package com.example.project;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class CommentService {

    private final WebClient webClient;

    public CommentService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://20.244.56.144/test").build();
    }

    public Mono<ListOfComments> getCommentsByPostId(int postId) {
        return webClient.get()
                .uri("/posts/" + postId + "/comments")
                .retrieve()
                .bodyToMono(ListOfComments.class);
    }
}


