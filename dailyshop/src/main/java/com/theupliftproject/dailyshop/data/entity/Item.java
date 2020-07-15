package com.theupliftproject.dailyshop.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * A entity class which represents items being sold at dailyshop.
 */
@Entity
@Table(name="ITEMS")
public class Item {
    @Id
    @Column(name = "ITEM_ID")
    private int itemId;
    @Column(name = "NAME")
    private String name;
    @Column(name = "PRICE")
    private float price;
    @Column(name = "TOTAL_QUANTITY")
    private int totalQuantity;
    @Column(name = "DEFAULT_QUANTITY")
    private int defaultQuantity;
    @Column(name = "UNIT")
    private String unit;
    @Column(name = "CATEGORY")
    private String category;
    @Column(name = "BRAND")
    private String brand;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public int getDefaultQuantity() {
        return defaultQuantity;
    }

    public void setDefaultQuantity(int defaultQuantity) {
        this.defaultQuantity = defaultQuantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
