package com.api.blog.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "posts")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@ApiModel(description="This is the Post Model!")
public class Posts {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "This represents unique id. It is auto increment.")
    private Integer Id;

    @Column(name = "title")
    private String title;

    @Column(name="body")
    private String body;

    @Column(name="userid")
    private Integer userid;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userid", insertable = false, updatable = false)
    @Fetch(FetchMode.JOIN)
    @JsonIgnore
    private User user;


    public Integer getId() { return Id;}

    public String getTitle() { return title;}
    public void setTitle(String title) {this.title= title;}

    public String getBody() { return body;}
    public void setBody(String body) {this.body = body;}

    public User getUser(){return user;}

    public void setId(Integer id) {
        this.Id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }
}