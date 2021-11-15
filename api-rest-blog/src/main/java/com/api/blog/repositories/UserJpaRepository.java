package com.api.blog.repositories;

import com.api.blog.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserJpaRepository extends JpaRepository<User, Integer> {
    List<User> findByNameContains(String name);

}