package com.theupliftproject.dailyshop.data.repository;

import com.theupliftproject.dailyshop.data.entity.Item;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

/**
 * A repository for Item entity.
 */
public interface ItemsRepository extends CrudRepository<Item, BigInteger> {
}
