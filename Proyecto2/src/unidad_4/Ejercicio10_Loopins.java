/*10. Supón la entrada de 2, 3, 4, 5, 0. Cuál es la salida del siguiente programa
 import java.util.Scanner;
public class Test {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int number, sum = 0, count;
for (count = 0; count < 5; count++) {
number = input.nextInt();
sum += number;
}
System.out.println("sum is " + sum);
System.out.println("count is " + count);
}
}

*/

package unidad_4;
import java.util.Scanner;
public class Ejercicio10_Loopins {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		 Scanner input = new Scanner(System.in);
		 
		 int number, sum = 0, count;
		 
		 for (count = 0; count < 5; count++) {
			 System.out.println("2, 3, 4, 5, 0");
		 number = input.nextInt();
		 sum += number;
		 }
		 System.out.println("sum is " + sum);
		 System.out.println("count is " + count);
		 }
		 }//Suma el digito anterior al siguiente, sum es el total y count cuenta hasta 5