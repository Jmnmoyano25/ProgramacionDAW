package unidad_8_excepciones;

import java.lang.*;

public class Prueba_calculadora {
	
	/*
	static int suma(int num1, int num2) {		
		int resul = num1 + num2;		
		return resul;
	}
	*/

	public static void main(String[] args) throws Exception {	
		
		//new args[2];		
		//System.out.println(suma(1,2));
		
			
		
	try {
	
		String signo = args[0];	
		int num1 = Integer.parseInt(args[1]);	
		int num2 = Integer.parseInt(args[2]);
		int tamanio = args.length;
		
		//System.out.println(signo);
		//System.out.println(num1);
		//System.out.println(num2);
		if(tamanio > 3) {
			throw new Exception();
		}		
		if(signo.equals("+")) {
			int suma = num1 + num2;
			System.out.println("La suma de "+ num1+" + "+num2+" es igual a: "+suma);
		}else if(signo.equals("-")) {
			int resta = num1 - num2;
			System.out.println("La resta de "+ num1+" - "+num2+" es igual a: "+resta);
		}else if(signo.equals("*")) {
			int producto = num1 * num2;
			System.out.println("La multiplicación de "+ num1+" x "+num2+" es igual a: "+producto);
		}else if(signo.equals("/")) {
			int division = num1 / num2;
			System.out.println("La división de "+ num1+" / "+num2+" es igual a: "+division);
		}
	
		
	}catch(NumberFormatException e){
		System.out.println("Solo se permiten numeros enteros");
		e.printStackTrace();
	}catch(ArithmeticException e){
		System.out.println("No se permite dividir entre 0");
		e.printStackTrace();
	}catch(Exception e){
		System.out.println("No se permiten más de 3 parametros");
	}finally {
		System.out.println("\nHasta pronto....");
	}
		
		

	}
}
