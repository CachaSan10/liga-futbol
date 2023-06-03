package com.aplication.liga_futbol.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Esta clase representa una liga de futbol en el sistema.
 * 
 * @author Nahuel Alberto Cachambi
 *
 */
@Component
public class Liga {
	//Representa el id de la liga
	private int id;
	//Representa el nombre de la liga
	private String nombre;
	//Representa el pais donde se ubica la liga
	private String pais;
	//Representa la lista de club que compiten en la liga
	@Autowired
	private List<Club> clubes;

	/**
	 * Constructor por defecto
	 */
	public Liga() {
	}

	
	

	
	/**
	 * Constructor Parametrizado
	 * 
	 * @param id      representa el id de la liga.
	 * @param nombre  representa el nombre de la liga.
	 * @param pais    representa el pais donde se ubica la liga.
	 * @param clubes  representa la lista de club que compiten en la liga.
	 */
	public Liga(int id, String nombre, String pais, List<Club> clubes) {
		this.id = id;
		this.nombre = nombre;
		this.pais = pais;
		this.clubes = clubes;
	}





	/**
	 * Metodo que retorna el id de la liga
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Metodo que modifica el id de la liga.
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Metodo que retorna el nombre de la liga.
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo que modifica el nombre de la liga.
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo que retorna el pais donde se ubica la liga.
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * Metodo que modifica el pais donde se ubica la liga.
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}


	/**
	 * Metodo que retorna la lista de club que compiten en la liga
	 * @return the clubes
	 */
	public List<Club> getClubes() {
		return clubes;
	}


	/**
	 * Metodo que modifica la lista de club que compiten en la liga
	 * @param clubes the clubes to set
	 */
	public void setClubes(List<Club> clubes) {
		this.clubes = clubes;
	}


	@Override
	public String toString() {
		return "Liga [id=" + id + ", nombre=" + nombre + ", pais=" + pais + ", clubes=" + clubes + "]";
	}

	

	
}
