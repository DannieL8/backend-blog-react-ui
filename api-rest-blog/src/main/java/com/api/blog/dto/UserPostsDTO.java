package com.api.blog.dto;


import com.api.blog.models.Posts;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Id;
import java.util.List;

public class UserPostsDTO {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    // @JsonProperty("title")
   // private String title;

    //  @JsonProperty("body")
    //  private String body;

    private List<Posts> userPosts;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Posts> getUserPosts () {
        return userPosts;
    }

    public void setUserPosts(List<Posts> userPosts){
        this.userPosts = userPosts;
    }

   // public void setTitle(String title) {
  //      this.title = title;
  //  }

  //  public void setBody(String body) {
  //      this.body = body;
  //  }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

   // public String getTitle() {
   //     return title;
   // }

  //  public String getBody() {
  //      return body;
  //  }
}
