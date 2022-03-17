package com.ssjdxgs.repository;

import com.ssjdxgs.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository {
    public List<User> findAll(int index,int limit);
    public int count();
    public User findById(long id);
    public void save(User user);
    public void update(User user);
    public void deleteById(long id);
}
