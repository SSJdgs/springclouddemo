package com.ssjdxgs.repository;

import com.ssjdxgs.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {
    public User findById(long id);
}
