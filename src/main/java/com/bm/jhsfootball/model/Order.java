package com.bm.jhsfootball.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Data
public class Order {
    private UUID id;
    private int userId;
    private int status;
    private BigDecimal totalPrice;
    private List<Integer> items;

    public void orderSummary(int itemId){
        this.items.add(itemId);
    }


}

