/*Ejercicio 7: Escribe un programa que lea una lista de diez números y determine cuántos son
positivos, y cuántos son negativos.*/

package unidad_4_Programas;
import java.util.Scanner;
public class Ejercicio06_Loopins_PositivosYNegativos {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner memory = new Scanner(System.in);
			int suma = 0;
			int x;
			int cuentaPos = 0, cuentaNeg = 0;
		do {
			
			System.out.println("Escribe un número entero positivo o negativo: ");
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
