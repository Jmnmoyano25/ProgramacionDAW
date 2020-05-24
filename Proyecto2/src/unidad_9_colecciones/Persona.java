package unidad_9_colecciones;
/*
 * Crear una aplicación que utilice objetos de la clase Persona, definida por atributos nombre, apellidos y año
de nacimiento, y que además dispondrá de sus métodos getters y setters correspondientes , así como un
método toString() sobrescrito que mostrará todos sus datos.
Por otro lado, crear una clase ListadoPersonas, que incorpore un ArrayList de objetos Persona. Además del
método main(), dispondrá de una serie de métodos estáticos o de clase que permitirán:
- Buscar por nombre.
- Buscar por apellido.
- Buscar por apellido que contenga una cadena (si buscamos "Pérez", encontrará "López Pérez" y "Pérez
Romero").
- Buscar por año de nacimiento.
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
