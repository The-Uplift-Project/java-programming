package com.theupliftproject.dailyshop.logic.service;

import com.theupliftproject.dailyshop.data.entity.Item;
import com.theupliftproject.dailyshop.data.repository.ItemsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * A service for managing the daily shop inventory.
 */
@Service
public class InventoryManagementService {
    private final ItemsRepository itemsRepository;

    @Autowired
    public InventoryManagementService(ItemsRepository itemsRepository) {
        this.itemsRepository = itemsRepository;
    }

    /**
     * Get all the items from the daily shop inventory.
     *
     * @return list of items to being sold at daily shop
     */
    public List<Item> getAllItems(){
        List<Item> items = new ArrayList<>();
        Iterable<Item> iterableItems = this.itemsRepository.findAll();
        for(Item item : iterableItems){
            items.add(item);
        }
        return items;
    }
}
