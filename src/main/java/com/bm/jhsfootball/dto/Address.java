package com.bm.jhsfootball.dto;

import lombok.Data;

@Data
public class Address {
    private int id;
    private int userId;
    private String street;
    private String city;
    private String state;
    private int zip;
    private String country;
    private String phoneNumber;

}
