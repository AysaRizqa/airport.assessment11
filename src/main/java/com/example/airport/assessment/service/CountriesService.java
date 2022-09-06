package com.example.airport.assessment.service;

import com.example.airport.assessment.model.Countries;
import com.example.airport.assessment.repository.CountriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sound.sampled.Line;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
@Service
public class CountriesService {
    @Autowired
    private CountriesRepository countries;

    String line="";

    public void saveCountriesData() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src\\countries.csv"));
            while ((line = br.readLine())!=null) {
                String[] data = line.split(",");
                Countries c = new Countries();
                for (String index : data)
                {
                c.setCode(data[1]);
                c.setName(data[2]);
                c.setContinent(data[3]);
                c.setWikipedia_link(data[4]);

                countries.save(c);}



            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}