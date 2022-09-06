package com.example.airport.assessment.repository;

import com.example.airport.assessment.model.Runways;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RunwaysRepository extends CrudRepository<Runways,Integer> {
}
