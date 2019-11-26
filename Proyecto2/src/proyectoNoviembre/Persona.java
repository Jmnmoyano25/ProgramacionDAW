/*Ejercicio 1*/

package proyectoNoviembre;

public class Persona {
	//atributos
	private String nombre;
	private int edad;
	private long altura;
	
	//constructores
	public Persona(String nombre, int edad, long altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;


	}
	public Persona (Persona P) {
		this.nombre = P.nombre;
		this.altura = P.altura;
		this.edad = P.edad;
	}
	
	//metodos
	public String consultaNombre() {
		return nombre;
	}
	public void cambiaNombre(String nombre) {
		this.nombre = nombre;
		System.out.println("el nombre es "+nombre);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public long getAltura() {
		return altura;
	}
	public void setAltura(long altura) {
		this.altura = altura;
	}
	
	
}
