/*13. Escribir un programa de lotería que esté compuesta por dos dígitos. Estos deben generarse
aleatoriamente. El usuario juega a la lotería introduciendo los dos dígitos por teclado y el
programa debe ser capaz de verificar los dígitos ordenadamente con los generados en la
lotería. Una vez verificado, la lotería tiene los siguientes premios:
1. 10000€ si los dígitos son los mismos en el mismo orden
2. 3000€ si en el caso que sean los mismos dígitos pero en diferente orden
3. 1000€ si existe un dígito coincidente.
Asumimos que si el usuario introduce el teclado el 7, debe introducirlo con 0 delante: 07.
*/

package unidad_4;
import java.util.Scanner;
public class Ejercicio13_Loteria {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner memory = new Scanner (System.in);
		
		double a, b;
		double usuario_a, usuario_b;
		
		System.out.println("Ingresa un numero entero del 0 al 9");
		usuario_a = memory.nextDouble();
		System.out.println("Ingresa un numero entero del 0 al 9");
		usuario_b = memory.nextDouble();
		
		a = Math.floor(Math.random()*(0-9)+9);
		b = Math.floor(Math.random()*(0-9)+9);
	 do {	
		if (usuario_a == a && usuario_b == b) {
			System.out.println("¡¡Has ganado 10000€!!");
		}
		if (usuario_a == b && usuario_b == a) {
			System.out.println("¡¡Has ganado 3000€!!");
		}
		if (usuario_a == a || usuario_a == b || usuario_b == a || usuario_b == b) {
			System.out.println("¡¡Has ganado 1000€!!");
		}
		else {
			System.out.println("Suerte la próxima vez");
		}
	}while((usuario_a != a) || (usuario_a != b) || (usuario_b != a || usuario_b != b));
	}
}

