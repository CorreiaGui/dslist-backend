package com.guilherme.dslist.entities;

import static jakarta.persistence.GenerationType.IDENTITY;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_game_list")
@NoArgsConstructor
@AllArgsConstructor
public class GameList {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Long id;
	
	private String name;

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
		GameList other = (GameList) obj;
		return Objects.equals(id, other.id);
	}
}
