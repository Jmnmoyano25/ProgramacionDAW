package unidad_5_arrays_ejercicios;
import java.util.Scanner;
public class Arrays_1_dimension_06 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner memory = new Scanner (System.in);
		
			//EJERCICIO 6
		
		int[] numeros = new int[15];
		int i = 0;
		int var1 = 0;
		int var2 = 0;
				
        for (i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número entero y pulsa intro: ");
            numeros[i]=memory.nextInt(); 
        }
        
        //rotamos los numeros una posición
        
        for (i = 0; i < numeros.length; i++) {
        	
        	if(i == 0) {
        		var2 = numeros[i];
        	}else {
        		var1 = var2;
        		var2 = numeros[i];
        		numeros[i] = var1;
        	}
        	
        	//asignamos el valor [0]
        	numeros[0] = var2;
        }
        
        //ahora imprimimos la nueva array
        System.out.println("\nLos valores de la nueva array rotada son:");
        for(i = 0; i < numeros.length; i++) {
        	System.out.println(numeros[i]);
        }
	}

}
