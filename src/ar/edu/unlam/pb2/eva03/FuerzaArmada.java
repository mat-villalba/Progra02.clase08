package ar.edu.unlam.pb2.eva03;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class FuerzaArmada {

	private List<Vehiculo> convoy;
	private List<Batalla> batallas;	
	
	public FuerzaArmada() {
		this.convoy = new ArrayList<Vehiculo>();
		this.batallas = new ArrayList<Batalla>();
	}
	
	public void agregarVehiculo(Vehiculo vehiculo) {
		this.convoy.add(vehiculo);
	}


	public Integer getCapacidadDeDefensa() {
		return this.convoy.size();
	}

	public void crearBatalla(String nombre, TipoDeBatalla tipo, double latitud, double longitud) {
		Batalla nuevaBatalla = new Batalla(nombre, tipo, longitud, latitud);
		batallas.add(nuevaBatalla);
	}


	public Batalla getBatalla(String string) {
		for(Batalla nuevaBatalla : batallas) {
			if(nuevaBatalla.getNombre().equals(string));
				return nuevaBatalla;
		}
		return null;
	}

	public boolean enviarALaBatalla(String nombreDeBatalla, Integer codigoDeVehiculo) {
		
		return false;
	}

}
