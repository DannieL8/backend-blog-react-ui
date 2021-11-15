package com.api.blog.services;

import com.api.blog.dto.UserPostsDTO;
import com.api.blog.models.Posts;
import com.api.blog.models.User;
import com.api.blog.repositories.UserJpaRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserPostsMapService {

    @Autowired
    private UserJpaRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<UserPostsDTO> getUsersPosts(Integer id) {
        return (userRepository
                .findById(id))
                .stream()
                .map(this::convertToUserPostsDTOWithMapper)
                .collect(Collectors.toList());
    }
   public List<UserPostsDTO> getAllUsersPosts() {
        return (userRepository
                .findAll())
                .stream()
                .map(this::convertToUserPostsDTOWithMapper)
                .collect(Collectors.toList());
    }

    private UserPostsDTO convertToUserPostsDTO(User user) {
        UserPostsDTO userPostsDto = new UserPostsDTO();
        userPostsDto.setId(user.getId());
        userPostsDto.setName(user.getName());
        List<Posts> userPosts = user.getUserPosts();
        userPostsDto.setUserPosts(userPosts);
        return userPostsDto;
    }

    private UserPostsDTO convertToUserPostsDTOWithMapper(User user) {
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        UserPostsDTO userPosts = modelMapper
                .map(user, UserPostsDTO.class);
        return userPosts;
    }
}
