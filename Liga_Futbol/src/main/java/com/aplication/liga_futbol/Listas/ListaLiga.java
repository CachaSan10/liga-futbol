package com.aplication.liga_futbol.Listas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aplication.liga_futbol.model.Liga;

@Component
public class ListaLiga {
	
	public static int contadorIdLigas;
	private List<Liga> ligas;
	
	@Autowired
	private Liga liga;
	
	
	/**
	 * Constructor por defecto 
	 */
	public ListaLiga() {
		ligas = new ArrayList<Liga>();
		List<Integer> idEquipos = new ArrayList<Integer>();
		liga.setId(1);
		liga.setNombre("Liga de Futbol Argentino");
		idEquipos.add(1);
		idEquipos.add(2);
		liga.setIdEquipos(idEquipos);
		contadorIdLigas=1;
	}

	public List<Liga> getLigas() {
		return ligas;
	}

	public void setLigas(List<Liga> ligas) {
		this.ligas = ligas;
	}

	@Override
	public String toString() {
		return "ListaLiga [ligas=" + ligas + "]";
	}

	
	
	
	
	
	
	
}
