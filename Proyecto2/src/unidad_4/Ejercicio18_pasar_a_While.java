/*18. Reescribe el siguiente código con operador condicional
	
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
		int años;
		System.out.println("Escribe tu edad: ");
		años = memory.nextInt();
		
		while (años >= 16){
			System.out.println("El precio de la entrada es de 20€");
		}
		
		System.out.println((x < y && y < z) ? "ordenado" : "no ordenado");
		
	}
}

