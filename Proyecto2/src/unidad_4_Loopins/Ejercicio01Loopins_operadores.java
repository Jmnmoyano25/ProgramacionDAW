/*1. Utiliza los operadores &&, ||, ^. Escribe un programa que impirma que el usuario
introduzca un int y determine si es divisible por 4 y 5, si es divisible por 4 ó 5 y si es divisible
por 4 o 5 pero no ambos.
*/

package unidad_4_Loopins;
import java.util.Scanner;
public class Ejercicio01Loopins_operadores {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner memory = new Scanner(System.in);
		
		int valor;
		System.out.println("Escribe un numero entero: ");
		valor = memory.nextInt();
		
		if (valor % 4 == 0 && valor % 5 == 0) {
			System.out.println("El valor introducido es divisible por 4 y 5");
		}
		else if (valor % 4 == 0 ^ valor % 5 == 0) {
			System.out.println("El valor introducido es divisible por 4 o 5 pero no por ambos");
		}
		if (valor % 4 == 0 || valor % 5 == 0) {
			System.out.println("El valor introducido es divisible por 4 o 5");
		}
		else {
			System.out.println("El valor introducido no es valido");
		}
	}

}
