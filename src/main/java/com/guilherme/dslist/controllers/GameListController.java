package com.guilherme.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guilherme.dslist.dto.GameListDto;
import com.guilherme.dslist.dto.GameMinDto;
import com.guilherme.dslist.services.GameListService;
import com.guilherme.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDto> findAll(){
		return gameListService.findAll();
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDto> findByList(@PathVariable Long listId){
		List<GameMinDto> result = gameService.findByList(listId);
		return result;
	}
}
