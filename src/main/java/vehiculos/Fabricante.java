package vehiculos;

public class Fabricante {
	private String nombre;
	private Pais ubicaci�nFabrica;
	public Fabricante(String nombre, Pais ubicaci�nFabrica) {
		this.nombre = nombre;
		this.ubicaci�nFabrica = ubicaci�nFabrica;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return ubicaci�nFabrica;
	}
	public void setPais(Pais ubicaci�nFabrica) {
		this.ubicaci�nFabrica = ubicaci�nFabrica;
	}
	public static Pais fabricaMayorVentas() {
		return Vehiculo.paisMasVendedor();
	}
}
