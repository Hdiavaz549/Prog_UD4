/**
 * 
 */
package UD4.ejercicio4_6;

/**
 * 
 */
import java.util.Scanner;
public class Persona {
	Scanner sc = new Scanner(System.in);
	// Atributos
		private String nombre;
		private int edad;
		private double estatura;
		private Sexo sexo;

		// Métodos
		public void setSexo(Sexo sexo) {
			this.sexo = sexo;
		}
		
		public Sexo getSexo() {
			return sexo;
		}
		
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
		
		public Persona(String nombre, int edad, double estatura, Sexo sexo) {
			this.nombre = nombre;
			this.edad = edad;
			this.estatura = estatura;
			this.sexo = sexo;
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
}
