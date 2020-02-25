package com.bm.jhsfootball.model;

import lombok.Data;

import java.util.UUID;

@Data
public class Role {
    private UUID id;
    private String type;
}
