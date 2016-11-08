package com.company.search.domain;

import com.company.search.database.Item;
public class SearchResults {
    Iterable<Item> items;

    public SearchResults(Iterable<Item> items) {
        this.items = items;
    }

    public Iterable<Item> getItems() {
        return items;
    }
}
