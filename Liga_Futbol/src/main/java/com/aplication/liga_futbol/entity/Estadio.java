package com.aplication.liga_futbol.entity;

import org.springframework.stereotype.Component;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 * Esta clase representa un estadio de futbol de un equipo en el sistema
 * 
 * @author Nahuel Alberto Cachambi
 *
 */
@Component
@Entity
@Table(name = "estadios")
public class Estadio {


	/**
	 * Representa el id del estadio
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * Representa el nombre del estadio
	 */
	private String nombre;

	/**
	 * Representa la capacidad de fanaticos que puede albergar el estadio
	 */
	private int capacidad;

	/**
	 * Representa la direccion del estadio
	 */
	private String direccion;

	/**
	 * Representa el club del eatadio
	 */
	@OneToOne()
	private Club club;

	/**
	 * Constructor por defecto
	 */
	public Estadio() {
	}


	/**
	 * Constructor Parametrizado
	 * @param id representa el id del estadio
	 * @param nombre representa el nombre del estadio
	 * @param capacidad representa la capacidad del estadio
	 * @param direccion representa la direccion del estadio
	 * @param club representa el club del estadio
	 */
	public Estadio(Long id, String nombre, int capacidad, String direccion, Club club) {
		this.id = id;
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.direccion = direccion;
		this.club = club;
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
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}

	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the club
	 */
	public Club getClub() {
		return club;
	}

	/**
	 * @param club the club to set
	 */
	public void setClub(Club club) {
		this.club = club;
	}

	@Override
	public String toString() {
		return "Estadio [id=" + id + ", nombre=" + nombre + ", capacidad=" + capacidad + ", direccion=" + direccion
				+ ", club=" + club + "]";
	}

}
