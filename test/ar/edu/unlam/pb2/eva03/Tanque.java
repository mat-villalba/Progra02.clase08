package ar.edu.unlam.pb2.eva03;

public class Tanque extends Vehiculo implements Terrestre{

	private Double velocidad;
	
	public Tanque(Integer codigoDeVehiculo, String descripcion) {
		super(codigoDeVehiculo, descripcion);
		this.velocidad=0.00;
	}

	@Override
	public Double getVelocidad() {
		return this.velocidad;
	}
	
	

}
