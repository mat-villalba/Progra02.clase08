package ar.edu.unlam.pb2.eva03;

public class Avion extends Vehiculo implements Volador{

	private Double altura;
	
	public Avion(Integer codigoDeVehiculo, String descripcion) {
		super(codigoDeVehiculo, descripcion);
		this.altura=0.00;
	}

	@Override
	public Double getAltura() {
		return this.altura;
	}
	
	public Double calculadoraDelAvion() {
		return this.altura+10.0;
	}
	
	public Double calculadorDeTravis() {
	}
	
	

}
