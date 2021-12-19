package com.example.first_task.service.impl;

import com.example.first_task.entity.Item;
import com.example.first_task.projection.ItemProjection;
import com.example.first_task.query.GetItemQuery;
import com.example.first_task.service.ItemQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemQueryServiceImpl implements ItemQueryService {

    private final ItemProjection itemProjection;

    @Override
    public Item getItem(String itemId){
        GetItemQuery query = new GetItemQuery(itemId);
        return itemProjection.handle(query);
    }
}
