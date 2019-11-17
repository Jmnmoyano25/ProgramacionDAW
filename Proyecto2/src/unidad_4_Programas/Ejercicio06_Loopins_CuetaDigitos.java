/*Ejercicio 6: Realiza un programa que nos diga cu�ntos d�gitos tiene un n�mero introducido
por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
la salvedad de que el anterior estaba limitado a n�meros de 5 d�gitos como
m�ximo. En esta ocasi�n, hay que realizar el ejercicio utilizando bucles; de
esta manera, la �nica limitaci�n en el n�mero de d�gitos la establece el tipo de
dato que se utilice (int o long).*/

package unidad_4_Programas;
import java.util.Scanner;

public class Ejercicio06_Loopins_CuetaDigitos {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		Scanner vivo = new Scanner(System.in);
		
        int n, cifras;
  
        
       
            System.out.print("Introduce un n�mero entero: ");
            n = vivo.nextInt();
            
            cifras = 0;    
            
            while(n != 0){ 
                     
                    n = n/10;         
                   cifras++;         
            }
            
            System.out.println("El n�mero tiene " + cifras+ " cifras");

	}

}
