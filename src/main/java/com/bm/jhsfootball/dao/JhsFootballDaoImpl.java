package com.bm.jhsfootball.dao;

import com.bm.jhsfootball.dto.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository

public class JhsFootballDaoImpl implements JhsFootballDao {
    private Map<Integer, User> userMap;

    @Override
    public User addUser(User user) {
        return null;
    }

    @Override
    public User getUser(int userId) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void removeUser(int userId) {

    }
}
