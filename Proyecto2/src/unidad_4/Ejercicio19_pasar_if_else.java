/*19. Reescribe los siguientes códigos utilizando sentencias if-else
 	a. score = (x > 10) ? 3 * scale : 4 * scale;
	b. tax = (income > 10000) ? income * 0.2 : income * 0.17 + 1000;
	c. System.out.println((number % 3 == 0) ? i : j);
 
 */

package unidad_4;
import java.util.Scanner;
public class Ejercicio19_pasar_if_else {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

			Scanner memory = new Scanner (System.in);
			int score, scale, tax, income, number, x, i, j;
			System.out.println("introduce la escala: ");
			x = memory.nextInt();
			scale = 5;
			
			if (x > 10)
			score = 3*scale;
			else
			score = 4*scale;
			
			
	}

}
