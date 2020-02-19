package com.bm.jhsfootball.dao;

import com.bm.jhsfootball.dto.User;

import java.util.List;

public interface JhsFootballDao {
    User addUser(User user);
    User getUser(int userId);
    List<User> getAllUsers();
    void updateUser(int oldUserId, User newUser);
    void removeUser(int userId);
}
