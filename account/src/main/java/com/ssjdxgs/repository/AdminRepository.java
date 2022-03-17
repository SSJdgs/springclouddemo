package com.ssjdxgs.repository;

import com.ssjdxgs.entity.Admin;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository {
    public Admin login(String username, String password);
}
