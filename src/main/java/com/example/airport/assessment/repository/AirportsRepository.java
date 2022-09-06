package com.example.airport.assessment.repository;

import com.example.airport.assessment.model.Airports;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportsRepository extends CrudRepository<Airports,Integer> {
}
