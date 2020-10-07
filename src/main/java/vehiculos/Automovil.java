package vehiculos;

public class Automovil extends Vehiculo{
	private int puestos = 0;
	private static int  cantidadAutomoviles = 0;	
	
	public Automovil() {
		super();
		this.puertas =  4;
		this.velocidadMaxima = 100;
		this.traccion = "FWD";
		cantidadAutomoviles++;
	}
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		cantidadAutomoviles++;
	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	public static int getCantidadAutomoviles() {
		return cantidadAutomoviles;
	}
	
}
