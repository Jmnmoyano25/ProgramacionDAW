package unidad_3;

public class PersonaVaria {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		//creamos un objeto persona llamado humano2 con el constructor estandar, y sus atributos
		Persona humano1 = new Persona ();
		
		//objeto creado con el constructor especifico
		Persona humano2 = new Persona ("Alicia", 6, 1.10f);
		
		//otro objeto con un solo metodo String 
		Persona humano3 = new Persona ("Luz");
		
		
		//atributos necesarios para el constructor simple
		humano1.nombre = "Marta";
		humano1.altura = 0.9f;
		humano1.edad = 3;
		
		System.out.println("Humano1/constructor1-Nombre: "+humano1.nombre +" Edad: "+ humano1.edad +" Altura: "+ humano1.altura+"\n");
		
		
		//Para el objeto 1, con el constructor 2 los atributos estan en la llamada a la clase persona
		System.out.println("Humano2/constructor2-Nombre: "+humano2.nombre +" Edad: "+ humano2.edad +" Altura: "+ humano2.altura+"\n");
		
		//Por último la ultima persona solo devuelve un String
		System.out.println("Humano3/constructor3-Nombre: "+humano3.nombre+"\n");
		
		
	}

}
