package com.guilherme.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable //serve para indicar que está classe é a junção de dois id 
public class BelongingPK {

	@ManyToOne //muitos pra um 
	@JoinColumn(name = "game_id") //trocando nome no banco
	private Game game;

	@ManyToOne
	@JoinColumn(name = "list_id")
	private GameList list;

	@Override
	public int hashCode() {
		return Objects.hash(game, list);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingPK other = (BelongingPK) obj;
		return Objects.equals(game, other.game) && Objects.equals(list, other.list);
	}
}
