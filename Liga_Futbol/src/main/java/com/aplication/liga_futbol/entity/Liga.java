package com.aplication.liga_futbol.entity;

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
	private int id;
	private String nombre;
	private List<Integer> idEquipos;

	/**
	 * Constructor por defecto
	 */
	public Liga() {
	}

	

	/**
	 * Constructor parametrizado
	 * 
	 * @param id      representa el id de la liga de futbol
	 * @param nombre  representa el nombre de la liga de futbol
	 * @param idEquipos representa la lista de id de equipos que forman parte de la liga
	 */
	public Liga(int id, String nombre, List<Integer> idEquipos) {
		this.id = id;
		this.nombre = nombre;
		this.idEquipos = idEquipos;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public List<Integer> getIdEquipos() {
		return idEquipos;
	}



	public void setIdEquipos(List<Integer> idEquipos) {
		this.idEquipos = idEquipos;
	}



	@Override
	public String toString() {
		return "Liga [id=" + id + ", nombre=" + nombre + ", idEquipos=" + idEquipos + "]";
	}


}
