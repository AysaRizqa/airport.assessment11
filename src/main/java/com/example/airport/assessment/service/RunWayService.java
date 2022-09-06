package com.example.airport.assessment.service;

import com.example.airport.assessment.model.Countries;
import com.example.airport.assessment.model.Runways;
import com.example.airport.assessment.repository.CountriesRepository;
import com.example.airport.assessment.repository.RunwaysRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
@Service
public class RunWayService {
    @Autowired
    private RunwaysRepository runWay;

    String line="";

    public void saveRunwayData() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src\\runways.csv"));
            while ((line = br.readLine())!=null) {
                String[] data = line.split(",");
                Runways c = new Runways();
                c.setAirport_re(data[1]);
                c.setAirport_ident(data[2]);
                c.setLength_ft(data[3]);
                c.setWidth_fr(data[4]);
                c.setSurface (data[5]);
                c.setLighted(data[6]);
                c.setClosed(data[7]);
               // c.setLe_ident(data[8]);



                runWay.save(c);



            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
