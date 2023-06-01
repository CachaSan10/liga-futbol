package com.aplication.liga_futbol.model;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Esta clase representa un equipo de futbol en el sistema
 * 
 * @author Nahuel Alberto Cachambi
 *
 */
@Component
public class Equipo {
	private int id;
	private String nombre;
	private LocalDate FechaFundacion;
	@Autowired
	private Estadio estadio;
	private int cantidadSocios;
	@Autowired
	private Liga liga;

	/**
	 * Constructor por defecto
	 */
	public Equipo() {
	}

	/**
	 * Constructor Parametrizado
	 * 
	 * @param id             representa el id del equipo.
	 * @param nombre         representa el nombre del equipo.
	 * @param fechaFundacion representa la fecha de fundacion del equipo.
	 * @param estadio        representa el estadio del equipo.
	 * @param cantidadSocios representa la cantidad de socios que tiene el equipo.
	 * @param Liga           representa a la liga en la cual el equipo compite.
	 */
	public Equipo(int id, String nombre, LocalDate fechaFundacion, Estadio estadio, int cantidadSocios, Liga liga) {
		this.id = id;
		this.nombre = nombre;
		FechaFundacion = fechaFundacion;
		this.estadio = estadio;
		this.cantidadSocios = cantidadSocios;
		this.liga = liga;
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

	public LocalDate getFechaFundacion() {
		return FechaFundacion;
	}

	public void setFechaFundacion(LocalDate fechaFundacion) {
		FechaFundacion = fechaFundacion;
	}

	public Estadio getEstadio() {
		return estadio;
	}

	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

	public int getCantidadSocios() {
		return cantidadSocios;
	}

	public void setCantidadSocios(int cantidadSocios) {
		this.cantidadSocios = cantidadSocios;
	}

	public Liga getLiga() {
		return liga;
	}

	public void setLiga(Liga liga) {
		this.liga = liga;
	}

	@Override
	public String toString() {
		return "Equipo [id=" + id + ", nombre=" + nombre + ", FechaFundacion=" + FechaFundacion + ", estadio=" + estadio
				+ ", cantidadSocios=" + cantidadSocios + ", liga=" + liga + "]";
	}

}
