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
    
    int addCategory(Category category);
    Optional<Category> getCategory(UUID categoryId);
    List<Category> getAllCategories();
    int updateCategory(UUID oldCategoryId, Category category);
    int removeCategory(UUID categoryId);

    default int insertCategory(User user){
        UUID id = UUID.randomUUID();
        return  insertUser(id, user);
    }
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

    int insertOrder(UUID id, Order order);
    Optional<Order> selectOrderById(UUID id);
    List<Order> getAllOrders();
    int updateOrder(UUID id, Order newOrder);
    int removeOrder(UUID id);

    default  int insertOrder(Order order){
        UUID id = UUID.randomUUID();
        return insertOrder(id, order);
    }
    /**
     *
     * Role
     *
     */

    int insertRole(UUID id, Role role);
    Optional<Role> selectRoleById(UUID roleId);
    List<Role> getAllRoles();
    int updateRole(UUID oldRoleId, Role newRole);
    int removeRole(UUID roleId);

    default int insertRole(Role role){
        UUID id = UUID.randomUUID();
        return  insertRole(id, role);
    }

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
    int insertInventory(UUID inventoryId, Inventory inventory);
    Optional<Inventory> getInventory(UUID inventoryId);
    List<Inventory> getAllInventory();
    int updateInventory(UUID oldInventoryId, Inventory newInventory);
    int removeInventory(UUID inventoryId);

    /**
     *
     * Image
     *
     */
    int insertImage(UUID id, Image image);
    Optional<Image> selectImageById(UUID imageId);
    List<Image> getAllImages();
    int updateImageById(UUID id, Image newImage);
    int removeImage(UUID id);

    default  int insertImage(Image image){
        UUID id = UUID.randomUUID();
        return insertImage(id, image);
    }


    
}
