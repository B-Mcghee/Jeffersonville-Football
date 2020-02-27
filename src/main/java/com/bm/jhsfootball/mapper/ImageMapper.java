package com.bm.jhsfootball.mapper;

import com.bm.jhsfootball.model.Image;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ImageMapper implements RowMapper<Image> {

    @Override
    public Image mapRow(ResultSet rs, int index) throws SQLException {
        Image image = new Image();

        image.setId((rs.getInt("id")));
        image.setOriginalName(rs.getString("originalName"));
        image.setFileName(rs.getString("fileName"));
        image.setCategoryId(rs.getInt("categoryId"));
        image.setSize(rs.getString("size"));
        image.setExtension(rs.getString("extension"));




        return image;
    }

}