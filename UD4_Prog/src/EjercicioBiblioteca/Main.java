/**
 * 
 */
package EjercicioBiblioteca;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943);
		Libro libro2 = new Libro("1984", "George Orwell", 1949);
		Libro libro3 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
		
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.agregarLibro(libro1);
		biblioteca.agregarLibro(libro2);
		biblioteca.agregarLibro(libro3);
		
		biblioteca.mostrarLibros();
		
		System.out.println("Prestanco '1984'...");
		biblioteca.prestarLibro("1984");
		
		biblioteca.mostrarLibros();
	}

}
