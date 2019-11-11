/*13. Identifica y corrigle los errores en el siguiente código
 * 
 * 1---i=0, j=1
 * 2---i
 * 
 * 
 * */
package unidad_4;
import java.util.Scanner;
public class Ejercicio16_Loopins_SalidaProgramas {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner memory = new Scanner (System.in);

		for (int i = 1; i < 5; i++) {
			int j = 0;
			while (j < i) {
				System.out.println("i es " + i + " j es "+j);
				j++;
				
			}
		}
	}

}
