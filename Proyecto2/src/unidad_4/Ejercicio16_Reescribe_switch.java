/*16. Qu� vale x al finalizar la sentencia if-else . Reescribe el c�digo con switch y haz un
diagrama de flujo ilustrando el funcionamiento.
 
	int x = 1, a = 3;
	if (a == 1)
	x += 5;
	else if (a == 2)
	x += 10;
	else if (a == 3)
	x += 16;
	else if (a == 4)
	x += 34;
*/

package unidad_4;
import java.util.Scanner;
public class Ejercicio16_Reescribe_switch {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		Scanner memory = new Scanner (System.in);
		int x, a;
		x = 1;
		System.out.println("Di un n�mero del 1 al 4 para a: ");
		a = memory.nextInt();
		
		switch (a) {
		case 1:
			x += 5;
			System.out.printf("x vale ahora %d",x);
			break;
		case 2:
			x += 10;
			System.out.printf("x vale ahora %d",x);
			break;
		case 3:
			x += 16;
			System.out.printf("x vale ahora %d",x);
			break;
		case 4:
			x += 34;
			System.out.printf("x vale ahora %d",x);
			break;
		default:
			System.out.println("el valor de a no es v�lido");
		}
	
	}
}

