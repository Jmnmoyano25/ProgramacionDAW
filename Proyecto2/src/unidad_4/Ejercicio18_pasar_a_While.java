/*18. Reescribe el siguiente código con operador condicional y = (x > 0) ? 1 : −1;
	
	if (ages >= 16)
	ticketPrice = 20;
	else
	ticketPrice = 10;
*/

package unidad_4;
import java.util.Scanner;
public class Ejercicio18_pasar_a_While {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner memory = new Scanner (System.in);
		int ages, precio;
		System.out.println("Escribe tu edad: ");
		ages = memory.nextInt();
		
		precio = ages >= 16 ? 20 : 10;
		
		System.out.println("Tu entrada vale " +precio+ "€");
		
	}
}

