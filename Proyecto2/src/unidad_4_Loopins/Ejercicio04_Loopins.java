/*4. Cu�l es la salida del siguiente c�digo. Explica la raz�n
 

*/

package unidad_4_Loopins;
import java.util.Scanner;
public class Ejercicio04_Loopins {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		Scanner memory = new Scanner (System.in);
		
		int x = 80000000;
		while (x > 0)
		x++;
		System.out.println("x is " + x);
	}
}// x is -2147483648
