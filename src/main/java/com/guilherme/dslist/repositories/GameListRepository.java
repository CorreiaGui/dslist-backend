package com.guilherme.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
