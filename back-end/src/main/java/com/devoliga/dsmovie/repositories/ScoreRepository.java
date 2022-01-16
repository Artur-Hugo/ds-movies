package com.devoliga.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devoliga.dsmovie.entities.Score;
import com.devoliga.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
