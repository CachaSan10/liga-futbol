package com.aplication.liga_futbol.model;

import java.util.List;

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
	//Representa la lista de equipo que compiten en la liga
	private List<Equipo> equipos;

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
	 * @param equipos representa los equipos que compiten en la liga.
	 */
	public Liga(int id, String nombre, String pais, List<Equipo> equipos) {
		this.id = id;
		this.nombre = nombre;
		this.pais = pais;
		this.equipos = equipos;
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
	 * Metodo que retorna la lista de equipos que compiten en la liga.
	 * @return the equipos
	 */
	public List<Equipo> getEquipos() {
		return equipos;
	}

	/**
	 * Metodo que modifica la lista de equipo que compiten en la liga.
	 * @param equipos the equipos to set
	 */
	public void setEquipos(List<Equipo> equipos) {
		this.equipos = equipos;
	}

	@Override
	public String toString() {
		return "Liga [id=" + id + ", nombre=" + nombre + ", pais=" + pais + ", equipos=" + equipos + "]";
	}

}
