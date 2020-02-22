package com.bm.jhsfootball.api;

import com.bm.jhsfootball.model.Item;
import com.bm.jhsfootball.service.FootballService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/redpride")
@RestController
public class ItemController {

    private final FootballService service;


    @Autowired
    public ItemController(FootballService service) {
        this.service = service;
    }

    /**
     *
     * Items
     *
     */
    @PostMapping(path = "/item")
    public void addItem(@RequestBody Item item){
        service.insertItem(item);
    }

    @GetMapping(path = "/item")
    public List<Item> getAllItems(){
        return service.getAllItems();
    }

    @GetMapping(path = "/item/{id}")
    public Item getItemById(@PathVariable("id") UUID id){
        return service.getItemById(id)
                .orElse(null);
    }

    @PutMapping(path = "item/{id}")
    public void updateItem(@PathVariable("id")UUID id, @RequestBody Item item){
        service.updateItem(id, item);
    }

    @DeleteMapping(path = "/item/{id}")
    public void removeItem(@PathVariable("id")UUID id){
        service.removeItem(id);
    }




}
