/*3. Cuántas veces se repite el cuerpo del loop. Cuál es la salida de cada loop.


a) nada 
b) nada
c) 3, 5, 7, 9
*/

package unidad_4;
import java.util.Scanner;
public class Ejercicio03_Loopins {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner memory = new Scanner (System.in);
		
		int i = 1;
		while (i < 10) {
			if ((i++) % 2 == 0)
			
				System.out.println(i);
		}
	}
}
