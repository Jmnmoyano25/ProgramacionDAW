/*Ejercicio 9: Escribe un programa que diga si un n�mero introducido por teclado es o no primo.
Un n�mero primo es aquel que s�lo es divisible entre �l mismo y la unidad.*/

package unidad_4_Programas;
import java.util.Scanner;
public class Ejercicio09_Loopins_Primos {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		Scanner memory = new Scanner(System.in);
		int x;
		
		boolean resultado = true;
		
		
			System.out.println("\nEscribe un numero entero: ");
			x = memory.nextInt();
			
			for(int num = 2;num < x;num++) {
				if(x % num == 0) {
					
			resultado = false;
				}
			}
			
			if(resultado) {
				System.out.println(x+" Es un n�mero primo");
			}else {
				System.out.println(x+" No es un n�mero primo");
			}
			
		
		
		
	}

}
