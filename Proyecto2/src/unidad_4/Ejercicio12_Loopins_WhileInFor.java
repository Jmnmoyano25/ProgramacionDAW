/*12. Convierte este loop while en un for:

int i = 1;
int sum = 0;
while (sum < 10000) {
sum = sum + i;
i++;
}
*/

package unidad_4;
import java.util.Scanner;
public class Ejercicio12_Loopins_WhileInFor {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		 Scanner memory = new Scanner(System.in);
		 
		 int sum = 0;
		 
		 for (int i = 1;sum < 10000;i++) {
			sum = sum +i;
			System.out.println(sum);
		 }
		  
		
		 /*int i = 1;
		 int sum = 0;
		 while (sum < 10000) {
		 sum = sum + i;
		 i++;
		 }*/
		 
	}
}