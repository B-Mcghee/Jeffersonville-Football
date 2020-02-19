package com.bm.jhsfootball.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class Order {
    private int id;
    private int userId;
    private int status;
    private BigDecimal totalPrice;
    private List<Integer> items;

}
