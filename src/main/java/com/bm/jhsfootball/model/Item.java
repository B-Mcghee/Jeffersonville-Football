package com.bm.jhsfootball.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Data


public class Item {
    private UUID id;
    private int categoryId;
    private String title;
    private String size;
    private BigDecimal price;
    private String description;
    private List<Integer> images;

    public Item(@JsonProperty("id") UUID id,
                @JsonProperty("categoryId") int categoryId,
                @JsonProperty("title") String title) {
        this.id = id;
        this.categoryId = categoryId;
        this.title = title;
    }


//    public void itemImages(int imageId){
//        this.images.add(imageId);
//    }
}
