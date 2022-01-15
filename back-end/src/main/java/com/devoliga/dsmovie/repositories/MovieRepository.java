package com.devoliga.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devoliga.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
}
