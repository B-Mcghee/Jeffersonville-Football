package com.bm.jhsfootball.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String password;
    private String userName;
    private String email;
    private List<Role> permissions;
    private List<Order> orders;

    public void addRoles(Role role){
        this.permissions.add(role);
    }

    public void previousOrders(Order order){
        this.orders.add(order);
    }
}
