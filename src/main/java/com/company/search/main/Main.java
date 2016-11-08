package com.company.search.main;

import com.company.search.controller.SearchController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;


public class Main {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SearchController.class, args);
    }
}
