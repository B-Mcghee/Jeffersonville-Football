package com.bm.jhsfootball.dto;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private int userId;
    private String firstName;
    private String lastName;
    private String password;
    private List<Role> permissions;

}
