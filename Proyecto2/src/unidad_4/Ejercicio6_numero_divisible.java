/*6. Crea un programa que verifique si un número es divisible por 2 y por 3 a la vez, por 2 ó por
3, y por 2 ó 3 pero no ambos.*/

package unidad_4;
import java.util.Scanner;
public class Ejercicio6_numero_divisible {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner memory = new Scanner(System.in);
		int divALaVez, divUnoUOtro, divNoAmbos, a;
		
		
		System.out.println("Dame un número entero: ");
		a = memory.nextInt();
		
		if (a%3==0 && a%2==0) {
			System.out.printf("El número %d es divisible por 2 y 3 a la vez.%n",a);
		}
		else {
			System.out.printf("El número %d no es divible por 2 y 3 a la vez.%n", a);
		}
		if (a%2==0 || a%3==0) {
			System.out.printf("El número %d es divisible por 2 o por 3.%n",a);
		}
		else {
			System.out.printf("El número %d no es divisible por 2 o por 3.%n",a);
		}
		if (a%2==0 ^ a%3==0) {
			System.out.printf("El número %d es divisible por 2 o por 3, pero no por ambos.%n",a);
		}
		else {
			System.out.printf("El número %d es divisible por 2 y por 3, queriamos que solo fuese divisible por uno de los dos.%n",a);
		}
	}/*end void main*/
}/*end plublic class*/
