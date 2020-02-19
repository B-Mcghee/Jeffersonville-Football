package com.bm.jhsfootball.dao;

import com.bm.jhsfootball.dto.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository

public class JhsFootballDaoImpl implements JhsFootballDao {
    private Map<Integer, User> userMap = new HashMap<>();

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
}
