package unidad_9_colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collection;
import java.util.Iterator;

public class ListadoPersonas extends Persona {

	//creamos el ArrayList de objetos (persona)
	static ArrayList<Persona> personas = new ArrayList();
	static Scanner sc = new Scanner(System.in);
	//creamos los metodos estáticos
	public static void buscarNombre(String nombre) {
		System.out.println("Personas que se llaman "+nombre);
		for(int i = 0; i < personas.size(); i++) {
			if(personas.get(i).getNombre().equalsIgnoreCase(nombre))
			System.out.println(personas.get(i));
		}
	}
	public static void buscarApellidos(String apellido) {
		System.out.println("Personas que se apellidan "+apellido);
		for(int i = 0; i < personas.size(); i++) {
			if(personas.get(i).getApellidos().equalsIgnoreCase(apellido))
			System.out.println(personas.get(i));
		}
	}
	public static void buscadorCadena(String apellido) {
		System.out.println("Personas que se apellidan "+apellido);
		for(int i = 0; i < personas.size(); i++) {
			if(personas.get(i).getApellidos().contains(apellido)) {
				System.out.println(personas.get(i));				
			};
		}
	}
	//Esto hay que hacerlo con simpleDateFormat, pero es un lio....
	public static void buscarNacimiento(String fechaNacimiento ) {
		System.out.println("Personas que nacieron el "+fechaNacimiento);
		for(int i = 0; i < personas.size(); i++) {
			if(personas.get(i).getFechaNacimiento().contains(fechaNacimiento));
			System.out.println(personas.get(i));
		}
	}
	
	//metodo para crear las personas
	public static void crearPersonas() {
		//declaración de variables para llenar los coches
		String Nombre;
		String Apellidos;
		String fechaNacimiento;
		//variables auxiliares para los coches nuevos
		Persona aux;
		int i, z;
		//pedimos por teclado el numero de personas
		do {
			System.out.print("Cuantas personas: ");
			z = sc.nextInt();
		}while (z < 0);
		sc.nextLine();
		//vamos a leer las personas
		for (i = 1; i <= z; i++) {
			System.out.println("Nombre persona "+i+": ");
			Nombre = sc.nextLine();
			System.out.println("Apellidos persona "+i+": ");
			Apellidos = sc.nextLine();
			System.out.println("Fecha nacimiento persona "+i+": ");
			fechaNacimiento = sc.nextLine();
			sc.nextLine();
			aux = new Persona();
			aux.setNombre(Nombre);
			aux.setApellidos(Apellidos);
			aux.setFechaNacimiento(fechaNacimiento);
			
			personas.add(aux);				
		}		
	}
	
	//mostramos todos las personas
	public static void mostrarPersonas() {
		for(int i = 0; i < personas.size(); i++) {
			System.out.println(personas.get(i));
		}
	}
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		crearPersonas();
		mostrarPersonas();
		System.out.println("\n");
		buscarNombre("maria");
		System.out.println("\n");
		buscadorCadena("moyano");
		System.out.println("\n");
		buscarApellidos("lopez alvarez");
		System.out.println("\n");
		buscarNacimiento("25-05-1984");
		
	}

}
