package com.guilherme.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilherme.dslist.dto.GameMinDto;
import com.guilherme.dslist.entities.Game;
import com.guilherme.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDto> findAll (){
		
		List<Game> result = gameRepository.findAll();
		
		return result.stream().map(x -> new GameMinDto(x)).toList();
	}
}
