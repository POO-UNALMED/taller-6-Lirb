package vehiculos;

public class Fabricante {
	private String nombre;
	private Pais ubicaciónFabrica;
	public Fabricante(String nombre, Pais ubicaciónFabrica) {
		this.nombre = nombre;
		this.ubicaciónFabrica = ubicaciónFabrica;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return ubicaciónFabrica;
	}
	public void setPais(Pais ubicaciónFabrica) {
		this.ubicaciónFabrica = ubicaciónFabrica;
	}
	public static Pais fabricaMayorVentas() {
		return Vehiculo.paisMasVendedor();
	}
}
