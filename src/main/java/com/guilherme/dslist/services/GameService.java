package com.guilherme.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.guilherme.dslist.dto.GameDto;
import com.guilherme.dslist.dto.GameMinDto;
import com.guilherme.dslist.entities.Game;
import com.guilherme.dslist.projections.GameMinProjection;
import com.guilherme.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDto findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDto(result);
	}

	@Transactional(readOnly = true)
	public List<GameMinDto> findAll (){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDto(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDto> findByList(Long listId){
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		return result.stream().map(x -> new GameMinDto(x)).toList();
	}
}
