/*17. Cu�l es resultado de estos programas. Cu�l es la funci�n de break y continue
*/

package unidad_4_Loopins;
import java.util.Scanner;
public class Ejercicio17_Loopins {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
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