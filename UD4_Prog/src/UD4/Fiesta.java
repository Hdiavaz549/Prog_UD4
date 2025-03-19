/**
 * 
 */
package UD4;

import UD4.ejercicio4_6.Sexo;

/**
 * 
 */
public class Fiesta {
	public static void main(String[] args) {
		Persona pepe = new Persona();
		Persona paco = new Persona();
		Persona alberto = new Persona();
		Persona jesus = new Persona();
		
		Persona hector = new Persona("Hector ", "Díaz", 18, 1.70);
		
		System.out.println(hector.getNombre());
		pepe.setNombre("Pepito");
		pepe.setEdad(19);
		pepe.setEstatura(1.80);
		
		pepe.setSexo(Sexo.HOMBRE);
		System.out.println(pepe.getSexo);
		Empleado juan = new Empleado(1000, "Juan");
		System.out.println("Empleado: " + juan.getSalario());
		}
	}
