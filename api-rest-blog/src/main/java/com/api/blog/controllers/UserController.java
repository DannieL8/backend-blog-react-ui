package com.api.blog.controllers;

import com.api.blog.dto.UserPostsDTO;
import com.api.blog.models.User;
import com.api.blog.repositories.UserJpaRepository;
import com.api.blog.services.UserPostsMapService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/users")
@Api(tags = "USERS API")
public class UserController {

    @Autowired
    private UserJpaRepository repository;

    @Autowired
    private UserPostsMapService service;

    @GetMapping
    @ApiOperation(value="Get all users or only users that contain the name in param")
    @ApiResponses(value = {
            @ApiResponse(code=200, message="Successfully!"),
            @ApiResponse(code=401, message="Successfully!")
    })

    public List<User> getUsers (@ApiParam(value="Name parameter if you want to search users by name, it is not required!", required = false)@RequestParam(required = false) String name ){
        if(name != null){
        return repository.findByNameContains(name);
        }
        else {
            return repository.findAll();
        }
    }

    @GetMapping("{id}")
    public User getOneUser (@PathVariable("id") Integer id){
        return repository.getById(id);
    }

   // @RequestMapping("/test")
   // @GetMapping
    //public List<UserPostsDTO> getUsersPosts(@RequestParam(required = false) Integer id){
      //  if(id!= null){
       //     return service.getUsersPosts(id);
     //   }
      ///  else{
     ///       return service.getAllUsersPosts();
     //   }
   // }
}
