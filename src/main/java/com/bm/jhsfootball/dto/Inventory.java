package com.bm.jhsfootball.dto;

import lombok.Data;

import java.util.List;

@Data
public class Inventory {
    private int id;
    private List<Item> items;
    private int quanity;
    private int sold;


}
