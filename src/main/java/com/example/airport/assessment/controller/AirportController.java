package com.example.airport.assessment.controller;

import com.example.airport.assessment.model.Airports;
import com.example.airport.assessment.repository.AirportsRepository;
import com.example.airport.assessment.repository.CountriesRepository;
import com.example.airport.assessment.service.AirportsService;
import com.example.airport.assessment.service.CountriesService;
import com.example.airport.assessment.service.RunWayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class AirportController {

    @Autowired
    private AirportsService cs;



    @RequestMapping(path = "1234")
    public void setData() {
        cs.saveAirportData();
    }


    @RequestMapping("")
    public String set() {
        return "hi";
    }
}
    /*    @Autowired
        private AirportsService as;

        @PostMapping(path = "airports" )
        public void setData(){
            as.saveAirportsData();
        }

        @GetMapping("get")
        public String  getdata(){
            return "welcome";
        }

*/
