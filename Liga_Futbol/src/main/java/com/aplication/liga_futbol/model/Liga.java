/**
 * 
 */
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
	private int id;
	private String nombre;
	@Autowired
	private List<Equipo> equipos;

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
	 * @param equipos representa la lista de equipos que conforman la liga de
	 *                futbol.
	 */
	public Liga(int id, String nombre, List<Equipo> equipos) {
		this.id = id;
		this.nombre = nombre;
		this.equipos = equipos;
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

	public List<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(List<Equipo> equipos) {
		this.equipos = equipos;
	}

	@Override
	public String toString() {
		return "Liga [id=" + id + ", nombre=" + nombre + ", equipos=" + equipos + "]";
	}

}
