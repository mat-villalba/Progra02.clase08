package ar.edu.unlam.pb2.eva03;

public class Submarino extends Vehiculo implements Acuatico{

	private Double profundidad;
	private Double velocidad;
	
	public Submarino(Integer codigoDeVehiculo, String descripcion) {
		super(codigoDeVehiculo, descripcion);
		this.profundidad=0.00;
		this.velocidad=0.00;
	}

	@Override
	public Double getProfundidad() {
		return this.profundidad;
	}

	@Override
	public Double getVelocidad() {
		return this.velocidad;
	}

}
