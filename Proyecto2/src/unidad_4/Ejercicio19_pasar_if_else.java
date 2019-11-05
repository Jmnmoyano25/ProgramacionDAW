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
			int score, scale, number, x, i, j;
			double tax, income;
			System.out.println("introduce el x: ");
			x = memory.nextInt();
			System.out.println("introduce el income: ");
			income = memory.nextDouble();
			System.out.println("introduce el number: ");
			number = memory.nextInt();
			scale = 5;
			i = 1;
			j = 3;
			
			if (x > 10)
			score = 3*scale;
			else
			score = 4*scale;
			
			System.out.printf("\nScore vale: %d",score);
			
			if (income > 10000)
			tax = income*0.2;
			else
			tax = income*0.17+1000;
			
			System.out.printf("\nIncome vale: %f",tax);
			
			if (number % 3 == 0)
			System.out.println("\n"+i);
			else
			System.out.println("\n5"+j);
			
			
	}

}
