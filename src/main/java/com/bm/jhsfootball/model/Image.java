package com.bm.jhsfootball.model;

import lombok.Data;

import java.util.UUID;

@Data
public class Image {
    private UUID id;
    private String originalName;
    private String fileName;
    private int categoryId;
    private String size;
    private String extension;


}
