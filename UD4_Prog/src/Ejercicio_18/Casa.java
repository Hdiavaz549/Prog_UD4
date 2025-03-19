/**
 * 
 */
package Ejercicio_18;

/**
 * 
 */
public class Casa {
	private Bombilla[] bombillas;
	private boolean luzGeneral;
	
	public Casa(int numBombillas) {
		bombillas = new Bombilla[numBombillas];
		 for (int i = 0; i < numBombillas; i++) {
			bombillas[i] = new Bombilla();
		}
		 luzGeneral = true;
	}
	
	public void encenderGeneral() {
		luzGeneral = true;
	}
	
	public void apagarGeneral() {
		luzGeneral = false;
	}
	
	public void encenderBombilla(int indice) {
		if (indice >= 0 && indice < bombillas.length) {
			bombillas[indice].encender();
		}
	}
	
	public void apagarBombilla(int indice) {
		if (indice >= 0 && indice < bombillas.length) {
			bombillas[indice].apagar();
		}
	}
	
	public void mostrarEstado() {
		for (int i = 0; i < bombillas.length; i++) {
			System.out.println("Bombilla " + i + ": " + (bombillas[i].estaEncendida(luzGeneral) ? "Encendida" : "Apagada"));
		}
	}
}
