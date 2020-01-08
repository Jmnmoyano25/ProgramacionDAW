package unidad_6_arrays_ejercicios;
import java.util.Scanner;
public class Arrays_1_dimension_03 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner memory = new Scanner (System.in);
		//EJERCICIO 3
				int[] numeros = new int[10];
				
		        for (int i = 0; i < numeros.length; i++) {
		            System.out.print("Introduce un número entero y pulsa intro: ");
		            numeros[i]=memory.nextInt();            
		        }
		        
		        System.out.println("\nLos numeros introducidos a la inversa son:");
		        for (int i = numeros.length - 1; i >= 0 ; i--) {
		            System.out.println("Introducido  " + i + " = " + numeros[i]);
		        }

				
		
		
		
		
	}

}
