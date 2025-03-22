package com.example.project;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class PostController {

    private final WebClientService webClientService;

    public PostController(WebClientService webClientService) {
        this.webClientService = webClientService;
    }

    @GetMapping("/posts/{userId}")
    public Mono<String> getPosts(@PathVariable int userId) {
        return webClientService.getPostsForUser(userId);
    }
}
