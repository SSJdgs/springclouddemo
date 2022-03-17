package com.ssjdxgs.feign;


import com.ssjdxgs.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@FeignClient(value = "user")
public interface UserFeign {

    @GetMapping("/user/findAll/{index}/{limit}")
    public List<User> findAll(@PathVariable("index") int index,
                              @PathVariable("limit") int limit);

    @GetMapping("/user/count")
    public int count();

    @DeleteMapping("/user/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id);


    @PostMapping("/user/save")
    public void save(User user);

    @GetMapping("/user/findById/{id}")
    public User findById(@PathVariable("id") long id);

    @PutMapping("/user/update")
    public void update(User user);


}
