package com.bm.jhsfootball.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class Item {
    private int id;
    private int categoryId;
    private String title;
    private String size;
    private BigDecimal price;
    private String description;
    private List<Integer> images;

    public void itemImages(int imageId){
        this.images.add(imageId);
    }
}
