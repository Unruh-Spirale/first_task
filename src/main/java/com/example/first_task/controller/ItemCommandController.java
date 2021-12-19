package com.example.first_task.controller;

import com.example.first_task.command.AddItemCommand;
import com.example.first_task.service.ItemCommandService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/items")
@RequiredArgsConstructor
public class ItemCommandController {

    private final ItemCommandService service;

    @PostMapping
    public void addItem(@RequestBody AddItemCommand command){
        service.addItem(command);
    }
}
