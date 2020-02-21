package com.bm.jhsfootball.service;

import com.bm.jhsfootball.dao.FootballDao;
import com.bm.jhsfootball.model.Item;
import com.bm.jhsfootball.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class FootballService {

    private final FootballDao footballDao;

    public FootballService(FootballDao footballDao) {
        this.footballDao = footballDao;
    }

    public int insertUser(User user) {
        return footballDao.insertUser(user);

    }

    
    public List<Item> displayAllItems() {
        return footballDao.getAllItems();
    }

    
    public List<Item> displayByCategory(int categoryId) {
        return footballDao.getAllItems().stream()
                .filter(i -> i.getCategoryId() == i.getCategoryId())
                .collect(Collectors.toList());
    }

    
    public int insertItem(Item item) {
        return footballDao.insertItem(item);
    }

    public List<Item> getAllItems(){
        return footballDao.getAllItems();
    }

    public Optional<Item> getItemById(UUID id){
        return footballDao.selectItemById(id);
    }
    public void updateItem(UUID id, Item item) {
        footballDao.updateItemById(id, item);
    }

    public void removeItem(UUID id){
        footballDao.removeItem(id);
    }
    public List<User> getAllUsers() {
        return footballDao.getAllUsers();
    }

    public Optional<User> getUserById(UUID id) {
        return footballDao.selectUserById(id);
    }

    public void updateUserById(UUID id, User newUser){
        footballDao.updateUserById(id, newUser);
    }


}
