package com.bm.jhsfootball;

import com.bm.jhsfootball.ops.JhsFootballController;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FootballApp {
    public static void main(String[] args) {
        JhsFootballController controller = new JhsFootballController();
        System.out.println(controller.createUser().toString());
       // SpringApplication.run(FootballApp.class, args);

    }
}
