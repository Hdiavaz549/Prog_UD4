/**
 * 
 */
package Ejercicio4_10;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Figura[] figuras = new Figura[2];
		
		figuras[0] = new Circulo(5.0);
		figuras[1] = new Rectangulo(4.0, 6.0);
		
		for (Figura figura : figuras) {
			figura.mostrarInformacion();
			System.out.println("Área calculada: " + figura.calcularArea());
			System.out.println();
		}

	}

}
