/**
 * 
 */
package com.aplication.liga_futbol.model;

import org.springframework.stereotype.Component;

/**
 * Esta clase representa un estadio de futbol de un equipo en el sistema
 * 
 * @author Nahuel Alberto Cachambi
 *
 */
@Component
public class Estadio {

	private int id;
	private String nombre;
	private int capacidad;
	private String direccion;

	/**
	 * Constructor por defecto
	 */
	public Estadio() {
	}

	/**
	 * Constructor Parametrizado.
	 * 
	 * @param id        representa el id del estadio.
	 * @param nombre    representa el nombre del estadio.
	 * @param capacidad representa la capacidad del estadio.
	 * @param direccion representa la direccion del estadio.
	 */
	public Estadio(int id, String nombre, int capacidad, String direccion) {
		this.id = id;
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.direccion = direccion;
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

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Estadio [id=" + id + ", nombre=" + nombre + ", capacidad=" + capacidad + ", direccion=" + direccion
				+ "]";
	}

}
