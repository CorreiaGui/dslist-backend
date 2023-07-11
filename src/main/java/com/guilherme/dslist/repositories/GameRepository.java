package com.guilherme.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
