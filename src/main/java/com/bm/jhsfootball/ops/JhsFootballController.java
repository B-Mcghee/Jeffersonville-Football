package com.bm.jhsfootball.ops;

import com.bm.jhsfootball.dto.User;
import com.bm.jhsfootball.service.FootballServiceImpl;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Scanner;

@Controller
public class JhsFootballController {

    FootballServiceImpl service = new FootballServiceImpl();

    Scanner userIO = new Scanner(System.in);
    public User createUser(){
        User newUser = new User(1, "b", "m", "1234", "bmac", "bmcghee", new ArrayList<>(), new ArrayList<>());

         User added = service.addUser(newUser);

        return added;
    }
}
