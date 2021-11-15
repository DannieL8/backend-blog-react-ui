package com.api.blog.services;

import com.api.blog.dto.CreatePostDTO;
import com.api.blog.dto.PostUserDTO;
import com.api.blog.models.Posts;
import com.api.blog.repositories.PostsJpaRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatePostMapService {

    @Autowired
    private PostsJpaRepository postsJpaRepository;

    @Autowired
    private ModelMapper modelMapper;


    public Posts createPost(CreatePostDTO post) {
        Posts newPost = convertDtoToPost(post);
      return  postsJpaRepository.saveAndFlush(newPost);
    }

    public Posts createPost2(CreatePostDTO post) {
        Posts newPost = convertDtoToPost(post);
      return  postsJpaRepository.saveAndFlush(newPost);
    }



    private Posts convertDtoToPost(CreatePostDTO postDTO){
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        Posts post = modelMapper
                .map(postDTO, Posts.class);
        return post;
    }

}
