package unidad_6_arrays_ejercicios_propuestos;

import java.util.*;
public class ManipularCadenas {
	
	public static void main(String[] args) {
		
		//Scanner memory = new Scanner(System.in);
		Cadena cadena1 = new Cadena(5);
		
		Cadena copiaCadena = new Cadena(cadena1);
		
	/*
	 *  COMPROBACIÓN DEL CONSTRUCTOR COPIA CON ATRIBUTO TAM CON GETER Y SETTER
	 *
	 *  System.out.println(cadena1.getTam());		
	 *	System.out.println(copiaCadena.getTam());				
	 *	copiaCadena.setTam(8);		
	 *	System.out.println(copiaCadena.getTam());
	 * 
	 */
		
		String cad = cadena1.leerCadena();
		char[] arrCha = cadena1.cadenaAChar(cad);
		
		cadena1.escribirCadena(cad);
		
		cadena1.longitud(cad);
		
		char[] copiArrChar = cadena1.copiar(arrCha);
		
		cadena1.esVocal(arrCha);
		
		cadena1.eliminarVocales(arrCha);
		
		cadena1.pasarAmayusculas(copiArrChar);
		
		cadena1.esPalindromo(copiArrChar);
		
		
		//System.out.println("Escribe un texto: ");
		


  

		 
		

		
//		char[] a = cadena1.imprimeArray(unArray);
//		cadena1.imprimeArray(cadena1);
	}
}
