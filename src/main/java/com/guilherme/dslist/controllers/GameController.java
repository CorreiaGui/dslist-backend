package com.guilherme.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guilherme.dslist.dto.GameDto;
import com.guilherme.dslist.dto.GameMinDto;
import com.guilherme.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDto> findAll(){
		return gameService.findAll();
	}
	
	@GetMapping(value = "/{id}")//aqui define que após a '/' virá um numero id
	public GameDto findByIdl(@PathVariable Long id){
							//pathvariable define que este parametro vem do navagedor após a barra (?).
		return gameService.findById(id);
	}
}
