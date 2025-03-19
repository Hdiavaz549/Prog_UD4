/**
 * 
 */
package UD4;

/**
 * 
 */
public class Empleado extends Persona{
	private double salario;
	
	Empleado (double salario, String nombre){
		this.salario = salario;
		super.setNombre(nombre);
		super.nombre = nombre; 
	}
	
	double getSalario() {
		return salario;
	}
	
	
}
