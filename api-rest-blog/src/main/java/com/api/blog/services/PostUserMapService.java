package com.api.blog.services;

import com.api.blog.dto.PostUserDTO;
import com.api.blog.models.Posts;
import com.api.blog.repositories.PostsJpaRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostUserMapService {
    @Autowired
    private PostsJpaRepository postsJpaRepository;

    @Autowired
    private ModelMapper modelMapper;

    public PostUserDTO getPostAndUser(Integer id){
       Posts post = postsJpaRepository.findById(id).get();
        PostUserDTO dto = convertToPostUserDTO(post);
        return dto;
    }

    private PostUserDTO convertToPostUserDTO(Posts post){
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        PostUserDTO postUser = modelMapper
                .map(post, PostUserDTO.class);
        return postUser;
    }
}
