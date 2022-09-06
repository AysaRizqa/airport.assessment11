package com.example.airport.assessment.service;
import java.io.*;

import com.example.airport.assessment.model.Airports;
import com.example.airport.assessment.model.Countries;
import com.example.airport.assessment.model.Runways;
import com.example.airport.assessment.repository.AirportsRepository;
import com.example.airport.assessment.repository.CountriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
@Service

public class AirportsService {
    @Autowired
    private AirportsRepository Airport;

    String line="";

    public void saveAirportData() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src\\airports.csv"));
            while ((line = br.readLine())!=null) {
                String[] data = line.split(",");
                Airports a = new Airports();
                for (String index : data)
                {
                    a.setIdent(data[1]);
                    a.setType(data[2]);
                    a.setName(data[3]);
                    a.setLatitude_dag(data[4]);
                    a.setLongitude_(data[5]);
                    a.setElevation_ft(data[6]);
                    a.setContient(data[7]);
                    a.setIso_country(data[8]);

                    a.setIso_region(data[9]);
                    a.setMunicipality(data[10]);
                    a.setScheduled(data[11]);
                    a.setGps_code(data[12]);
                    a.setIata_code(data[13]);
                    a.setLocal_code(data[14]);
                    Airport.save(a);}



            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/*public class AirportsService {


    @Autowired
    private AirportsRepository airports;

    public void readMe() {

        String file = "";

        BufferedReader reader = null;
        String line = "";

        try {

            reader = new BufferedReader(new FileReader(file));

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");

                for (String index : data) {
                   Airports c = new Airports();
                    c.setIdent(data[1]);
                    c.setType(data[2]);
                    c.setName(data[3]);
                    c.setElevation_ft(data[5]);
                    c.setContinent(data[6]);
                    c.setIsoCountry(data[7]);
                    airports.save(c);
                }
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



   /*try{

        BufferedReader reader = new BufferedReader(new FileReader(file));
       while((line = reader.readLine()!=null )){
           String[] row = line.split(",");
           for(String index : row){
               System.out.println(index);
           }
           System.out.println();

       }

    }catch( Exception e){
    e.printStackTrace();
    }
    }


}*/