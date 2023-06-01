package com.aplication.liga_futbol.Listas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.aplication.liga_futbol.model.Equipo;

public class ListaEquipo {

	public static int contadorIdEquipo;
	
	private List<Equipo> equipos;
	@Autowired
	private Equipo equipo;
	
	/**
	 * Constructor por defecto;
	 */
	public ListaEquipo() {
		equipos = new ArrayList<Equipo>();
		equipo.setId(1);
		equipo.setFechaFundacion(LocalDate.of(1, 4, 1908));
		equipo.setNombre("San Lorenzo");
		equipo.setCantidadSocios(80410);
		equipo.setIdEstadio(1);
		equipo.setIdLiga(1);
		equipos.add(equipo);
		equipo.setId(2);
		equipo.setFechaFundacion(LocalDate.of(25, 5, 1901));
		equipo.setNombre("River Plate");
		equipo.setCantidadSocios(150549);
		equipo.setIdEstadio(1);
		equipo.setIdLiga(1);
		contadorIdEquipo=2;
	}
	
	
	
}
