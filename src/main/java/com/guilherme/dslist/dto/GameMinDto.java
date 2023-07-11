package com.guilherme.dslist.dto;

import com.guilherme.dslist.entities.Game;

import lombok.Getter;

@Getter
public class GameMinDto {

	private Long id;
	
	private String title;
	
	private Integer year;
	
	private String imgUrl;
	
	private String shortDescription;

	public GameMinDto(Game game) {
		id = game.getId();
		title = game.getTitle();
		year = game.getYear();
		imgUrl = game.getImgUrl();
		shortDescription = game.getShortDescription();
	}
}
