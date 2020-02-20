package com.bm.jhsfootball.dao;

import com.bm.jhsfootball.model.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface FootballDao {
    int insertUser(UUID id, User user);
    Optional<User> selectUserById(UUID id);
    List<User> getAllUsers();
    int updateUserById(UUID id, User newUser);
    int removeUser(UUID id);


    default int insertUser(User user){
        UUID id = UUID.randomUUID();
        return  insertUser(id, user);
    }


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



    List<Item> getAllItems();
    Optional<Item> selectItemById(UUID id);
    int updateItemById(UUID id, Item newItem);
    int removeItem(UUID id);
    int insertItem(UUID id, Item item);

    default int insertItem(Item item){
        UUID id = UUID.randomUUID();
        return  insertItem(id, item);
    }
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
