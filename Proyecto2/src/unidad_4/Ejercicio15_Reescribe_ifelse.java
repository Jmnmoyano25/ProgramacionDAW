/*15. Reescrie el código con sentencia if-else
 
	x = 3; y = 3;
	switch (x + 3) {
	case 6: y = 1;
	default: y += 1;
	}
*/

package unidad_4;
import java.util.Scanner;
public class Ejercicio15_Reescribe_ifelse {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner memory = new Scanner (System.in);
		int x, y;
		x = 3;
		y = 3;
		
		if (x + y == 3) 
			y = 1;
		
		else y += 1;
	
	}
}

