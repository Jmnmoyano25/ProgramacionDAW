/*Ejercicio 7: Escribe un programa que lea una lista de diez n�meros y determine cu�ntos son
positivos, y cu�ntos son negativos.*/

package unidad_4_Programas;
import java.util.Scanner;
public class Ejercicio06_Loopins_PositivosYNegativos {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		Scanner memory = new Scanner(System.in);
			int suma = 0;
			int x;
			int cuentaPos = 0, cuentaNeg = 0;
		do {
			
			System.out.println("Escribe un n�mero entero positivo o negativo: ");
			x = memory.nextInt();
			if(x >= 0){
				cuentaPos++;
			}else {
				cuentaNeg--;
			}
			suma = cuentaPos + cuentaNeg;
			
		}while(suma < 10);
		
		System.out.println("Hay "+cuentaPos+" positivos y "+cuentaNeg+" negativos");
		
	}

}
