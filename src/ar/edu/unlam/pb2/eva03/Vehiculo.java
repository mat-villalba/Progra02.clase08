package ar.edu.unlam.pb2.eva03;

public abstract class Vehiculo {

	private Integer codigoDeVehiculo;
	private String descripcion;
	
	public Vehiculo(Integer codigoDeVehiculo, String descripcion) {
		this.codigoDeVehiculo=codigoDeVehiculo;
		this.descripcion=descripcion;
	}

	public Integer getCodigoDeVehiculo() {
		return codigoDeVehiculo;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	
}
