/*5. Supón que la entrada es 2, 3, 4, 5, 0. Qué salida tiene este programa:
 

*/

package unidad_4;
import java.util.Scanner;
public class Ejercicio05_Loopins {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner memory = new Scanner (System.in);
		
		int x = 80000000;
		while (x > 0)
		x++;
		System.out.println("x is " + x);
	}
}// x is -2147483648
