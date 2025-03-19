/**
 * 
 */
package Ejercicio_17;

/**
 * 
 */
public class Deportista {
	private static int totalDeportistas = 0;
	
	private String nombre;
	private int edad;
	private String deporte;
	
	public Deportista(String nombre, int edad, String deporte) {
		this.nombre = nombre;
		this.edad = edad;
		this.deporte = deporte;
		totalDeportistas++;
	}
	
	//Getters
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public String getDeporte() {
		return deporte;
	}
	
	//Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void seetEdad(int edad) {
		this.edad = edad;
	}
	
	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}
	
	public static int getTotalDeportistas() {
		return totalDeportistas;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + nombre + ", Edad: " + edad + ", Deporte: " + deporte;
	}
}
