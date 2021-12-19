package com.example.first_task.service.impl;

import com.example.first_task.aggregate.ItemAggregate;
import com.example.first_task.command.AddItemCommand;
import com.example.first_task.service.ItemCommandService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemCommandServiceImpl implements ItemCommandService {

    private final ItemAggregate itemAggregate;

    @Override
    public void addItem(AddItemCommand command){
        itemAggregate.handleAddItemCommand(command);
    }
}
