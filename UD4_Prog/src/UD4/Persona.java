/**
 * 
 */
package UD4;

import UD4.ejercicio4_6.Sexo;

/**
 * 
 */
public class Persona {

	// Atributos
	
	 @Override
	    public String toString() {
		 	return "Persona[nombre=" + nombre + ", edad=" + edad + "]";
	 	} 
	 
	 @Override
	 public boolean equals(Object obj) {
		 if (this == obj)
			 return true;
		 else {
			 Persona p = (Persona)obj;
			 boolean esIgual = false;
			 boolean esIgualElNombre = this.nombre.equals(p.nombre);
			 boolean esIgualLaEdad = this.edad == p.edad;
					 esIgual = esIgualElNombre && esIgualLaEdad;
			 return esIgual;
		 }
	 }
	 
	protected String nombre;
	protected int edad;
	protected double estatura;
	protected char[] getSexo;
	

	// Métodos

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setEdad(int edad) {
		if (edad > 0) {
			this.edad = edad;
		}
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	
	public double getEstatura() {
		return estatura;
	}
	
	public Persona(String nombre, int edad, double estatura) {
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}

	public Persona() {
		nombre = "anónimo";
		edad = 18;
		estatura = 1.70;
	}

	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public Persona(String nombre, String apellido, int edad, double estatura) {
		this.nombre = nombre + apellido;
		this.edad = edad;
		this.estatura = estatura;
		
	}

	void metodo() {
		int edad = 8;
		System.out.println(this.edad);
	}

	void saludar() {
		System.out.println("Hola soy " + nombre);
	}

	void cumplirAnyos() {
		edad++;
	}

	void crecer(double incremento) {
		estatura = estatura + incremento;
	}
	public void setSexo(Sexo hombre) {
		// TODO Auto-generated method stub
		
	}

}
