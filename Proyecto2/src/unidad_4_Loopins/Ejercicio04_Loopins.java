/*4. Cuál es la salida del siguiente código. Explica la razón
 

*/

package unidad_4_Loopins;
import java.util.Scanner;
public class Ejercicio04_Loopins {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner memory = new Scanner (System.in);
		
		int x = 80000000;
		while (x > 0)
		x++;
		System.out.println("x is " + x);
	}
}// x is -2147483648
