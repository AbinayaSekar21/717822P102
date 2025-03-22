
package com.example.project;

import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {
    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/{postId}")
    public List<Comment> getComments(@PathVariable int postId) {
        return commentService.getCommentsByPostId(postId);
    }
}
