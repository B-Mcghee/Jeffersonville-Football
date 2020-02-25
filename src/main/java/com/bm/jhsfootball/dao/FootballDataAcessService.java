package com.bm.jhsfootball.dao;

import com.bm.jhsfootball.mapper.ItemMapper;
import com.bm.jhsfootball.model.*;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("mySql")
public class FootballDataAcessService implements FootballDao{

    @Getter
    JdbcTemplate heySql;

    @Autowired
    public FootballDataAcessService(JdbcTemplate heySql) {
        this.heySql = heySql;
    }

    @Override
    public int insertUser(UUID id, User user) {
        return 0;
    }

    @Override
    public Optional<User> selectUserById(UUID id) {
        return Optional.empty();
    }

    @Override
    public List<User> getAllUsers() {
        return List.of(new User(UUID.randomUUID(), " b",
                "test", "db",
                "psw", "email",
                new ArrayList<>(), new ArrayList<>() ));

    }

    @Override
    public int updateUserById(UUID id, User newUser) {
        return 0;
    }

    @Override
    public int removeUser(UUID id) {
        return 0;
    }


    /**
     * Category
     *
     * @param category
     */
    @Override
    public int addCategory(Category category) {
        return 0;
    }

    @Override
    public Optional<Category> getCategory(UUID categoryId) {
        return null;
    }

    @Override
    public List<Category> getAllCategories() {
        return null;
    }

    @Override
    public int updateCategory(UUID id, Category category) {
        return 0;
    }

    @Override
    public int removeCategory(UUID categoryId) {
        return 0;
    }

    /**
     * Item
     */
    @Override
    public List<Item> getAllItems() {
        final String GET_ALL_ITEMS = "select * from items";
        return heySql.query(GET_ALL_ITEMS,new ItemMapper() );

    }

    @Override
    public Optional<Item> selectItemById(UUID id) {
        final String SELECT_ITEM = "select * from items";
        return heySql.query(SELECT_ITEM, new ItemMapper())
                .stream()
                .filter(item -> item.getId().equals(id)).findFirst();
    }

    @Transactional
    @Override
    public int updateItemById(UUID id, Item newItem) {
        final String UPDATE_ITEM = "update items set " +
                "category_id = ?," +
                "title = ?," +
                "size = ?, " +
                "price = ?," +
                "description = ? " +
                "where id = ?";
        heySql.update(UPDATE_ITEM, newItem.getCategoryId(), newItem.getTitle(), newItem.getSize(), newItem.getPrice(), newItem.getDescription(), id.toString());
        return 1;


    }

    @Override
    public int removeItem(UUID id) {
        return 0;
    }

    @Override
    public int insertItem(UUID id, Item item) {
        return 0;
    }

    /**
     * Order
     *
     * @param id
     * @param order
     */
    @Override
    public int insertOrder(UUID id, Order order) {
        return 0;
    }

    @Override
    public Optional<Order> selectOrderById(UUID id) {
        return Optional.empty();
    }

    @Override
    public List<Order> getAllOrders() {
        return null;
    }

    @Override
    public int updateOrder(UUID id, Order newOrder) {
        return 0;
    }

    @Override
    public int removeOrder(UUID id) {
        return 0;
    }

    /**
     * Role
     *
     * @param role
     */
    @Override
    public int insertRole(UUID id, Role role) {
        return 0;
    }

    @Override
    public Optional<Role> selectRoleById(UUID roleId) {
        return null;
    }

    @Override
    public List<Role> getAllRoles() {
        return null;
    }

    @Override
    public int updateRole(UUID oldRoleId, Role newRole) {
        return 0;
    }

    @Override
    public int removeRole(UUID roleId) {
        return 0;
    }

    /**
     * Address
     *
     * @param address
     */
    @Override
    public Address addAddress(Address address) {
        return null;
    }

    @Override
    public Address getAddress(int addressId) {
        return null;
    }

    @Override
    public List<Address> getAllAddresses() {
        return null;
    }

    @Override
    public void updateAddress(int oldAddressId, Address newAddress) {

    }

    @Override
    public void removeAddress(int addressId) {

    }

    /**
     * Inventory
     *
     * @param inventory
     */
    @Override
    public int insertInventory(UUID id, Inventory inventory) {
        return 0;
    }

    @Override
    public Optional<Inventory> getInventory(UUID inventoryId) {
        return null;
    }

    @Override
    public List<Inventory> getAllInventory() {
        return null;
    }

    @Override
    public int updateInventory(UUID oldInventoryId, Inventory newInventory) {
        return 0;
    }

    @Override
    public int removeInventory(UUID inventoryId) {
        return 0;
    }

    /**
     * Image
     *
     * @param id
     * @param image
     */
    @Override
    public int insertImage(UUID id, Image image) {
        return 0;
    }

    /**
     * Image
     *
     * @param image
     */
    @Override
    public int insertImage(Image image) {
        return 0;
    }

    @Override
    public Optional<Image> selectImageById(UUID imageId) {
        return null;
    }

    @Override
    public List<Image> getAllImages() {
        return null;
    }

    @Override
    public int updateImageById(UUID oldImageId, Image newImage) {
        return 0;
    }

    @Override
    public int removeImage(UUID imageId) {
        return 0;
    }
}
