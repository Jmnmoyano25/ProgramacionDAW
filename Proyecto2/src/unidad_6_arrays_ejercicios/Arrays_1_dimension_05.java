package unidad_6_arrays_ejercicios;
import java.util.Scanner;
public class Arrays_1_dimension_05 {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		Scanner memory = new Scanner (System.in);
		//EJERCICIO 5
				int[] numeros = new int[10];
				int max = 0;
				int min = 999999999;
				
		        for (int i = 0; i < numeros.length; i++) {
		            System.out.print("Introduce un n�mero entero y pulsa intro: ");
		            numeros[i]=memory.nextInt();  
		            
		            
		            if(numeros[i] > max)
		            	max = numeros[i];
		            if(numeros[i] < min)
		            	min = numeros[i];
		        }
		        
		        System.out.println("\nLos numeros introducidos con m�ximos y minimos son:");
		        
		        for (int i = 0; i < numeros.length ; i++) {
		            System.out.print(numeros[i]);
		            
			        	if (numeros[i] == max) {
			            System.out.println("\tM�ximo");
			          } else if (numeros[i] == min) {
			            System.out.println("\tM�nimo");
			          } else {
			            System.out.println();
			          }
			    }

	
	}

}
