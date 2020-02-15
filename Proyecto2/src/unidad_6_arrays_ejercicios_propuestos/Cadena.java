package unidad_6_arrays_ejercicios_propuestos;

import java.util.*;
public class Cadena {
	
	Scanner memory = new Scanner(System.in);
	//ATRIBUTOS
	private String cadenita;
	public char[] cadenaChar;
	public int tam;
	
	//CONSTRUCTORES
	/*
	 * constructor que da memoria al array de char
	 */
	public Cadena(int tam) {
		this.tam = tam;	
	}	
	
	/*
	 * constructor copia
	 */
	public Cadena (Cadena cop){
		this.tam = cop.tam;
	}
	
	/*
	 * metodo que pide la cadena y comprueba que es del tamaño correcto
	 */
	public String leerCadena() {
		System.out.println("Escribe una cadena: ");
		cadenita = memory.next();
			
		do {
		if (cadenita.length() > this.tam) {
			System.out.println("Cadena demasiado grande"+"\n\n"+"Vuelve a introducir la cadena: \n");
			cadenita = memory.next();
		}
		}while (cadenita.length() > this.tam);
		
		this.cadenaChar = new char[cadenita.length()+1];	
		/*
		 * pasamos la cadena a minusculas para trabajar con ella mejor despues
		 */		
		return cadenita.toLowerCase();		
	}	
	
	/*
	 * 
	 */
	public char[] cadenaAChar(String cadenita) {
		/*
		 *rellena el array de char con la cadena 
		 */
		
		for(int i = 0; i < cadenita.length() +1; i++) {
			if (i < cadenita.length()) {
				cadenaChar[i] = cadenita.charAt(i);
			}
			if(i == cadenita.length() +1) {
				cadenaChar[i] = '\0';
			}
		}
		return cadenaChar;
	}
	
	/*
	 * metodo que devuelve el contenido de la cadena
	 */
	public void escribirCadena(String cadenaPantalla) {
		
		System.out.println("La cadena introducida es: " + cadenaPantalla);
		System.out.println("o con el char...");
		for(int i = 0; i <cadenaChar.length; i++) {
			System.out.print(cadenaChar[i]);
		}
	}
	
	/*
	 * metodo que devulve el numero de caracteres que tiene la cadena
	 */
	public void longitud(String cadenaLongitud) {
		
		System.out.println("La longitud de la cadena es de: "+cadenaLongitud.length());
		System.out.println("\n");
		System.out.println("Con el char la longitud de la cadena del array char es de: "+ cadenaChar.length);
	}	
	
	/*
	 * metodo que copia el array de char en otro
	 */
	public char[] copiar(char[] arrayCadena) {
		char[] copiaCadenaChar = new char[cadenaChar.length];
		
		for(int i = 0; i < cadenaChar.length; i++) {
			copiaCadenaChar[i] = cadenaChar[i];
		}
		return copiaCadenaChar;
	}
	
	/*
	 * metodo que te dice si el caracter es una vocal
	 */
	public void esVocal(char[] arrayChar) {
		char[] vocales = {'a','e','i','o','u','á','é','í','ó','ú'};
		char a = ' ';
		
		System.out.println("¿Tiene la cadena vocales?\n");
		for(int i = 0; i < arrayChar.length; i++) { 
			for(int k = 0; k < vocales.length; k++) {
				if (arrayChar[i] == vocales[k]) 
					a = arrayChar[i];
			}
			if (arrayChar[i] == a) {
				System.out.println(a + " # VOCAL");
			}else
			System.out.println(arrayChar[i]);
		}
	}
	
	/*
	 * metodo que elimina las vocales
	 */
	public void eliminarVocales(char[] arrayChar) {
		char[] vocales = {'a','e','i','o','u','á','é','í','ó','ú'};
		char a = ' ';
		
		System.out.println("Cadena sin vocales\n");
		for(int i = 0; i < arrayChar.length; i++) { 
			for(int k = 0; k < vocales.length; k++) {
				if (arrayChar[i] == vocales[k]) 
					a = arrayChar[i];
			}
			if (arrayChar[i] == a) {
				arrayChar[i] = arrayChar[i +1];
			}else
			System.out.println(arrayChar[i]);
		}
	}
	
	/*
	 * metodo que pasa los caracteres a mayusculas
	 */
	public void pasarAmayusculas(char[] arrayChar) {
		System.out.print("Cadena pasada a mayusculas: ");
		for(int i = 0; i < arrayChar.length; i++) {
			String a = Character.toString(arrayChar[i]);
			a = a.toUpperCase();
			arrayChar[i] = a.charAt(0);
			System.out.print(arrayChar[i]);
		}
		System.out.println("\n");
	}
	
	/*
	 * metodo que te devuelve true si la cadena es un palindromo
	 */
	public boolean esPalindromo(char[] arrayChar) {
		boolean palindromo = false;
		int j = arrayChar.length -2;
		for(int i = 0; i < arrayChar.length; i++) {
			if (j > -1) {
				if(arrayChar[i] == arrayChar[j]) {
					palindromo = true;
				}
			j--;
			}
		}
		System.out.println("¿"+this.cadenita+" es un palindromo? " +palindromo);
		return palindromo;
	}
	
//	public int getTam() {
//		return tam;
//	}
//
//	public void setTam(int tam) {
//		this.tam = tam;
//	}
	
}
