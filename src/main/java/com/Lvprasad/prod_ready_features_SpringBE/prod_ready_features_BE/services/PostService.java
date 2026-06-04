package com.Lvprasad.prod_ready_features_SpringBE.prod_ready_features_BE.services;

import com.Lvprasad.prod_ready_features_SpringBE.prod_ready_features_BE.dto.PostDTO;

import java.util.List;

public interface PostService {

    List<PostDTO> getAllPosts();

    PostDTO createNewPost(PostDTO inputPost);

    PostDTO getPostById(Long postId);
}
