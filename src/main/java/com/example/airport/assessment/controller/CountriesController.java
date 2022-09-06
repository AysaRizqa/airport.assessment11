package com.example.airport.assessment.controller;

import com.example.airport.assessment.model.Countries;
import com.example.airport.assessment.repository.CountriesRepository;
import com.example.airport.assessment.service.CountriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountriesController {

    @Autowired
    private CountriesService cs;
    private CountriesRepository d;


    @RequestMapping(path = "get")
    public void setData() {
        cs.saveCountriesData();
    }


    @RequestMapping("g23")
    public String set() {
        return "hi";
    }
}