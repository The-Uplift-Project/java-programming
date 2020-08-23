package com.theupliftproject.dailyshop.web;

import com.theupliftproject.dailyshop.data.entity.Item;
import com.theupliftproject.dailyshop.logic.dto.exception.NoItemsExistsException;
import com.theupliftproject.dailyshop.logic.service.InventoryManagementService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * A controller for inventory management.
 */
@RestController
@RequestMapping("/api/inventory-management")
public class InventoryController {
    public static final Logger LOGGER = LoggerFactory.getLogger(InventoryController.class);

    private final InventoryManagementService inventoryManagementService;

    @Autowired
    public InventoryController(InventoryManagementService inventoryManagementService) {
        this.inventoryManagementService = inventoryManagementService;
    }

    @GetMapping
    @RequestMapping("/items")
    public List<Item> getAllItems(@RequestParam(name = "page") int page, @RequestParam(name = "size") int size){
        LOGGER.info("Inside getAllItems");
        List<Item> items = this.inventoryManagementService.getAllItems(page, size);
        if(items != null && !items.isEmpty()){
            LOGGER.info("Returning Items..");
            return items;
        }
        else{
            LOGGER.info("No items exist..");
            throw new NoItemsExistsException();
        }
    }
}
