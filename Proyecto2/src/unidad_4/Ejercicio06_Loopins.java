/*6. Sup�n que la entrada es 2 3 4 5 0. Qu� salida tiene el programa
*/

package unidad_4;
import java.util.Scanner;
public class Ejercicio06_Loopins {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		Scanner input = new Scanner(System.in);
		
		int number, max;
		System.out.println("2, 3, 4, 5 o 0:");
		number = input.nextInt();
		max = number;
		
		do {
		System.out.println("2, 3, 4, 5 o 0:");	
		number = input.nextInt();
		if (number > max)
		max = number;
		} while (number != 0);
		System.out.println("max is " + max);
		System.out.println("number " + number);
		}
		}
//antes del while si number != 0 no entra el while, si number == 0 entra el while, si number > max imprime, si no continua el while