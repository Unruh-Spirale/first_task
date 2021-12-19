package com.example.first_task.repository.impl;

import com.example.first_task.entity.Item;
import com.example.first_task.repository.ItemRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemRepositoryImpl implements ItemRepository {

    private Map<String,Item> store = new HashMap<>();

    @Override
    public void addItem(String id, Item item) {
        store.put(id,item);
    }

    @Override
    public Item getItem(String id) {
        return store.get(id);
    }

}
