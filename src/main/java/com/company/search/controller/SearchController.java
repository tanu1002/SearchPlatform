package com.company.search.controller;

import com.company.search.database.Item;
import com.company.search.domain.SearchResults;
import com.company.search.repository.ItemsRepository;
import com.company.search.service.SearchService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class SearchController {

    @Resource
    SearchService searchService;

    @RequestMapping(value = "/health", method = RequestMethod.GET, produces = "application/json")
    public
    @ResponseBody
    String healthCheck() {
        return "{\"message\":[\"service is UP\"]}";
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
    public
    @ResponseBody
    SearchResults showMessage() {
        return searchService.getAll();
    }

    @RequestMapping(value = "/findByName/{name}", method = RequestMethod.GET, produces = "application/json")
    public
    @ResponseBody
    SearchResults showMessage(
            @PathVariable("name") String name) {

        return searchService.findByName(name);
    }

}
