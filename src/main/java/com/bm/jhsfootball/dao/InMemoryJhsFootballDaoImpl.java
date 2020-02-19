package com.bm.jhsfootball.dao;

import com.bm.jhsfootball.dto.*;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository

public class InMemoryJhsFootballDaoImpl implements JhsFootballDao {
    private Map<Integer, User> userMap = new HashMap<>();
    private Map<Integer, Item> itemMap = new HashMap<>();
    private Map<Integer, Order> orderMap = new HashMap<>();
    private Map<Integer, Role> roleMap = new HashMap<>();
    private Map<Integer, Image> imageMap = new HashMap<>();
    private Map<Integer, Category> categoryMap = new HashMap<>();
    private Map<Integer, Address> addressMap = new HashMap<>();
    private Map<Integer, Inventory> inventoryMap = new HashMap<>();


    @Override
    public User addUser(User user) {
        int userId = user.getId();
        return userMap.put(userId, user);
    }

    @Override
    public User getUser(int userId) {
        return userMap.get(userId);
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(userMap.values());
    }

    @Override
    public void updateUser(int oldUserId, User newUser) {
        userMap.replace(oldUserId, newUser);
    }

    @Override
    public void removeUser(int userId) {
        userMap.remove(userId);
    }

    /**
     * Category
     *
     * @param category
     */
    @Override
    public Category addCategory(Category category) {
        int id = category.getId();
        return categoryMap.put(id, category);
    }

    @Override
    public Category getCategory(int categoryId) {
        return categoryMap.get(categoryId);
    }

    @Override
    public List<Category> getAllCategories() {
        return new ArrayList<>(categoryMap.values());
    }

    @Override
    public void updateCategory(int oldCategoryId, Category category) {
        categoryMap.replace(oldCategoryId, category);
    }

    @Override
    public void removeCategory(int categoryId) {
        categoryMap.remove(categoryId);
    }

    /**
     * Item
     *
     * @param item
     */
    @Override
    public Item addItem(Item item) {
        int id = item.getId();
        return itemMap.put(id, item);
    }

    @Override
    public Item getItem(int itemId) {
        return null;
    }

    @Override
    public List<Item> getAllItems() {
        return null;
    }

    @Override
    public void updateItem(int oldItemId, Item newItem) {

    }

    @Override
    public void removeItem(int itemId) {

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

    /**
     *
     *
     * Category
     *
     *
     */


}
