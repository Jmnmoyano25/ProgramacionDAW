/*EJERCICIO 14.

Escribe un programa que, dado un número entero positivo, diga cuáles son y
cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden. Usa
long en lugar de int donde sea necesario para admitir
números largos.

Por favor, introduzca un número entero positivo: 94026782
Dígitos pares: 4 0 2 6 8 2
Dígitos impares: 9 7
Suma de los dígitos pares: 22
Suma de los dígitos pares: 16
*/

package unidad_4_Programas;
import java.util.Scanner;
public class Ejercicio13_Loopins_Pares_Impares {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner sc = new Scanner(System.in);
		long numero, digitos;
		int pares = 0, impares = 0;
		
		System.out.println("Escribe un numero entero: ");
		numero = sc.nextLong();
		
		while(numero != 0) {
			digitos = numero % 10;
			if(digitos % 2 == 0) 
				pares++;
			else
				impares++;
			numero /= 10;
		}
		System.out.println("Digitos pares: "+pares);
		System.out.println("Digitos impares: "+impares);
	}

}
