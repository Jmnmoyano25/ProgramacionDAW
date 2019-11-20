package Poblacion;

public class Individuo {
	
	//ATRIBUTOS O CAMPOS *PRIVATE PARA QUE NO SE PUEDAN MODIFICAR EN LAS OBJETOS SIN LOS MÉTODOS GET Y SET
	
	private String dni;
	private String nombre;
	private int fechaNacimiento;
	public static int poblacion = 0;//static 
	private final double PI = 3.14;//final se utiliza para constantes...
	
	
	//CONSTRUCTORES
	public Individuo() {}
	
	public Individuo(String dni, String nombre, int fechaNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		poblacion++;		//Con un atributo static se puede hacer un contador, cada vez que se cree un objeto Individuo se sumara uno.
	}

	//MÉTODOS
	public static int getPoblacion() {
		return poblacion;
	}
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(int fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	

}
	

