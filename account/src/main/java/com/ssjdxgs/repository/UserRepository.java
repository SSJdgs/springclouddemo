package com.ssjdxgs.repository;

import com.ssjdxgs.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    public User login(String username,String password);
}
