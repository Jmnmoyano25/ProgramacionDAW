package unidad_6_arrays_ejercicios;
import java.util.Scanner;
public class Arrays_1_dimension_07 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner memory = new Scanner (System.in);
		
			//EJERCICIO 7
		
		int[] numeros = new int[100];
		int i = 0;
		int var1 = 0;
		int var2 = 0;
			
		//generamos 100 numeros aletorios entre 0 y 20
		
        for (i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() *21); 
        }
		
        //solicitamos dos numeros por teclado para intercambiarlos
        
        System.out.print("Introduce un número entero y pulsa intro: ");
        var1 = memory.nextInt();
        System.out.print("Introduce un segundo número entero y pulsa intro: ");
        var2 = memory.nextInt();
        
        //ahora procedmos a cambiar los numeros introducidos (var1) que coincidan por el (var2)
        
        for (i = 0; i < numeros.length; i++) {
        
          	
        	 if (numeros[i] == var1) {
        	        System.out.print("'" + var2 + "' ");
        	      } else {
        	        System.out.print(numeros[i] + " ");
        	      }
        }
	}

}
