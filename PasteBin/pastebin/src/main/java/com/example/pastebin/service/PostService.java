package com.example.pastebin.service;

import com.example.pastebin.dto.PostDTO;
import com.example.pastebin.dto.PostResponseDTO;
import com.example.pastebin.entity.PostEntity;
import com.example.pastebin.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    private final ModelMapper modelMapper;

    public PostResponseDTO createPost(PostDTO postDTO) {
        PostResponseDTO response = new PostResponseDTO();
        PostEntity postToBePosted = modelMapper.map(postDTO,PostEntity.class);
        if (postDTO.getExpiryDate() == null){
            response.setExpiryDate(LocalDate.now().plusMonths(3));
            postToBePosted.setExpiryDate(LocalDate.now().plusMonths(3));
        }else{
            response.setExpiryDate(postDTO.getExpiryDate());
            postToBePosted.setExpiryDate(postDTO.getExpiryDate());
        }
        PostEntity savedPost = postRepository.save(postToBePosted);
        response.setUrl("http://localhost:8081/posts/"+savedPost.getId());
        return response;
    }

    public PostDTO getPost(Long id) {
        PostEntity post = postRepository.getPostEntityById(id);
        return modelMapper.map(post,PostDTO.class);
    }
}
