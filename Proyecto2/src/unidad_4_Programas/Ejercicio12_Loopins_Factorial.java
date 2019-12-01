/*Ejercicio 12: Escribe un programa que calcule el factorial de un número entero leído por teclado.
Ejemplo*/

package unidad_4_Programas;
import java.util.Scanner;
public class Ejercicio12_Loopins_Factorial {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner qwerty = new Scanner(System.in);
		int numero, factorizado = 1, numeroReal;
		int numero2, factorizado2 = 1, numeroReal2;
		int numero3, factorizado3 = 1, numeroReal3;
		
		System.out.println("Escribre un número entero para sacar su factorial con while: ");
		numero = qwerty.nextInt();
		numeroReal = qwerty.nextInt();
		System.out.println("Escribre un número entero para sacar su factorial con for: ");
		numero2 = qwerty.nextInt();
		numeroReal2 = qwerty.nextInt();
		System.out.println("Escribre un número entero para sacar su factorial con do-while: ");
		numero3 = qwerty.nextInt();
		numeroReal3 = qwerty.nextInt();
		
		while(numero > 0) {
			factorizado *= numero;
			
			numero--;
		}
		
	
		for (factorizado2 = 1; numero2 > 0; numero2--) {
			factorizado2 *= numero2;
		}
		
		do {
			factorizado3 *= numero3;
			numero3--;
		}while(numero3 != 0);
		System.out.println("El factorial de: "+numeroReal+" es "+factorizado);
		System.out.println("El factorial de: "+numeroReal2+" es "+factorizado2);
		System.out.println("El factorial de: "+numeroReal3+" es "+factorizado3);
	}

}
