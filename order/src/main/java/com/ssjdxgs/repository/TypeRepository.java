package com.ssjdxgs.repository;

import com.ssjdxgs.entity.Type;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TypeRepository {
    public Type findById(long id);
}
