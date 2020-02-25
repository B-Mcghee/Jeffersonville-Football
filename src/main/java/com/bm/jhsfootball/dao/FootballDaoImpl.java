package com.bm.jhsfootball.dao;

import com.bm.jhsfootball.model.*;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("inMemory")
public class FootballDaoImpl implements FootballDao {

    private static Map<UUID,User> userMap = new HashMap<>();
    private static List<Item> itemList = new ArrayList<>();
    private static Map<UUID, Order> orderMap = new HashMap<>();
    private static Map<UUID, Role> roleMap = new HashMap<>();
    private static Map<UUID, Image> imageMap = new HashMap<>();
    private static Map<UUID, Category> categoryMap = new HashMap<>();
    private static Map<UUID, Address> addressMap = new HashMap<>();
    private static Map<UUID, Inventory> inventoryMap = new HashMap<>();


    @Override
    public int insertUser(UUID id, User user) {
        user.setId(id);
        userMap.put(id, user);
        return 1;
    }

    @Override
    public Optional<User> selectUserById(UUID id) {
        return userMap.values()
                .stream()
                .filter(user -> user.getId()
                        .equals(id))
                .findFirst();
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(userMap.values());
    }

    @Override
    public int updateUserById(UUID id, User newUser) {
             return selectUserById(id).map(user -> {
                 boolean flag = userMap.containsKey(id);
                 if(flag){
                     userMap.replace(id, newUser);
                     return 1;
                 }
                 return 0;
             }).orElse(0);

    }

