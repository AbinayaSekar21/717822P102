package com.example.project;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class WebClientService {

    private final WebClient webClient;

    public WebClientService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://20.244.56.144/test/users").build();
    }

    public Mono<String> getPostsForUser(int userId) {
        return webClient.get()
                .uri("/{userId}/posts", userId)
                .retrieve()
                .bodyToMono(String.class);
    }
}
