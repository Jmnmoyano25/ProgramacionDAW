package unidad_3;

public class Persona {
	
	//Atributos o campos
	 String nombre;
	 int edad;
	 float altura;
	 
	 //metodos o funciones
	 String consulta_Nombre(){
	 	return nombre;
	 }
	 void cambia_Nombre(String nom){
	 	nombre=nom;
	 }
	 
	//constructores
	 public Persona() {}
	 
	 public Persona(String nomre, int edad, float altura) {
		 this.nombre = nombre;
		 this.edad = edad;
		 this.altura = altura;
		 
	 	}
	 public Persona(String nombre) {
		this.nombre = nombre;
	}
	 }
	 
	
	

