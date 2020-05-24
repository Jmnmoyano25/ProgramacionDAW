package unidad_9_colecciones;
/*
 * Crear una aplicaci�n que utilice objetos de la clase Persona, definida por atributos nombre, apellidos y a�o
de nacimiento, y que adem�s dispondr� de sus m�todos getters y setters correspondientes , as� como un
m�todo toString() sobrescrito que mostrar� todos sus datos.
Por otro lado, crear una clase ListadoPersonas, que incorpore un ArrayList de objetos Persona. Adem�s del
m�todo main(), dispondr� de una serie de m�todos est�ticos o de clase que permitir�n:
- Buscar por nombre.
- Buscar por apellido.
- Buscar por apellido que contenga una cadena (si buscamos "P�rez", encontrar� "L�pez P�rez" y "P�rez
Romero").
- Buscar por a�o de nacimiento.
Nota: En todos los casos debe mostrar todas las apariciones, no solo la primera.
 */
public class Persona {

	//ATRIBUTOS
	private String Nombre;
	private String Apellidos;
	private String fechaNacimiento;

	//METODOS GETTERS Y SETTERS
	
	protected String getNombre() {
		return Nombre;
	}
	protected void setNombre(String nombre) {
		Nombre = nombre;
	}
	protected String getApellidos() {
		return Apellidos;
	}
	protected void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	protected String getFechaNacimiento() {
		return fechaNacimiento;
	}
	protected void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	//METODO TOSTRING() SOBRESCRITO
	
	@Override
	public String toString() {
		return "Persona [Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
}
