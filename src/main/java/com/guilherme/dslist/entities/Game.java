package com.guilherme.dslist.entities;

import static jakarta.persistence.GenerationType.IDENTITY;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tb_game")
@NoArgsConstructor
@AllArgsConstructor
public class Game {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Long id;
	
	private String title;
	
	@Column(name = "game_year")
	private Integer year;
	
	private String genre;
	
	private String platforms;
	
	private Double score;
	
	private String imgUrl;
	
	@Column(columnDefinition = "TEXT")
	private String shortDescription;

	@Column(columnDefinition = "TEXT")
	private String longDescription;

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}
}
