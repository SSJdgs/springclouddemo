package com.ssjdxgs.controller;

import com.ssjdxgs.entity.Menu;
import com.ssjdxgs.entity.Order;
import com.ssjdxgs.entity.OrderVO;
import com.ssjdxgs.entity.User;
import com.ssjdxgs.feign.OrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/order")
public class OrderHandler {

    @Autowired
    private OrderFeign orderFeign;



    @GetMapping("/save/{mid}")
    public String save(@PathVariable("mid") long mid,
                       HttpSession session){
        User user = (User) session.getAttribute("user");
        Menu menu = new Menu();
        menu.setId(mid);
        Order order = new Order();
        order.setUser(user);
        order.setMenu(menu);
        orderFeign.save(order);
        return "order";
    }


    @GetMapping("/findAllByUid")
    @ResponseBody
    public OrderVO findAllByUid(@RequestParam("page") int page,
                                @RequestParam("limit") int limit,
                                HttpSession session){
        User user = (User) session.getAttribute("user");
        int index = (page-1)*limit;
        return orderFeign.findAllByUid(index,limit,user.getId());
    }

    @GetMapping("/findAll")
    @ResponseBody
    public OrderVO findAll(@RequestParam("page") int page,
                           @RequestParam("limit") int limit){
        int index = (page-1)*limit;
        return orderFeign.findAll(index,limit);
    }

    @GetMapping("/updateState/{id}")
    public String updateState(@PathVariable("id") long id){
        orderFeign.updateState(id);
        return "redirect:/menu/redirect/order_handler";
    }
}
