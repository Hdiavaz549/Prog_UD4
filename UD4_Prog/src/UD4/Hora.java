/**
 * 
 */
package UD4;

/**
 * 
 */
import java.util.Scanner;

public class Hora {
	Scanner sc = new Scanner(System.in);
	// Atributos
	private int hora;
	private int minuto;
	private int segundo;

	// Métodos

	public Hora(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	/**
	 * @return the sc
	 */
	public Scanner getSc() {
		return sc;
	}

	/**
	 * @param sc the sc to set
	 */
	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	/**
	 * @param hora the hora to set
	 */
	public void setHora(int hora) {
		this.hora = hora;
	}

	/**
	 * @param minuto the minuto to set
	 */
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public void setHora(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public int getHora() {
		return hora;
	}
	
	public void setMinuto(int minuto, int segundo) {
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public int getMinuto() {
		return minuto;
	}
	
	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	public int getSegundo() {
		return segundo;
	}
}
