/**
 * 
 */
package UD4;

/**
 * 
 */
import java.util.Scanner;
public class Tiempo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Leer la hora
		System.out.println("Introduce hora, minutos y segundos");
		int hh = sc.nextInt();
		int mm = sc.nextInt();
		int ss = sc.nextInt();
		
		//Crear la hora
		Hora hora = new Hora(hh, mm, ss);
		Hora minuto = new Hora(hh, mm, ss);
		Hora segundo = new Hora(hh, mm, ss);
		hora.setHora(hh);
		minuto.setMinuto(mm);
		segundo.setSegundo(ss);
		
		//Leer n
		System.out.println("Escribe un número para aumentar la hora");
		int n = sc.nextInt();
		System.out.println(hora + ":" + minuto + ":" + segundo);
		
		
	}

}
