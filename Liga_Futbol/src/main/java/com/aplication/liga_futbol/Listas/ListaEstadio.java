package com.aplication.liga_futbol.Listas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.aplication.liga_futbol.model.Estadio;

public class ListaEstadio {

	public static int contadorIdEstadio;
	private List<Estadio> estadios;
	@Autowired
	private Estadio estadio;
	
	
	/**
	 * Constructor por defecto
	 */
	public ListaEstadio() {
	estadios = new ArrayList<Estadio>();
	estadio.setNombre("Pedro Bidegain");
	estadio.setCapacidad(44955);
	estadio.setId(1);
	estadio.setDireccion("Bajo Flores, intersección de las avenidas Perito Moreno y Varela.");
	estadios.add(estadio);
	estadio.setNombre("El Monumental");
	estadio.setCapacidad(83214);
	estadio.setId(2);
	estadio.setDireccion("Intersección de las avenidas Figueroa Alcorta y Udaondo del barrio de Belgrano, Buenos Aires, Argentina.");
	estadios.add(estadio);
	contadorIdEstadio=2;
	}


	public List<Estadio> getEstadios() {
		return estadios;
	}


	public void setEstadios(List<Estadio> estadios) {
		this.estadios = estadios;
	}
	
	
	
	
	
}
