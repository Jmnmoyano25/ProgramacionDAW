package unidad_6_arrays_ejercicios;
import java.util.Scanner;
public class Arrays_1_dimension_09 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner memory = new Scanner (System.in);
		
			//EJERCICIO 9
		
		int[] numeros = new int[8];
		int i = 0;
		//int var1 = 0;
		//int var2 = 0;
			
		//pedimos 8 digitos enteros
		
        for (i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número entero y pulsa intro: ");
            numeros[i]=memory.nextInt();  
        }
        System.out.println("\n");
        for(i = 0; i < numeros.length; i++) {
            
            if(numeros[i] % 2 == 0) {
            	System.out.println(numeros[i] + " es par");
            }else {
            	System.out.println(numeros[i] + " es impar");
            }
        }
  
	}

}
