package com.company.search.service;

import com.company.search.database.Item;
import com.company.search.domain.SearchResults;
import com.company.search.repository.ItemsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SearchService {

    @Resource
    ItemsRepository itemsRepository;

    @Bean
    public CommandLineRunner demo() {
        return (args) -> {
            itemsRepository.save(new Item("Jack"));
            itemsRepository.save(new Item("Chloe"));
            itemsRepository.save(new Item("Kim"));
            itemsRepository.save(new Item("David"));
            itemsRepository.save(new Item("Michelle"));
            itemsRepository.save(new Item("Jack"));
        };
    }

    public SearchResults getAll() {
        Iterable<Item> itemList = itemsRepository.findAll();
        return new SearchResults(itemList);
    }

    public SearchResults findByName(String name) {
        Iterable<Item> itemList = itemsRepository.findByName(name);
        return new SearchResults(itemList);
    }
}
