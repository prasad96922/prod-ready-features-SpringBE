package com.Lvprasad.prod_ready_features_SpringBE.prod_ready_features_BE.services;

import com.Lvprasad.prod_ready_features_SpringBE.prod_ready_features_BE.dto.PostDTO;
import com.Lvprasad.prod_ready_features_SpringBE.prod_ready_features_BE.entities.PostEntity;
import com.Lvprasad.prod_ready_features_SpringBE.prod_ready_features_BE.exceptions.ResourceNotFoundException;
import com.Lvprasad.prod_ready_features_SpringBE.prod_ready_features_BE.repositories.PostRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;
    private final ModelMapper modelMapper;

//   public PostServiceImpl(PostRepository postRepository) {
//        this.postRepository = postRepository;
//   }


    @Override
    public List<PostDTO> getAllPosts() {
        return postRepository.findAll()
                .stream()
                .map(postEntity -> modelMapper.map(postEntity, PostDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public PostDTO createNewPost(PostDTO inputPost) {

        PostEntity postEntity = modelMapper.map(inputPost, PostEntity.class);
        return modelMapper.map(postRepository.save(postEntity), PostDTO.class);
    }

    @Override
    public PostDTO getPostById(Long postId) {

        PostEntity postEntity = postRepository
                .findById(postId)
                .orElseThrow(()-> new ResourceNotFoundException("post not found with Id:" + postId));
        return modelMapper.map(postEntity, PostDTO.class);
    }
}
