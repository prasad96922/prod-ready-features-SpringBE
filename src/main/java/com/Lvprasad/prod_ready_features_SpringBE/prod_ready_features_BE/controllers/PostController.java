package com.Lvprasad.prod_ready_features_SpringBE.prod_ready_features_BE.controllers;


import com.Lvprasad.prod_ready_features_SpringBE.prod_ready_features_BE.dto.PostDTO;
import com.Lvprasad.prod_ready_features_SpringBE.prod_ready_features_BE.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping
    public ResponseEntity<List<PostDTO>> getAllPosts() {
        return ResponseEntity.ok(postService.getAllPosts());
    }

    @GetMapping("/{postId}")
    public ResponseEntity<PostDTO> getPostById(@PathVariable Long postId) {
        return  ResponseEntity.ok(postService.getPostById(postId));
    }

    @PostMapping
    public ResponseEntity<PostDTO> createPost(@RequestBody PostDTO inputPost) {
        return ResponseEntity.ok(postService.createNewPost(inputPost));
    }

}
