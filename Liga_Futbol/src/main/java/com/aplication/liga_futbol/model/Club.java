package com.aplication.liga_futbol.model;

import java.time.LocalDate;

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
@Table(name = "Clubes")
public class Club {
	
	//Representa el id del club
	@Id
	@Column(name = "club_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	//Representa el nombre del club
	@Column(name = "nombre")
	private String nombre;
	
	//Representa la fecha de fundacion del club
	@Column(name = "fecha_fundacion")
	private LocalDate FechaFundacion;
	
	//Representa el estadio que le pertenece al club
	@Autowired
	@JoinColumn(name = "estadio_id")
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Estadio estadio;
	
	//Representa la cantidad de socios que posee el club
	@Column(name = "cant_socio")
	private int cantidadSocios;
	
	//Representa la pronvicia en donde se ubica el club
	@Column(name = "provincia")
	private String provincia;
	
	//Representa el pais donde se ubica el club
	@Column(name = "pais")
	private String pais;
	
	//Representa la liga donde compite el club
	@Autowired
	@JoinColumn(name = "liga_id")
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Liga liga;

	/**
	 * Constructor por defecto
	 */
	public Club() {
	}

	/**
	 * Constructor Parametrizado
	 * @param id             representa el id del club.
	 * @param nombre         representa el nombre del club;
	 * @param fechaFundacion representa la fecha de fundacion del club.
	 * @param estadio        representa el estadio del club.
	 * @param cantidadSocios representa la cantidad de socios que posee el club.
	 * @param provincia      representa la provincia en donde se ubica el club.
	 * @param pais           representa el pais donde se ubica el club.
	 * @param liga           representa la liga donde compite el club.
	 */
	public Club(int id, String nombre, LocalDate fechaFundacion, Estadio estadio, int cantidadSocios,
			String provincia, String pais, Liga liga) {
		this.id = id;
		this.nombre = nombre;
		FechaFundacion = fechaFundacion;
		this.estadio = estadio;
		this.cantidadSocios = cantidadSocios;
		this.provincia = provincia;
		this.pais = pais;
		this.liga = liga;
	}



	/**
	 * Metodo que retorna el id del club
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Metodo que modifica el id del club
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Metodo que retorna el nombre del club
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Metodo que modifica el nombre del club
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo que retorna la fecha de fundacion del club
	 * @return the fechaFundacion
	 */
	public LocalDate getFechaFundacion() {
		return FechaFundacion;
	}

	/**
	 * Metodo que modifica la fecha de fundacion del club
	 * @param fechaFundacion the fechaFundacion to set
	 */
	public void setFechaFundacion(LocalDate fechaFundacion) {
		FechaFundacion = fechaFundacion;
	}

	/**
	 * Metodo que retorna el estadio del club
	 * @return the estadio
	 */
	public Estadio getEstadio() {
		return estadio;
	}

	/**
	 * Metodo que modifica el estadio del club
	 * @param estadio the estadio to set
	 */
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

	/**
	 * Metodo que retorna la cantidad de socios que posee el club
	 * @return the cantidadSocios
	 */
	public int getCantidadSocios() {
		return cantidadSocios;
	}

	/**
	 * Metodo que modifica la cantidad de socios del club
	 * @param cantidadSocios the cantidadSocios to set
	 */
	public void setCantidadSocios(int cantidadSocios) {
		this.cantidadSocios = cantidadSocios;
	}

	/**
	 * Metodo que retorna la provincia en donde se ubica el club
	 * @return the provincia
	 */
	public String getProvincia() {
		return provincia;
	}

	/**
	 * Metodo que modifica la provincia en donde se ubica el club
	 * @param provincia the provincia to set
	 */
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	/**
	 * Metodo que retorna el pais en donde se ubica el club
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * Metodo que modifica el pais en donde se ubica el club
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
	 * Metodo que retorna la liga en donde compite el club
	 * @return the liga
	 */
	public Liga getLiga() {
		return liga;
	}

	/**
	 * Metodo que modifica la liga en donde compite el club
	 * @param liga the liga to set
	 */
	public void setLiga(Liga liga) {
		this.liga = liga;
	}

	@Override
	public String toString() {
		return "Equipo [id=" + id + ", nombre=" + nombre + ", FechaFundacion=" + FechaFundacion + ", estadio=" + estadio
				+ ", cantidadSocios=" + cantidadSocios + ", provincia=" + provincia + ", pais=" + pais + ", liga="
				+ liga + "]";
	}

}
