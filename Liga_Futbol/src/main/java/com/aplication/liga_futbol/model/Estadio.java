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

	//Representa el id del estadio
	private int id;
	//Representa el nombre del estadio
	private String nombre;
	//Representa la cantidad de personas que puede contener el estadio
	private int capacidad;
	//Representa la direccion donde se ubica el estadio
	private String direccion;
	//Representa el equipo el cual es dueño del estadio
	private Equipo equipo;

	/**
	 * Constructor por defecto
	 */
	public Estadio() {
	}

	/**
	 * Constructor Parametrizado
	 * @param id representa el id del estadio.
	 * @param nombre representa el nombre del estadio.
	 * @param capacidad representa la cantidad de personas que puede contener el estadio.
	 * @param direccion representa la direccion en donde se ubica el estadio.
	 * @param equipo representa el equipo el cual es dueño del estadio.
	 */
	public Estadio(int id, String nombre, int capacidad, String direccion, Equipo equipo) {
		this.id = id;
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.direccion = direccion;
		this.equipo = equipo;
	}

	
	/**
	 * Metodo que retorna el id del estadio.
	 * @return the id del estadio.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Metodo que modifica el id del estadio.
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Metodo que retorna el nombre del estadio.
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo que modifica el nombre del estadio.
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo que retorna la cantidad de personas que puede contener el estadio.
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}

	/**
	 * Metodo que modifica la cantidad de personas que puede contener el estadio.
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * Metodo que retorna la direccion del estadio
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * Metodo que modifica la direccion del estadio.
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * Metodo que retorna el equipo el cual es dueño del estadio.
	 * @return the equipo
	 */
	public Equipo getEquipo() {
		return equipo;
	}

	/**
	 * Metodo que modifica el equipo el cual es dueño del estadio.
	 * @param equipo the equipo to set
	 */
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Estadio [id=" + id + ", nombre=" + nombre + ", capacidad=" + capacidad + ", direccion=" + direccion
				+ ", equipo=" + equipo + "]";
	}

}
