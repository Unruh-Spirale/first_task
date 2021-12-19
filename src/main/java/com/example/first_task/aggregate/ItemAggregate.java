package com.example.first_task.aggregate;

import com.example.first_task.command.AddItemCommand;
import com.example.first_task.entity.Item;
import com.example.first_task.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ItemAggregate {

    private final ItemRepository itemRepository;

    public Item handleAddItemCommand(AddItemCommand command){
        Item item = new Item(command.getId(),command.getName());
        itemRepository.addItem(item.getId(), item);
        return item;
    }
}
