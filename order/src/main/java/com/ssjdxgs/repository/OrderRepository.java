package com.ssjdxgs.repository;

import com.ssjdxgs.entity.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository {
    public void save(Order order);
    public List<Order> findAllByUid(int index,int limit,long uid);
    public int countByUid(long uid);
    public List<Order> findAll(int index,int limit);
    public int count();
    public void updateState(long id);
}
