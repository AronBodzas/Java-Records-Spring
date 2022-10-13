package com.codecool.service;

import com.codecool.repository.OrderedItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderedItemsService {

    private final OrderedItemsRepository orderedItemsRepository;

    @Autowired
    public OrderedItemsService(OrderedItemsRepository orderedItemsRepository) {
        this.orderedItemsRepository = orderedItemsRepository;
    }
}
