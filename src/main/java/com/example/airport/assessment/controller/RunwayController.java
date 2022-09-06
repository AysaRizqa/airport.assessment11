package com.example.airport.assessment.controller;

import com.example.airport.assessment.service.AirportsService;
import com.example.airport.assessment.service.RunWayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RunwayController {
    @Autowired
    private RunWayService rs;

    @RequestMapping(path = "runways")
    public void setData(){
        rs.saveRunwayData();
    }
}
