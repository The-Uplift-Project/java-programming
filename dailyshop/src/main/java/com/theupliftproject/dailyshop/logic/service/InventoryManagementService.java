package com.theupliftproject.dailyshop.logic.service;

import com.theupliftproject.dailyshop.data.entity.Item;
import com.theupliftproject.dailyshop.data.repository.ItemsRepository;
import com.theupliftproject.dailyshop.web.InventoryController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * A service for managing the daily shop inventory.
 */
@Service
public class InventoryManagementService {
    public static final Logger LOGGER = LoggerFactory.getLogger(InventoryManagementService.class);
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
    public List<Item> getAllItems(int page, int size){
        LOGGER.info("Inside getAllItems.");
        // with pagination
        Pageable pageable = PageRequest.of(page, size, Sort.by("name"));
        Page<Item> itemsPage = this.itemsRepository.findAll(pageable);
        // without pagination
//        List<Item> items = new ArrayList<>();
//        Iterable<Item> iterableItems = this.itemsRepository.findAll();
//        for(Item item : iterableItems){
//            items.add(item);
//        }
//        return items;
        return itemsPage.getContent();
    }
}
