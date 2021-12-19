package com.example.first_task.repository;

import com.example.first_task.entity.Item;

import java.util.Map;

public interface ItemRepository {
    void addItem(String id, Item item);
    Item getItem(String id);
}
