package vehiculos;

import java.util.Map;
import java.util.HashMap;
import java.util.Collections;


public class Vehiculo {
	private String placa;
	protected int puertas = 0;
	protected int velocidadMaxima = 0;;
	private String nombre;
	private int precio = 0;
	private int peso = 0;
	protected String traccion;
	private Fabricante fabricante;
	private static int cantidadVehiculos = 0;
	private static Map <String, Integer> vendidosPais = new HashMap<String, Integer>();
	private static Map <String, Integer> vendidosFabrica = new HashMap<String, Integer>();
	
	public Vehiculo() {
		cantidadVehiculos ++;
		if(vendidosPais.containsKey("N/R")) {
			vendidosPais.put("N/R",vendidosPais.get("N/R")+1);
		}else {
			vendidosPais.put("N/R",1);
		}
		if(vendidosFabrica.containsKey("N/R")) {
			vendidosFabrica.put("N/R",vendidosFabrica.get("N/R")+1);
		}else {
			vendidosFabrica.put("N/R",1);
		}
	}
	
	public Vehiculo(String placa, int puertas,int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.fabricante = fabricante;
		this.traccion = traccion;
		this.peso = peso;
		this.precio = precio;
		this.nombre = nombre;
		this.velocidadMaxima = velocidadMaxima;
		this.puertas = puertas;
		this.placa = placa;
		cantidadVehiculos ++;
		if(vendidosPais.containsKey(fabricante.getPais().getNombre())) {
			vendidosPais.put(fabricante.getPais().getNombre(),vendidosPais.get(fabricante.getPais().getNombre())+1);
		}else {
			vendidosPais.put(fabricante.getPais().getNombre(),1);
		}
		if(vendidosFabrica.containsKey(fabricante.getNombre())) {
			vendidosFabrica.put(fabricante.getNombre(),vendidosFabrica.get(fabricante.getNombre())+1);
		}else {
			vendidosFabrica.put(fabricante.getNombre(),1);
		}
		
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getTraccion() {
		return traccion;
	}

	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	public static int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	
	public static void setCantidadVehiculos(int cantidad) {
		cantidadVehiculos = cantidad;
	}
	
	public String vehiculosPorTipo() {
		return String.format("Automoviles: %d \n"
				+ "Camionetas: %d\n"
				+ "Camiones: %d",Automovil.getCantidadAutomoviles(),Camioneta.getCantidadCamionetas(),Camion.getCantidadCamiones());
	}
	
	public static Pais paisMasVendedor() {
		return new Pais (Collections.max(vendidosPais.keySet()));
	}
	
	public static Pais fabricaMayorVentas() {
		return new Pais (Collections.max(vendidosFabrica.keySet()));
	}

}
