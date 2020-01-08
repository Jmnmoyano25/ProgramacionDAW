package unidad_5_arrays_ejercicios;
import java.util.Scanner;
public class Arrays_1_dimension_10 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner memory = new Scanner (System.in);
		
			//EJERCICIO 10
		
		int[] numeros = new int[20];
		int i = 0;
		int arrayOrdenada = 0;
		int[] nuevosNumeros = new int[20];
			
		//Generamos 20 digitos aleatorias del 0 al 100
		
        for (i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() *101);  
        }
        
        //ahora pasamos los pares al principio del array 
        
        for(i = 0; i < numeros.length; i++) {
            
            if(numeros[i] % 2 == 0) {
            	nuevosNumeros[arrayOrdenada] = numeros[i];
            	arrayOrdenada++;
            }else {}
        }
        
        //ahora pasamos el resto de numeros (solo quedan impares) al resto del arrayOrdenado
        
        for(i = 0; i < numeros.length; i++) {
        	
        	if(numeros[i] %2 != 0) {
        		nuevosNumeros[arrayOrdenada] = numeros[i];
        		arrayOrdenada++;
        	}else {}
        }
        
        //por último mostramos el nuevo array
        
        for(i = 0; i < numeros.length; i++) {
        	
        	System.out.print(nuevosNumeros[i] + " ");
        }
  
	}

}
