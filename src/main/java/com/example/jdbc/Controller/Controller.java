package com.example.jdbc.Controller;

import com.example.jdbc.Repository.JDBCRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    JDBCRepository jdbcRepository;

    public Controller(JDBCRepository jdbcRepository) {
        this.jdbcRepository = jdbcRepository;
    }

    @GetMapping("/products/fetch-product")
    public String getProductName(@RequestParam("name") String name) {
        return jdbcRepository.getProductName(name);
    }
}