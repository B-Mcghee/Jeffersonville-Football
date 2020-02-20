package com.bm.jhsfootball.api;

import com.bm.jhsfootball.model.Item;
import com.bm.jhsfootball.service.FootballService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/redpride/item")
@RestController
public class JhsFootballController {

    private final FootballService service;

    @Autowired
    public JhsFootballController(FootballService service) {
        this.service = service;
    }

    @PostMapping
    public void addItem(@RequestBody Item item){
        service.insertItem(item);
    }

    @GetMapping
    public List<Item> getAllItems(){
        return service.getAllItems();
    }

    @GetMapping(path = "{id}")
    public Item getItemById(@PathVariable("id") UUID id){
        return service.getItemById(id)
                .orElse(null);
    }
}
