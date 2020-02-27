package com.bm.jhsfootball.mapper;

import com.bm.jhsfootball.model.Item;
import org.springframework.jdbc.core.RowMapper;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class ItemMapper implements RowMapper<Item> {

    @Override
    public Item mapRow(ResultSet rs, int index) throws SQLException {
        Item item = new Item();
        item.setId(rs.getInt("id"));
        item.setItemSerial(UUID.fromString(rs.getString("itemSerial")));
        item.setCategoryId(rs.getInt("category_id"));
        item.setTitle(rs.getString("title"));
        item.setSize(rs.getString("size"));
        item.setPrice(new BigDecimal(rs.getString("price").stripLeading()));
        item.setDescription(rs.getString("description"));




        return item;
    }

}
