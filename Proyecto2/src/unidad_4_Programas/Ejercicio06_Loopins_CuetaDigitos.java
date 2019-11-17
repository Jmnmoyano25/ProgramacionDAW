/*Ejercicio 6: Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
la salvedad de que el anterior estaba limitado a números de 5 dígitos como
máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
esta manera, la única limitación en el número de dígitos la establece el tipo de
dato que se utilice (int o long).*/

package unidad_4_Programas;
import java.util.Scanner;

public class Ejercicio06_Loopins_CuetaDigitos {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner vivo = new Scanner(System.in);
		
        int n, cifras;
  
        
       
            System.out.print("Introduce un número entero: ");
            n = vivo.nextInt();
            
            cifras = 0;    
            
            while(n != 0){ 
                     
                    n = n/10;         
                   cifras++;         
            }
            
            System.out.println("El número tiene " + cifras+ " cifras");

	}

}
