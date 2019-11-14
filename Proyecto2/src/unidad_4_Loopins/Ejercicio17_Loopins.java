/*17. Cuál es resultado de estos programas. Cuál es la función de break y continue
*/

package unidad_4_Loopins;
import java.util.Scanner;
public class Ejercicio17_Loopins {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner input = new Scanner(System.in);
		
		int balance = 100;
		while (true) {
			if (balance < 9)
				break;
			balance = balance -9;
		}
		System.out.println("Balance is " +balance);
	}
}