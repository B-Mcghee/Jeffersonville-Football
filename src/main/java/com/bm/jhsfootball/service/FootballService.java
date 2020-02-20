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

    public User addUser(User user) {
        footballDao.addUser(user);
        return user;
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
}
