package com.bm.jhsfootball.dao;

import com.bm.jhsfootball.dto.*;

import java.util.List;

public interface FootballDao {
    User addUser(User user);
    User getUser(int userId);
    List<User> getAllUsers();
    void updateUser(int oldUserId, User newUser);
    void removeUser(int userId);

    /**
     *
     * Category
     *
     */
    
    Category addCategory(Category category);
    Category getCategory(int categoryId);
    List<Category> getAllCategories();
    void updateCategory(int oldCategoryId, Category category);
    void removeCategory(int categoryId);

    /**
     *
     * Item
     *
     */

    Item addItem(Item item);
    Item getItem(int itemId);
    List<Item> getAllItems();
    void updateItem(int oldItemId, Item newItem);
    void removeItem(int itemId);

    /**
     *
     * Order
     *
     */

    Order addOrder(Order order);
    Order getOrder(int orderId);
    List<Order> getAllOrders();
    void updateOrder(int oldOrderId, Order newOrder);
    void removeOrder(int orderId);

    /**
     *
     * Role
     *
     */

    Role addRole(Role role);
    Role getRole(int roleId);
    List<Role> getAllRoles();
    void updateRole(int oldRoleId, Role newRole);
    void removeRole(int roleId);

    /**
     *
     * Address
     *
     */
    Address addAddress(Address address);
    Address getAddress(int addressId);
    List<Address> getAllAddresses();
    void updateAddress(int oldAddressId, Address newAddress);
    void removeAddress(int addressId);

    /**
     *
     * Inventory
     *
     */
    Inventory addInventory(Inventory inventory);
    Inventory getInventory(int inventoryId);
    List<Inventory> getAllInventory();
    void updateInventory(int oldInventoryId, Inventory newInventory);
    void removeInventory(int inventoryId);

    /**
     *
     * Image
     *
     */
    Image addImage(Image image);
    Image getImage(int imageId);
    List<Image> getAllImages();
    void updateImage(int oldImageId, Image newImage);
    void removeImage(int imageId);
    
    
    
}
