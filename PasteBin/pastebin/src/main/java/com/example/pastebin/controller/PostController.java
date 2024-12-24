package com.example.pastebin.controller;

import com.example.pastebin.dto.PostDTO;
import com.example.pastebin.dto.PostResponseDTO;
import com.example.pastebin.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping("/{id}")
    public ResponseEntity<String> getPost(@PathVariable Long id){
        PostDTO post  = postService.getPost(id);
        if (post == null){
            return new ResponseEntity<>("url invalid", HttpStatus.NOT_FOUND);
        }else{
            return ResponseEntity.ok(post.getText());
        }
    }

    @PostMapping
    public ResponseEntity<PostResponseDTO> createPost(@RequestBody PostDTO postDTO){
        PostResponseDTO createdPost = postService.createPost(postDTO);
        return ResponseEntity.ok(createdPost);
    }
}
