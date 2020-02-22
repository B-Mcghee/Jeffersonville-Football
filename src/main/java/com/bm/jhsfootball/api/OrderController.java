package com.bm.jhsfootball.api;

import com.bm.jhsfootball.model.Order;
import com.bm.jhsfootball.service.FootballService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;


@RequestMapping("/api/redpride")
@RestController
public class OrderController {

    private FootballService service;

    @Autowired
    public OrderController(FootballService service){
        this.service = service;
    }

    /**
     *
     * Orders
     *
     */
    @PostMapping(path = "/order")
    public void addOrder(@Valid @NotNull @RequestBody Order order){
        service.insertOrder(order);
    }

    @GetMapping(path = "/order")
    public List<Order> getAllOrders(){
        return service.getAllOrders();
    }

    @GetMapping(path = "/order/{id}")
    public Order selectOrderById(@PathVariable UUID id){
        return service.getOrderById(id)
                .orElse(null);
    }

    @PutMapping(path = "/order/{id}")
    public void updateOrderById(@PathVariable UUID id, @Valid @NotNull @RequestBody Order newOrder){
        service.updateOrderById(id, newOrder);
    }

    @DeleteMapping(path = "/order/{id}")
    public void removeOrderById(@PathVariable UUID id){
        service.removeOrderById(id);
    }
}
