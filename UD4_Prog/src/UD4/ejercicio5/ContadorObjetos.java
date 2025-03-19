/**
 * 
 */
package UD4.ejercicio5;

/**
 * 
 */
public class ContadorObjetos {
//Atributos
	static int totalObjetos = 0;
	ContadorObjetos(){
	totalObjetos++;
	}
	//Métodos
	public void setTotalObjetos(int totalObjetos) {
		this.totalObjetos = totalObjetos;
		totalObjetos++;
	}
	
	public int getTotalObjetos() {
		return totalObjetos;
	}
	
	public static void mostrarTotalObjetos() {
		System.out.println(totalObjetos);
	}
}
