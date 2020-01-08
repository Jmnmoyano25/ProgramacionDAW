package unidad_6_arrays_ejercicios;
import java.util.Scanner;
public class Arrays_1_dimension_05 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner memory = new Scanner (System.in);
		//EJERCICIO 5
				int[] numeros = new int[10];
				int max = 0;
				int min = 999999999;
				
		        for (int i = 0; i < numeros.length; i++) {
		            System.out.print("Introduce un número entero y pulsa intro: ");
		            numeros[i]=memory.nextInt();  
		            
		            
		            if(numeros[i] > max)
		            	max = numeros[i];
		            if(numeros[i] < min)
		            	min = numeros[i];
		        }
		        
		        System.out.println("\nLos numeros introducidos con máximos y minimos son:");
		        
		        for (int i = 0; i < numeros.length ; i++) {
		            System.out.print(numeros[i]);
		            
			        	if (numeros[i] == max) {
			            System.out.println("\tMáximo");
			          } else if (numeros[i] == min) {
			            System.out.println("\tMínimo");
			          } else {
			            System.out.println();
			          }
			    }

	
	}

}
