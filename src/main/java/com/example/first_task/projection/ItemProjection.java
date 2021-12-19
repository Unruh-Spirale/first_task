package com.example.first_task.projection;

import com.example.first_task.entity.Item;
import com.example.first_task.query.GetItemQuery;
import com.example.first_task.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ItemProjection {

    private final ItemRepository itemRepository;

    public Item handle(GetItemQuery query){
        return this.itemRepository.getItem(query.getId());
    }
}
