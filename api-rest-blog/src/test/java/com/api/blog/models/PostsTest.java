package com.api.blog.models;
import com.api.blog.controllers.PostsController;
import com.api.blog.dto.CreatePostDTO;
import com.api.blog.repositories.PostsJpaRepository;

import com.api.blog.services.CreatePostMapService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;;

@SpringBootTest
public class PostsTest {

    @Autowired
    private CreatePostMapService createPostMapService;

    @Autowired
    private PostsJpaRepository repository;

    @Autowired
    private PostsController postsController;


    @Test
    public void getAllPosts() throws Exception{
        List<Posts> posts = repository.findAll();
        assertTrue(posts.size()>0);
    }

    @Test
    public void getPostsPage() throws Exception{
        Page<Posts> page = repository.getPostsPage(PageRequest.of(1,6, Sort.by(Sort.Direction.DESC, "title")));
        assertTrue(page.getTotalElements()>0);
    }

    @Test
    @Transactional
    public void createPost() throws  Exception{
        CreatePostDTO postDTO = new CreatePostDTO();

        postDTO.setTitle("TEST TITLE");
        postDTO.setBody("BODY TEST");
        postDTO.setUserid(4);

        Posts newPost = createPostMapService.createPost(postDTO);

        assertEquals("TEST TITLE", newPost.getTitle());

        repository.deleteById(newPost.getId());
    }

    @Test
    public void getPosts() throws Exception {
        //Get all posts
    List<Posts>  posts =  postsController.getPosts("");

    assertTrue(posts.size() > 0 );
    }

    @Test
    public void getPostsByTitle() throws Exception {
        //Get all posts
    List<Posts>  posts =  postsController.getPosts("sunt");

    assertTrue(posts.size() > 0);
    }



}
