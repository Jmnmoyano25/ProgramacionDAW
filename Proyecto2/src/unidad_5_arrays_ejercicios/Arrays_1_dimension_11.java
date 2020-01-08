package unidad_5_arrays_ejercicios;
import java.util.Scanner;
public class Arrays_1_dimension_11 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner memory = new Scanner (System.in);
		
			//EJERCICIO 11
		
		int[] arrayInicial = new int[10];
		int[] arrayIndice = new int[10];
		int i = 0;
		int j = 0;
		int contador = 0;
		int cuentaArray = 0;
		int[] arrayFinal = new int[10];
		
		//Solicitamos 10 números enteros
		
        for (i = 0; i < 10; i++) {
        	System.out.println("Escribe un número entero y después pulsa intro: ");
            arrayInicial[i] = memory.nextInt(); 
        }
        
        //creamos el arrayIndice
        
        for (i = 0; i < 10; i++) {
            arrayInicial[i] = j; 
            j++;
        }
        //mostramos la tabla con la arrayIncial
        System.out.print("Índice\t");
        for(i = 0; i < 10; i++) {
        	System.out.print("[" + arrayIndice[i] + "]" + " ");
        }
        System.out.println("\n");
        System.out.print("Valor\t");
        for(i = 0; i < 10; i++) {
        	System.out.print(" " + arrayInicial[i] + " " + " ");
        }
        
        /*        
        //ahora pasamos los primos al principio del array 
        
        for(i = 0; i < 10; i++) {
            
        	for(i = 1; i <= arrayInicial[i]; i++) {
        		if(arrayInicial[i] % i == 0) {
        			contador++;
        		}
        	}
        	if(contador <= 2) {
        		arrayFinal[cuentaArray] = arrayFinal[i];
        		cuentaArray++;
        	}
        	contador = 0;
        }
        
        //ahora pasamos el resto de numeros (solo quedan los que no son primos) al resto del arrayFinal
        
        for(i = 0; i < 10; i++) {
            
        	for(i = 1; i <= arrayInicial[i]; i++) {
        		if(arrayInicial[i] % i == 0) {
        			contador++;
        		}
        	}
        	if(contador > 2) {
        		arrayFinal[cuentaArray] = arrayFinal[i];
        		cuentaArray++;
        	}
        	contador = 0;
        }
        */
        //por último mostramos la tabla con la arrayFinal
        
        System.out.println("\n");
        System.out.print("Índice\t");
        for(i = 0; i < 10; i++) {
        	System.out.print("[" + arrayIndice[i] + "]" + " ");
        }
        System.out.println("\n");
        System.out.print("Valor\t");
        for(i = 0; i < 10; i++) {
        	System.out.print(" " + arrayFinal[i] + " " + " ");
        }
        
        
	}

}
