package com.company.search.repository;

import com.company.search.database.Item;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ItemsRepository  extends CrudRepository<Item, Long>{
    List<Item> findByName(String name);
}
