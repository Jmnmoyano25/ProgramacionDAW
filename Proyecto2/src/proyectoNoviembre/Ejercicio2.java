/*Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares hay dentro de
un número. Se recomienda usar long en lugar de int ya que el primero admite números más
largos. (3p)

Ejemplo 1:
Por favor, introduzca un número entero positivo: 406783
El 406783 contiene 4 dígitos pares y 2 dígitos impares.
Ejemplo 2:
Por favor, introduzca un número entero positivo: 3177840
El 3177840 contiene 3 dígitos pares y 4 dígitos impares.

Tambien vamos a decir cuales son primos y cuales no
*/

package proyectoNoviembre;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner memory = new Scanner (System.in);
		
		long num, digito, numOrigen;
		int pares = 0, impares = 0;
		int contador = 0;
		
		
		System.out.println("Numero: ");
		num = memory.nextLong();
		numOrigen = num;
		while (num > 0) {
			digito = num % 10;
			
			if(digito % 2 == 0)
				pares++;
			else
				impares++;
			num /= 10;
			for (int i = 1; i<= digito;i++)
				if (digito % i == 0) {
					contador++;
				}
			if(contador <= 2)
				System.out.println(digito+" es primo");
			else
				System.out.println(digito+" no es primo");
			contador = 0;
		}
		System.out.println(numOrigen+" contine "+pares+" digitos pares y "+impares+" digitos impares.");

		
		

		
		

	}

}
