/*3. Cu�ntas veces se repite el cuerpo del loop. Cu�l es la salida de cada loop.


a) nada 
b) nada
c) 3, 5, 7, 9
*/

package unidad_4;
import java.util.Scanner;
public class Ejercicio03_Loopins {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		Scanner memory = new Scanner (System.in);
		
		int i = 1;
		while (i < 10) {
			if ((i++) % 2 == 0)
			
				System.out.println(i);
		}
	}
}
