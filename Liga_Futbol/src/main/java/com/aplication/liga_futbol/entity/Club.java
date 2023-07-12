package com.aplication.liga_futbol.entity;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 * Esta clase representa un club de futbol en el sistema
 * 
 * @author Nahuel Alberto Cachambi
 *
 */
@Component
@Entity
@Table(name = "clubes")
public class Club {
	
	/**
	 * Representa el id del club
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/**
	 * Representa el nombre del club
	 */
	private String nombre;
	
	/**
	 * Representa la fecha de Fundacion del club
	 */
	@Column(name = "fecha_fundacion")
	private LocalDate FechaFundacion;
	
	/**
	 * Representa el estadio del club
	 */
	@JoinColumn(name = "esta_id")
	@OneToOne()
	private Estadio estadio;
	
	/**
	 * Representa la liga donde compite el club
	 */
	@ManyToOne()
	private Liga liga;
	

	/**
	 * Constructor por defecto
	 */
	public Club() {
	}


	/**
	 * @param id representa el id del club
	 * @param nombre representa el nombre del club
	 * @param fechaFundacion representa la fecha de fundacion del club
	 * @param estadio representa el estadio del club
	 * @param liga representa la liga donde compite el club
	 */
	public Club(Long id, String nombre, LocalDate fechaFundacion, Estadio estadio, Liga liga) {
		this.id = id;
		this.nombre = nombre;
		FechaFundacion = fechaFundacion;
		this.estadio = estadio;
		this.liga = liga;
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
	 * @return the fechaFundacion
	 */
	public LocalDate getFechaFundacion() {
		return FechaFundacion;
	}


	/**
	 * @param fechaFundacion the fechaFundacion to set
	 */
	public void setFechaFundacion(LocalDate fechaFundacion) {
		FechaFundacion = fechaFundacion;
	}


	/**
	 * @return the estadio
	 */
	public Estadio getEstadio() {
		return estadio;
	}


	/**
	 * @param estadio the estadio to set
	 */
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}


	/**
	 * @return the liga
	 */
	public Liga getLiga() {
		return liga;
	}


	/**
	 * @param liga the liga to set
	 */
	public void setLiga(Liga liga) {
		this.liga = liga;
	}


	@Override
	public String toString() {
		return "Club [id=" + id + ", nombre=" + nombre + ", FechaFundacion=" + FechaFundacion + ", estadio=" + estadio
				+ ", liga=" + liga + "]";
	}
	
	


	
	
}
