package com.guilherme.dslist.dto;

import com.guilherme.dslist.entities.Game;
import com.guilherme.dslist.projections.GameMinProjection;

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
	
	public GameMinDto(GameMinProjection projection) {
		id = projection.getId();
		title = projection.getTitle();
		year = projection.getYear();
		imgUrl = projection.getImgUrl();
		shortDescription = projection.getShortDescription();
	}
}
