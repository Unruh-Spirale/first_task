package com.example.first_task.controller;

import com.example.first_task.entity.Item;
import com.example.first_task.service.ItemQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/items")
@RequiredArgsConstructor
public class ItemQueryController {

    private final ItemQueryService service;

    @GetMapping("/{itemId}")
    public Item getItem(@PathVariable("itemId") String itemId){
        return service.getItem(itemId);
    }
}
