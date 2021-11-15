package com.api.blog.controllers;

import com.api.blog.dto.CreatePostDTO;
import com.api.blog.dto.PostUserDTO;
import com.api.blog.dto.UserPostsDTO;
import com.api.blog.models.Posts;
import com.api.blog.repositories.PostsJpaRepository;
import com.api.blog.services.CreatePostMapService;
import com.api.blog.services.PostUserMapService;
import io.swagger.annotations.*;
import org.apache.catalina.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.rmi.ServerException;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

@RestController
@CrossOrigin
@RequestMapping("/posts")

@Api(tags = "POSTS API")
public class PostsController {

   @Autowired
   private PostUserMapService postUserMapService;

   @Autowired
   private CreatePostMapService createPostMapService;

    @Autowired
    private PostsJpaRepository repository;

    @GetMapping
    public List<Posts> getPosts(@RequestParam(required = false) String title_like){
        if(title_like != null){
            return repository.findByTitleContains(title_like);
        }
        else if(title_like.contains("")){
            return repository.findAll();
        }
        else{
            return repository.findAll();
        }
    }

    @RequestMapping("/page")
    @GetMapping
    @ResponseHeader(name= "Posts page response test", description = "This is posts page response description")
    public Page<Posts> getPostsPage(@RequestParam(required = true) Integer page, Integer size){
        return repository.getPostsPage(PageRequest.of(page,size, Sort.by("id").ascending()));
    }

    @GetMapping("{id}")
    @ApiParam(name = "Path variable param.", defaultValue = "nulll")

    public Posts getPost(@PathVariable("id") Integer id){
     //   return "Id " + id;
     return repository.getById(id);
    }

    // Varianta cu query
    @RequestMapping("/userposts/{id}")
    @GetMapping
    public List<?> getUserPosts(@PathVariable Integer id) {
        return repository.getUserPosts(id);
    }

    // Varianta cu DTO
    @RequestMapping("/userandpost/{id}")
    @GetMapping
    public PostUserDTO getUserAndPostDto(@PathVariable Integer id) {
      return  postUserMapService.getPostAndUser(id);
    }


    @PostMapping(path = "/create", produces = "application/vnd.piomin.app-v1.2+json",consumes = "application/vnd.piomin.app-v1.2+json")
    @Deprecated
    @ApiOperation(value = "Create a post v1.2")
    public ResponseEntity<Posts> createPost(@RequestBody final CreatePostDTO newPost) throws ServerException {
        Posts post = createPostMapService.createPost(newPost);

        if(post == null ){
            String err = "Server error! Try again!";
            throw new ServerException(err);
        }
        else{
            return new ResponseEntity<Posts>(post, HttpStatus.CREATED);
        }
    }

    @PostMapping(path = "/create/v1.3", produces = "application/vnd.piomin.app-v1.3+json",consumes = "application/vnd.piomin.app-v1.3+json")
    @ApiOperation(value = "Create a post v1.3")
    public ResponseEntity<Posts> createPostV13(@RequestBody final CreatePostDTO newPost) throws ServerException {
        Posts post = createPostMapService.createPost2(newPost);

        if(post == null ){
            String err = "Server error! Try again!";
            throw new ServerException(err);
        }
        else{
            return new ResponseEntity<Posts>(post, HttpStatus.CREATED);
        }
    }

    @PutMapping(path = "/update")
    public ResponseEntity<String> updatePost(@RequestBody final Posts updatePost)  {
        String message = "";
        Posts post = repository.getById(updatePost.getId());

        if(post != null){
            post.setBody(updatePost.getBody());
            post.setTitle(updatePost.getTitle());
            repository.save(post);
            message = "I have found post with title: " + post.getTitle() + " and the id of the post is: " + post.getId();
        }
        else{
            message = "Nothing found";
        }

        return new ResponseEntity<String>(message, HttpStatus.OK);
    }

}
