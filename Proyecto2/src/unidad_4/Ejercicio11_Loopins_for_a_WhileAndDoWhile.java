/*11. Convierte este loop for en while y en un do-while:

long sum = 0;
for (int i = 0; i <= 1000; i++)
sum = sum + i;
*/

package unidad_4;
import java.util.Scanner;
public class Ejercicio11_Loopins_for_a_WhileAndDoWhile {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		 Scanner memory = new Scanner(System.in);
		 
		/* long sum = 0;
		 int i = 0;
		 
		 while (i <= 1000) {
			 i++;
			sum = sum + i;
			System.out.println(sum);
		 }*/
		 long sum = 0;
		 int i = 0;
		 
		 do {
			 i++;
			sum = sum + i;
			System.out.println(sum);
		 } while (i <= 1000);
		 
	}
}