/**
 * 
 */
package EjercicioBiblioteca;

/**
 * 
 */
import java.util.ArrayList;
public class Biblioteca {
	private ArrayList<Libro> libros;
	
	public Biblioteca() {
		this.libros = new ArrayList<>();
	}
	
	public void agregarLibro(Libro libro)  {
		libros.add(libro);
	}
	
	public void mostrarLibros() {
		System.out.println("Libros en la biblioteca:");
		for (Libro libro : libros) {
			libro.mostrarInfo();
		}
		System.out.println();
	}
	
	public void prestarLibro(String titulo) {
		for (Libro libro : libros) {
			if (libro.getTitulo().equalsIgnoreCase(titulo)) {
				if (libro.isDisponible()) {
					libro.prestar();
					System.out.println("Libro '" + titulo + "' prestado con éxito.");
				} else {
					System.out.println("El libro '" + titulo + "' no está disponible para prestar.");
				}
				return;
			}
		}
		System.out.println("El libro '" + titulo + "' no se encuentra en la biblioteca.");
	}
}
