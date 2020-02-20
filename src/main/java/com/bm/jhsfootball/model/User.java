package com.bm.jhsfootball.model;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data

public class User {
    private UUID id;
    private String firstName;
    private String lastName;
    private String password;
    private String userName;
    private String email;
    private List<Role> permissions;
    private List<Order> orders;

    public User(UUID id, String firstName, String lastName, String password, String userName, String email, List<Role> permissions, List<Order> orders) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.userName = userName;
        this.email = email;
        this.permissions = permissions;
        this.orders = orders;
    }

    public void addRoles(Role role){
        this.permissions.add(role);
    }

    public void previousOrders(Order order){
        this.orders.add(order);
    }
}
