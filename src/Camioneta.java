package vehiculos;

public class Camioneta extends Vehiculo {
	private Boolean volco = true;
	private static int cantidadCamionetas = 0;
	
	public Camioneta() {
		super();
		this.velocidadMaxima = 90;
		this.traccion = "4X4";
		cantidadCamionetas++;
	}
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante,Boolean volco) {
		super(placa, puertas , 90, nombre, precio, peso,  "4X4", fabricante);
		this.volco = volco;
		cantidadCamionetas++;
	}
	public Boolean isVolco() {
		return volco;
	}
	public void setVolco(Boolean volco) {
		this.volco = volco;
	}
	public static int getCantidadCamionetas() {
		return cantidadCamionetas;
	}
}
