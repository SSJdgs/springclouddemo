package com.ssjdxgs.feign;

import com.ssjdxgs.entity.Order;
import com.ssjdxgs.entity.OrderVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "order")
public interface OrderFeign {

    @PostMapping("/order/save")
    public void save(Order order);

    @GetMapping("/order/findAllByUid/{index}/{limit}/{uid}")
    public OrderVO findAllByUid(@PathVariable("index") int index,
                                @PathVariable("limit") int limit,
                                @PathVariable("uid") long uid);

    @GetMapping("/order/findAll/{index}/{limit}")
    public OrderVO findAll(@PathVariable("index") int index,
                           @PathVariable("limit") int limit);

    @GetMapping("/order/updateState/{id}")
    public OrderVO updateState(@PathVariable("id") long id);
}