    @Override
    public int removeUser(UUID id) {
        Optional<User> userMaybe = selectUserById(id);
        if(userMaybe.isEmpty()){
            return 0;}
        userMap.remove(id);
        return 1;
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
    public int updateCategory(UUID oldCategoryId, Category category) {
        return 0;
    }

    @Override
    public int removeCategory(UUID categoryId) {
        return 0;
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
        return selectItemById(id)
                .map(i -> {
                    int itemIndex = itemList.indexOf(newItem);
                    if (itemIndex >= 0){
                        itemList.set(itemIndex, newItem);
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);

    }

    @Override
    public int removeItem(UUID id) {
        Optional<Item> itemMaybe = selectItemById(id);
        if(itemMaybe.isEmpty()){
            return 0;}
        itemList.remove(id);
        return 1;

    }



    @Override
    public int insertItem(UUID id, Item item) {
        itemList.add(new Item(id, item.getCategoryId(), item.getTitle(), item.getSize(), item.getPrice(), item.getDescription()));
        return 1;
    }


    /**
     * Category
     *
     * @param category
     */
//    @Override
//    public Category addCategory(Category category) {
//        int id = category.getId();
//        return categoryMap.put(id, category);
//    }
//
//    @Override
//    public Category getCategory(int categoryId) {
//        return categoryMap.get(categoryId);
//    }
//
//    @Override
//    public List<Category> getAllCategories() {
//        return new ArrayList<>(categoryMap.values());
//    }
//
//    @Override
//    public void updateCategory(UUID oldCategoryId, Category category) {
//        categoryMap.replace(oldCategoryId, category);
//    }
//
//    @Override
//    public void removeCategory(int categoryId) {
//        categoryMap.remove(categoryId);
//    }

    /**
     * Order
     *
     * @param
     */
    @Override
    public int insertOrder(UUID id, Order order) {
        return 0;
    }

    @Override
    public Optional<Order> selectOrderById(UUID id) {
        return orderMap.values()
                .stream()
                .filter(order -> order.getId()
                        .equals(id))
                .findFirst();

    }

    @Override
    public List<Order> getAllOrders() {
        return new ArrayList<>(orderMap.values());
    }

    @Override
    public int updateOrder(UUID id, Order newOrder) {
        Optional<Order> oldOrder = selectOrderById(id);
        return oldOrder.map(order -> {
            if (orderMap.containsKey(id)){
                orderMap.replace(id, newOrder);
                return 1;
            } return 0;
                }
        ).stream().findFirst().orElse(0);
    }

    @Override
    public int removeOrder(UUID id) {
        Optional<Order> orderMaybe = selectOrderById(id);
        if(orderMaybe.isPresent()){
            orderMap.remove(id);
            return 1;
        }return 0;
    }

    /**
     * Role
     *
     * @param role
     */
    @Override
    public int insertRole(UUID id, Role role) {
        roleMap.put(id, role);
        return 1;
    }

    @Override
    public Optional<Role> selectRoleById(UUID roleId) {
        return roleMap.values().stream()
                .filter(role -> role.getId().equals(roleId))
                .findFirst();
    }

    @Override
    public List<Role> getAllRoles() {
        return new ArrayList<>(roleMap.values());
    }

    @Override
    public int updateRole(UUID oldRoleId, Role newRole) {
        Optional<Role> oldRole = selectRoleById(oldRoleId);
            return oldRole.map(role -> {
                if (roleMap.containsKey(oldRoleId)) {
                    roleMap.replace(oldRoleId, newRole);
                    return 1;
                }return 0; }
                ).stream().findFirst().orElse(0);
    }

    @Override
    public int removeRole(UUID roleId) {
        Optional<Role> roleMaybe = selectRoleById(roleId);

            if (roleMaybe.isPresent()){
                roleMap.remove(roleId);
                return 1;
            } return 0;

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
     * Role
     *
     * @param role
     */
//    @Override
//    public Role addRole(Role role) {
//        int id = role.getId();
//        return roleMap.put(id, role);
//    }
//
//    @Override
//    public Role getRole(int roleId) {
//        return roleMap.get(roleId);
//    }
//
//    @Override
//    public List<Role> getAllRoles() {
//        return new ArrayList<>(roleMap.values());
//    }
//
//    @Override
//    public void updateRole(int oldRoleId, Role newRole) {
//        roleMap.replace(oldRoleId, newRole);
//    }
//
//    @Override
//    public void removeRole(int roleId) {
//        roleMap.remove(roleId);
//    }

    /**
     * Address
     *
     * @param address
     */
//    @Override
//    public Address addAddress(Address address) {
//        int id = address.getId();
//        return addressMap.put(id, address);
//    }
//
//    @Override
//    public Address getAddress(int addressId) {
//        return addressMap.get(addressId);
//    }
//
//    @Override
//    public List<Address> getAllAddresses() {
//        return new ArrayList<>(addressMap.values());
//    }
//
//    @Override
//    public void updateAddress(int oldAddressId, Address newAddress) {
//        addressMap.replace(oldAddressId, newAddress);
//    }
//
//    @Override
//    public void removeAddress(int addressId) {
//        addressMap.remove(addressId);
//    }

    /**
     * Inventory
     *
     * @param inventory
     */
//    @Override
//    public Inventory addInventory(Inventory inventory) {
//        int id = inventory.getId();
//        return inventoryMap.put(id, inventory);
//    }
//
//    @Override
//    public Inventory getInventory(int inventoryId) {
//        return inventoryMap.get(inventoryId);
//    }
//
//    @Override
//    public List<Inventory> getAllInventory() {
//        return new ArrayList<>(inventoryMap.values());
//    }
//
//    @Override
//    public void updateInventory(int oldInventoryId, Inventory newInventory) {
//        inventoryMap.replace(oldInventoryId, newInventory);
//    }
//
//    @Override
//    public void removeInventory(int inventoryId) {
//        inventoryMap.remove(inventoryId);
//    }
    /**
     * Image
     *
     * @param
     */




    @Override
    public List<Image> getAllImages() {
        return new ArrayList<>(imageMap.values());
    }

    @Override
    public Optional<Image> selectImageById(UUID id) {
        return imageMap.values().stream()
                .filter(i -> i.getId()
                        .equals(id))
                .findFirst();
    }

    @Override
    public int updateImageById(UUID id, Image newImage) {
        return selectImageById(id)
                .map(i -> {
                    if (imageMap.containsKey(id)) {
                        imageMap.replace(id, newImage);
                        return 1;
                    }
                return 0;
                })
                .orElse(0);
    }

    @Override
    public int removeImage(UUID id) {
        Optional<Image> imageMaybe = selectImageById(id);
        if(imageMaybe.isEmpty()){
            return 0;}
        imageMap.remove(id);
        return 1;

    }



    @Override
    public int insertImage(UUID id, Image image) {
        imageMap.put(id, image);
        return 1;
    }




}
