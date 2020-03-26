package unidad_8_excepciones;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio3_Excepciones_Aleatorias {

	public static void main(String[] args) {
		
		int moneda = (int)(Math.random()*5);
		
		if(moneda == 0) {
			try {
				throw new NumberFormatException();
			}catch(NumberFormatException NFE) {
				System.out.println("\t\tExcepcion 1:\n\t\tNumberFormatException() \n\n");
				NFE.printStackTrace();
				System.out.println("Fin del programa");				
			}
		}else if(moneda == 1) {
			try {
				throw new IOException();
			}catch(IOException IOE) {
				System.out.println("\t\tExcepcion 2:\n\t\tIOException() \n\n");
				IOE.printStackTrace();
				System.out.println("Fin del programa");				
			}			
		}else if(moneda == 2) {
			try {
				throw new FileNotFoundException();
			}catch(FileNotFoundException FNFE) {
				System.out.println("\t\tExcepcion 3:\n\t\tFileNotFoundException() \n\n");
				FNFE.printStackTrace();
				System.out.println("Fin del programa");				
			}			
		}else if(moneda == 3) {
			try {
				throw new IndexOutOfBoundsException();
			}catch(IndexOutOfBoundsException IOOBE) {
				System.out.println("\t\tExcepcion 4:\n\t\tIndexOutOfBoundsException() \n\n");
				IOOBE.printStackTrace();
				System.out.println("Fin del programa");				
			}			
		}else if(moneda == 4) {
			try {
				throw new ArithmeticException();
			}catch(ArithmeticException AE) {
				System.out.println("\t\tExcepcion 5:\n\t\tArithmeticException() \n\n");
				AE.printStackTrace();
				System.out.println("Fin del programa");				
			}
		}
		
	}
	
	
	
	//SOLUCION LIBRO
//	import java.io.FileNotFoundException;
//	import java.io.IOException;
//	import java.util.ArrayList;
//	public class S14Ejercicio03 {
//	public static void main(String[] args) {
//	ArrayList<Exception> excepciones = new ArrayList<Exception>();
//	excepciones.add(new NumberFormatException());
//	excepciones.add(new IOException());
//	excepciones.add(new FileNotFoundException());
//	excepciones.add(new IndexOutOfBoundsException());
//	excepciones.add(new ArithmeticException());
//	try {
//	throw excepciones.get((int)(Math.random() * 6));
//	} catch (Exception e) {
//	e.printStackTrace();
//	}
//	}

}
