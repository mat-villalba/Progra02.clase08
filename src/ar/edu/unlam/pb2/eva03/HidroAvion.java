package ar.edu.unlam.pb2.eva03;

public class HidroAvion extends Vehiculo implements Acuatico, Volador{

	private Double altura;
	private Double profundidad;
	private Double velocidad;
	

	public HidroAvion(Integer codigoDeVehiculo, String descripcion) {
		super(codigoDeVehiculo, descripcion);
		this.profundidad=0.00;
		this.velocidad=0.00;
		this.altura=0.00;
	}

	@Override
	public Double getAltura() {
		return this.altura;
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
