package com.bm.jhsfootball.dao;

import com.bm.jhsfootball.model.*;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class FootballDaoImpl implements FootballDao {

    private static Map<UUID,User> userMap = new HashMap<>();
    private static List<Item> itemList = new ArrayList<>();
    private Map<Integer, Order> orderMap = new HashMap<>();
    private Map<Integer, Role> roleMap = new HashMap<>();
    private Map<Integer, Image> imageMap = new HashMap<>();
    private Map<Integer, Category> categoryMap = new HashMap<>();
    private Map<Integer, Address> addressMap = new HashMap<>();
    private Map<Integer, Inventory> inventoryMap = new HashMap<>();


//    @Override
//    public User addUser(User user) {
//        int userId = user.getId();
//        return userList.add(user);
//    }
//
//    @Override
//    public User getUser(int userId) {
//        return userMap.get(userId);
//    }
//
//    @Override
//    public List<User> getAllUsers() {
//        return new ArrayList<>(userMap.values());
//    }
//
//    @Override
//    public void updateUser(int oldUserId, User newUser) {
//        userMap.replace(oldUserId, newUser);
//    }
//
//    @Override
//    public void removeUser(int userId) {
//        userMap.remove(userId);
//    }

    @Override
    public int insertUser(UUID id, User user) {
        userMap.put(id, user);
        return 1;
    }

    @Override
    public Optional<User> selectUserById(UUID id) {
        return userMap.values().stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(userMap.values());
    }

    @Override
    public int updateUserById(UUID id, User newUser) {
        userMap.replace(id, newUser);
        return 1;
    }

    @Override
    public int removeUser(UUID id) {
        Optional<User> userMaybe = selectUserById(id);
        if(userMaybe.isEmpty()){
            return 0;}
        itemList.remove(id);
        return 1;
    }

    /**
     * Item
     *
     * @param
     */




    @Override
    public List<Item> getAllItems() {
        return itemList;
    }

    @Override
    public Optional<Item> selectItemById(UUID id) {
        return itemList.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst();

    }

    @Override
    public int updateItemById(UUID id, Item newItem) {
        return 0;
    }

    @Override
    public int removeItem(UUID id) {
        Optional<Item> itemMaybe = selectItemById(id);
        if(itemMaybe.isEmpty()){
            return 0;}
        itemList.remove(id);
        return 1;

    }

//    @Override
//    public int updateItemById(UUID id, Item newItem) {
//        //itemList.re(oldItemId, newItem);
//        return 0;
//    }

//    @Override
//    public void removeItem(int itemId) {
//        itemList.remove(itemId);
//    }

    @Override
    public int insertItem(UUID id, Item item) {
        itemList.add(new Item(id, item.getCategoryId(), item.getTitle()));
        return 1;
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
     * Order
     *
     * @param order
     */
    @Override
    public Order addOrder(Order order) {
        int id = order.getId();
        return orderMap.put(id, order);
    }

    @Override
    public Order getOrder(int orderId) {
        return orderMap.get(orderId);
    }

    @Override
    public List<Order> getAllOrders() {
        return new ArrayList<>(orderMap.values());
    }

    @Override
    public void updateOrder(int oldOrderId, Order newOrder) {
        orderMap.replace(oldOrderId, newOrder);
    }

    @Override
    public void removeOrder(int orderId) {
        orderMap.remove(orderId);
    }

    /**
     * Role
     *
     * @param role
     */
    @Override
    public Role addRole(Role role) {
        int id = role.getId();
        return roleMap.put(id, role);
    }

    @Override
    public Role getRole(int roleId) {
        return roleMap.get(roleId);
    }

    @Override
    public List<Role> getAllRoles() {
        return new ArrayList<>(roleMap.values());
    }

    @Override
    public void updateRole(int oldRoleId, Role newRole) {
        roleMap.replace(oldRoleId, newRole);
    }

    @Override
    public void removeRole(int roleId) {
        roleMap.remove(roleId);
    }

    /**
     * Address
     *
     * @param address
     */
    @Override
    public Address addAddress(Address address) {
        int id = address.getId();
        return addressMap.put(id, address);
    }

    @Override
    public Address getAddress(int addressId) {
        return addressMap.get(addressId);
    }

    @Override
    public List<Address> getAllAddresses() {
        return new ArrayList<>(addressMap.values());
    }

    @Override
    public void updateAddress(int oldAddressId, Address newAddress) {
        addressMap.replace(oldAddressId, newAddress);
    }

    @Override
    public void removeAddress(int addressId) {
        addressMap.remove(addressId);
    }

    /**
     * Inventory
     *
     * @param inventory
     */
    @Override
    public Inventory addInventory(Inventory inventory) {
        int id = inventory.getId();
        return inventoryMap.put(id, inventory);
    }

    @Override
    public Inventory getInventory(int inventoryId) {
        return inventoryMap.get(inventoryId);
    }

    @Override
    public List<Inventory> getAllInventory() {
        return new ArrayList<>(inventoryMap.values());
    }

    @Override
    public void updateInventory(int oldInventoryId, Inventory newInventory) {
        inventoryMap.replace(oldInventoryId, newInventory);
    }

    @Override
    public void removeInventory(int inventoryId) {
        inventoryMap.remove(inventoryId);
    }

    /**
     * Image
     *
     * @param image
     */
    @Override
    public Image addImage(Image image) {
        int id = image.getId();
        return imageMap.put(id, image);
    }

    @Override
    public Image getImage(int imageId) {
        return imageMap.get(imageId);
    }

    @Override
    public List<Image> getAllImages() {
        return new ArrayList<>(imageMap.values());
    }

    @Override
    public void updateImage(int oldImageId, Image newImage) {
        imageMap.replace(oldImageId, newImage);
    }

    @Override
    public void removeImage(int imageId) {
        imageMap.remove(imageId);
    }




}
