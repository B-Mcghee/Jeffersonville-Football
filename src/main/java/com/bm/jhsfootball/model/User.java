package com.bm.jhsfootball.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data

public class User {
    private UUID id;
    private String firstName;
    private String lastName;
    private String password;
    private String username;
    private String email;
    private List<Role> permissions;
    private List<Order> orders;

    public User(@JsonProperty("id")UUID id,
                @JsonProperty("firstName")String firstName,
                @JsonProperty("lastName")String lastName,
                @JsonProperty("password")String password,
                @JsonProperty("username")String username,
                @JsonProperty("email")String email,
                @JsonProperty("permissions")List<Role> permissions,
                @JsonProperty("orders")List<Order> orders) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.username = username;
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
