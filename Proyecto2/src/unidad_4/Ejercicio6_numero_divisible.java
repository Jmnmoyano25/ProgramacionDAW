/*6. Crea un programa que verifique si un n�mero es divisible por 2 y por 3 a la vez, por 2 � por
3, y por 2 � 3 pero no ambos.*/

package unidad_4;
import java.util.Scanner;
public class Ejercicio6_numero_divisible {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		Scanner memory = new Scanner(System.in);
		int divALaVez, divUnoUOtro, divNoAmbos, a;
		
		
		System.out.println("Dame un n�mero entero: ");
		a = memory.nextInt();
		
		if (a%3==0 && a%2==0) {
			System.out.printf("El n�mero %d es divisible por 2 y 3 a la vez.%n",a);
		}
		else {
			System.out.printf("El n�mero %d no es divible por 2 y 3 a la vez.%n", a);
		}
		if (a%2==0 || a%3==0) {
			System.out.printf("El n�mero %d es divisible por 2 o por 3.%n",a);
		}
		else {
			System.out.printf("El n�mero %d no es divisible por 2 o por 3.%n",a);
		}
		if (a%2==0 ^ a%3==0) {
			System.out.printf("El n�mero %d es divisible por 2 o por 3, pero no por ambos.%n",a);
		}
		else {
			System.out.printf("El n�mero %d es divisible por 2 y por 3, queriamos que solo fuese divisible por uno de los dos.%n",a);
		}
	}/*end void main*/
}/*end plublic class*/
