package com.bm.jhsfootball.dao;

import com.bm.jhsfootball.model.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("mySql")
public class FootballDataAcessService implements FootballDao{
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
    public Category addCategory(Category category) {
        return null;
    }

    @Override
    public Category getCategory(int categoryId) {
        return null;
    }

    @Override
    public List<Category> getAllCategories() {
        return null;
    }

    @Override
    public void updateCategory(int oldCategoryId, Category category) {

    }

    @Override
    public void removeCategory(int categoryId) {

    }

    /**
     * Item
     */
    @Override
    public List<Item> getAllItems() {
        return null;
    }

    @Override
    public Optional<Item> selectItemById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int updateItemById(UUID id, Item newItem) {
        return 0;
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
     * @param order
     */
    @Override
    public Order addOrder(Order order) {
        return null;
    }

    @Override
    public Order getOrder(int orderId) {
        return null;
    }

    @Override
    public List<Order> getAllOrders() {
        return null;
    }

    @Override
    public void updateOrder(int oldOrderId, Order newOrder) {

    }

    @Override
    public void removeOrder(int orderId) {

    }

    /**
     * Role
     *
     * @param role
     */
    @Override
    public Role addRole(Role role) {
        return null;
    }

    @Override
    public Role getRole(int roleId) {
        return null;
    }

    @Override
    public List<Role> getAllRoles() {
        return null;
    }

    @Override
    public void updateRole(int oldRoleId, Role newRole) {

    }

    @Override
    public void removeRole(int roleId) {

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
    public Inventory addInventory(Inventory inventory) {
        return null;
    }

    @Override
    public Inventory getInventory(int inventoryId) {
        return null;
    }

    @Override
    public List<Inventory> getAllInventory() {
        return null;
    }

    @Override
    public void updateInventory(int oldInventoryId, Inventory newInventory) {

    }

    @Override
    public void removeInventory(int inventoryId) {

    }

    /**
     * Image
     *
     * @param image
     */
    @Override
    public Image addImage(Image image) {
        return null;
    }

    @Override
    public Image getImage(int imageId) {
        return null;
    }

    @Override
    public List<Image> getAllImages() {
        return null;
    }

    @Override
    public void updateImage(int oldImageId, Image newImage) {

    }

    @Override
    public void removeImage(int imageId) {

    }
}
