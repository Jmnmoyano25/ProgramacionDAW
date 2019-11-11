/*7. Convierte el siguiente while en un do-while
 * 
 * Scanner input = new Scanner(System.in);
int sum = 0;
System.out.println("Enter an integer " +
"(the input ends if it is 0)");
int number = input.nextInt();
while (number != 0) {
sum += number;
System.out.println("Enter an integer " +
"(the input ends if it is 0)");
number = input.nextInt();
}
*/

package unidad_4;
import java.util.Scanner;
public class Ejercicio07_Loopins_While_aDoWhile {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.println("Enter an integer " +
		"(the input ends if it is 0)");
		
		int number = input.nextInt();
		
		do {
		 
		sum += number;
		System.out.println("Enter an integer " +
		"(the input ends if it is 0)");
		number = input.nextInt();
		
		} while (number != 0);
	}
}
//antes del while si number != 0 no entra el while, si number == 0 entra el while, si number > max imprime, si no continua el while