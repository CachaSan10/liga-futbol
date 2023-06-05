package com.aplication.liga_futbol.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
@Table(name = "Estadios")
public class Estadio {

	//Representa el id del estadio
	@Id
	@Column(name = "estadio_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	//Representa el nombre del estadio
	@Column(name = "nombre")
	private String nombre;
	
	//Representa la cantidad de personas que puede albergar el estadio
	@Column(name = "capacidad")
	private int capacidadPersona;
	
	//Representa la direccion donde se ubica el estadio
	@Column(name = "direccion")
	private String direccion;
	
	//Representa el club que le pertenece el estadio
	@Autowired
	@JoinColumn(name = "club_id")
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Club club;

	/**
	 * Constructor por defecto
	 */
	public Estadio() {
	}

	

	
	/**
	 * Constructor Parametrizado
	 * @param id representa el id del estadio.
	 * @param nombre representa el nombre del estadio.
	 * @param capacidadPersona representa la cantidad de personas que puede albergar el estadio.
	 * @param direccion representa la direccion en donde se ubica el estadio.
	 * @param club representa el club que le pertenece el estadio.
	 */
	public Estadio(int id, String nombre, int capacidadPersona, String direccion, Club club) {
		this.id = id;
		this.nombre = nombre;
		this.capacidadPersona = capacidadPersona;
		this.direccion = direccion;
		this.club = club;
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
	 * Metodo que retorna la cantidad de personas que puede albergar el estadio.
	 * @return the capacidadPersona
	 */
	public int getCapacidad() {
		return capacidadPersona;
	}

	/**
	 * Metodo que modifica la cantidad de personas que puede albergar el estadio.
	 * @param capacidadOPersona the capacidad to set
	 */
	public void setCapacidad(int capacidadPersona) {
		this.capacidadPersona = capacidadPersona;
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
	 * Metodo que retorna el club que le pertenece el estadio.
	 * @return the club
	 */
	public Club getClub() {
		return club;
	}

	/**
	 * Metodo que modifica el club que le pertenece el estadio.
	 * @param club the club to set
	 */
	public void setClub(Club club) {
		this.club = club;
	}

	@Override
	public String toString() {
		return "Estadio [id=" + id + ", nombre=" + nombre + ", capacidadPersona=" + capacidadPersona + ", direccion=" + direccion
				+ ", club=" + club + "]";
	}


}
