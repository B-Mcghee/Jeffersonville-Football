package com.bm.jhsfootball.api;

import com.bm.jhsfootball.model.User;
import com.bm.jhsfootball.service.FootballService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;


@RequestMapping("/api/redpride")
@RestController
public class UserController {

    private FootballService service;

    @Autowired
    public UserController(FootballService service){
        this.service = service;
    }

    /**
     *
     * Users
     *
     */
    @PostMapping(path = "/user")
    public void addUser(@Valid @NotNull @RequestBody User user){
        service.insertUser(user);
    }

    @GetMapping(path = "/user")
    public List<User> getAllUsers(){
        return service.getAllUsers();
    }

    @GetMapping(path = "/user/{id}")
    public User selectUserById(@PathVariable UUID id){
        return service.getUserById(id)
                .orElse(null);
    }

    @PutMapping(path = "/user/{id}")
    public void updateUserById(@PathVariable UUID id, @Valid @NotNull @RequestBody User newUser){
        service.updateUserById(id, newUser);
    }

    @DeleteMapping(path = "/user/{id}")
    public void removeUserById(@PathVariable UUID id){
        service.removeUserById(id);
    }
}
