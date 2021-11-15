package com.api.blog.dto;


import com.fasterxml.jackson.annotation.JsonProperty;

public class PostUserDTO {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("body")
    private String body;

    @JsonProperty("title")
    private String title;

    @JsonProperty("userId")
    private Integer userId;

    @JsonProperty("username")
    private String username;

    @JsonProperty("name")
    private String name;

    @JsonProperty("email")
    private String email;

    public Integer getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public String getTitle() {
        return title;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
