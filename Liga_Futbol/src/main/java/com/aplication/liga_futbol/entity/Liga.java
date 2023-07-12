package com.aplication.liga_futbol.entity;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * Esta clase representa una liga de futbol en el sistema.
 * 
 * @author Nahuel Alberto Cachambi
 *
 */
@Component
@Entity
@Table(name = "ligas")
public class Liga {
	
	/**
	 * Representa el id de la liga
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/**
	 * Representa el nombre de la liga
	 */
	private String nombre;
	
	/**
	 * Representa la lista de clubes que compiten en la liga
	 */
	@OneToMany(mappedBy = "liga")
	private List<Club> clubes;

	
	
	
	/**
	 * Constructor por defecto
	 */
	public Liga() {
	}
	

	/**
	 * Constructor Parametrizado
	 * @param id representa el id de la liga
	 * @param nombre representa el nombre de la liga
	 * @param clubes representa la lista de clubes que compiten en la liga
	 */
	public Liga(Long id, String nombre, List<Club> clubes) {
		this.id = id;
		this.nombre = nombre;
		this.clubes = clubes;
	}




	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the clubes
	 */
	public List<Club> getClubes() {
		return clubes;
	}

	/**
	 * @param clubes the clubes to set
	 */
	public void setClubes(List<Club> clubes) {
		this.clubes = clubes;
	}


	@Override
	public String toString() {
		return "Liga [id=" + id + ", nombre=" + nombre + ", clubes=" + clubes + "]";
	}

}
