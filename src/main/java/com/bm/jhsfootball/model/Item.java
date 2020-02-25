package com.bm.jhsfootball.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
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
                @JsonProperty("title") String title,
                @JsonProperty("size") String size,
                @JsonProperty("price") BigDecimal price,
                @JsonProperty("description") String description
                ) {
        this.id = id;
        this.categoryId = categoryId;
        this.title = title;
        this.size = size;
        this.price = price;
        this.description = description;
        this.images = new ArrayList<>();
    }


//    public void itemImages(int imageId){
//        this.images.add(imageId);
//    }
}
