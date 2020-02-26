package com.bm.jhsfootball.model;

import lombok.Data;

@Data
public class Image {
    private int id;
    private String originalName;
    private String fileName;
    private int categoryId;
    private String size;
    private String extension;


}
