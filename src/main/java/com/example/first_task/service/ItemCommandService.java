package com.example.first_task.service;

import com.example.first_task.command.AddItemCommand;

public interface ItemCommandService {
    void addItem(AddItemCommand command);
}
