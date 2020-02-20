package com.bm.jhsfootball.service;

import com.bm.jhsfootball.dao.FootballDaoImpl;
import com.bm.jhsfootball.dto.User;
import org.springframework.stereotype.Component;

@Component
public class FootballServiceImpl implements FootballServiceLayer {

    FootballDaoImpl FbDao = new FootballDaoImpl();

    @Override
    public User addUser(User user) {
         FbDao.addUser(user);
         return user;
    }
}
