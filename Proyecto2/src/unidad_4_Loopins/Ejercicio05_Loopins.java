/*5. Supón que la entrada es 2, 3, 4, 5, 0. Qué salida tiene este programa:
 

*/

package unidad_4_Loopins;
import java.util.Scanner;
public class Ejercicio05_Loopins {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner input = new Scanner(System.in);
		
		int number, max;
		System.out.println("escribe un entero 2, 3, 4, 5, 0:");
		number = input.nextInt();
		max = number;
		
		while (number != 0) {
			System.out.println("escribe un entero 2, 3, 4, 5, 0:");	
		number = input.nextInt();
			if (number > max)
			max = number;
		
		}
			System.out.println("max is " + max);
			System.out.println("number " + number);
	}
}
//antes del while si number != 0 no entra el while, si number == 0 entra el while, si number > max imprime, si no continua el while