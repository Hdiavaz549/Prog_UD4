/**
 * 
 */
package EjercicioBiblioteca;

/**
 * 
 */
public class Libro {
private String titulo;
private String autor;
private int anioPublicacion;
private boolean disponible;

public Libro(String titulo, String autor, int anioPublicacion) {
	this.titulo = titulo;
	this.autor = autor;
	this.anioPublicacion = anioPublicacion;
	this.disponible = true;
}

public void mostrarInfo() {
	System.out.println("Título: " + titulo + ", Autor: " + autor + ", Año: " + anioPublicacion + ", Disponible: " + disponible);
}

public String getTitulo() {
	return titulo;
}

public boolean isDisponible() {
	return disponible;
}

public void prestar() {
	this.disponible = false;
}
}