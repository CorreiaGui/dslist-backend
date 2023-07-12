package com.guilherme.dslist.dto;

import com.guilherme.dslist.entities.GameList;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class GameListDto {
	
	private Long id;

	private String name;
	
	public GameListDto(GameList entidade) {
		id = entidade.getId();
		name = entidade.getName();
	}
}
	