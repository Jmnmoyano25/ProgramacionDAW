package unidad_8_excepciones;

import java.io.*;
import java.util.*;
public class EjercicioResuelto_1 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner sc = new Scanner(System.in);
		
		int intentos = 0;
		int num = -1;
		String linea;
		
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		do {
			try {
				System.out.println("Escribe un numero entre 0 y 100: ");
				linea = teclado.readLine();
				num = Integer.parseInt(linea);
				
			}catch(IOException e) {
				System.out.println("Error al leer del teclado....");
			}catch(NumberFormatException e) {
				System.out.println("Solo numeros entre 0 y 100....");
			}finally {
				intentos++;
			}
		}while(num < 0 || num > 100);
		System.out.println("El numero introducido es: "+num);
		System.out.println("El número de intentos asciende a: "+intentos);
		
	}

}
