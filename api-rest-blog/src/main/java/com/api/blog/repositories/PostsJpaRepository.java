package com.api.blog.repositories;

import com.api.blog.models.Posts;
import com.api.blog.models.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsJpaRepository extends JpaRepository<Posts,Integer> {
    List<Posts> findByTitleContains(String title);


    @Query("select p from Posts p")
    Page<Posts> getPostsPage(Pageable page);

    @Query("select new map(p.title as title, p.body as body , p.id as id)  from Posts p left join p.user u where u.id =:id")
    List<?> getUserPosts(Integer id);
}