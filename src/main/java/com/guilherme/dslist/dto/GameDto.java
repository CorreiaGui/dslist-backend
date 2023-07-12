package com.guilherme.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.guilherme.dslist.entities.Game;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GameDto {

	private Long id;
	
	private String title;
	
	private Integer year;
	
	private String genre;
	
	private String platforms;
	
	private Double score;
	
	private String imgUrl;
	
	private String shortDescription;

	private String longDescription;
	
	public GameDto(Game entidade) {
		BeanUtils.copyProperties(entidade, this); 
		//Beanutils.copyProperties serve para passar tudo que tem na classe game para a gameDto
		// ao invés de usar por exemplo title = entidade.getTitle();
		// porém, para isso funcionar é necessário get e set para atributos da classe.
	}
}
