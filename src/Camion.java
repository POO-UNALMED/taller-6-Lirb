package vehiculos;

public class Camion extends Vehiculo{
	private int ejes = 0;
	private static int cantidadCamiones = 0;
	
	public Camion() {
		super();
		this.puertas = 2;
		this.velocidadMaxima = 80;
		this.traccion = "4X2";
		cantidadCamiones++;
	}
	
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		super(placa, 2 , 80, nombre, precio, peso, "4X2", fabricante);
		this.ejes = ejes;
		cantidadCamiones++;
	}
	
	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	public static int getCantidadCamiones() {
		return cantidadCamiones;
	}
}
