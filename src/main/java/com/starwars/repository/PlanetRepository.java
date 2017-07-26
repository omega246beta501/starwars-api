package com.starwars.repository;

import com.starwars.model.Planet;
import com.starwars.model.PlanetOnlyNameAndPopulation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlanetRepository extends JpaRepository<Planet,Long> {
    Planet findByName(String name);
    List<Planet> findByNameContaining(String name);
    List<Planet> findAllByOrderByNameDesc();
    List<Planet> findByPopulationGreaterThan(Long population);
    List<Planet> findByPopulationBetween(Long min, Long max);
    List<Planet> findTop10ByOrderByPopulationAsc();
    List<Planet> findTop10ByOrderByPopulationDesc();
}
