package com.example.airport.assessment.repository;

import com.example.airport.assessment.model.Countries;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CountriesRepository extends CrudRepository<Countries,Integer> {
    Optional<Countries> findByCode(String code);
}
