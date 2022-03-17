package com.ssjdxgs.repository;

import com.ssjdxgs.entity.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository {
    public Menu findById(long id);
}
