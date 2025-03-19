/**
 * 
 */
package Ejercicio_18;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Casa casa = new Casa(5);
		
		casa.encenderBombilla(0);
		casa.encenderBombilla(2);
		casa.encenderBombilla(4);

		System.out.println("Estado inicial:");
		casa.mostrarEstado();
		
		System.out.println("\nApagamos el interruptor general:");
		casa.apagarGeneral();
		casa.mostrarEstado();
		
		System.out.println("\nEncendemos el interruptor general:");
		casa.encenderGeneral();
		casa.mostrarEstado();
	}

}
