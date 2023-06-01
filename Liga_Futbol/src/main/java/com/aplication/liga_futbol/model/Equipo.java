package com.aplication.liga_futbol.model;

import java.time.LocalDate;

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
	private int idEstadio;
	private int cantidadSocios;
	private int idLiga;

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
	 * @param idEstadio      representa el id del estadio de futbol del equipo.
	 * @param cantidadSocios representa la cantidad de socios que tiene el equipo.
	 * @param idLiga         representa el id de la liga en la cual compite el
	 *                       equipo.
	 */
	public Equipo(int id, String nombre, LocalDate fechaFundacion, int idEstadio, int cantidadSocios, int idLiga) {
		this.id = id;
		this.nombre = nombre;
		FechaFundacion = fechaFundacion;
		this.idEstadio = idEstadio;
		this.cantidadSocios = cantidadSocios;
		this.idLiga = idLiga;
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

	public int getIdEstadio() {
		return idEstadio;
	}

	public void setIdEstadio(int idEstadio) {
		this.idEstadio = idEstadio;
	}

	public int getCantidadSocios() {
		return cantidadSocios;
	}

	public void setCantidadSocios(int cantidadSocios) {
		this.cantidadSocios = cantidadSocios;
	}

	public int getIdLiga() {
		return idLiga;
	}

	public void setIdLiga(int idLiga) {
		this.idLiga = idLiga;
	}

	@Override
	public String toString() {
		return "Equipo [id=" + id + ", nombre=" + nombre + ", FechaFundacion=" + FechaFundacion + ", idEstadio="
				+ idEstadio + ", cantidadSocios=" + cantidadSocios + ", idLiga=" + idLiga + "]";
	}

}
