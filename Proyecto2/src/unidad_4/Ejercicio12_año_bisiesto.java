package unidad_4;
import java.util.Scanner;
public class Ejercicio12_año_bisiesto {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner memory = new Scanner(System.in);
		int año;
		System.out.println("¿Es el año bisiesto o no?, marca 365 para normal o 366 para bisiesto");
		año = memory.nextInt();
		
			if (año % 4 == 0 && año % 100 != 0) {
			System.out.println("El año es bisiesto");
			}
			else {
				System.out.println("El año es normal");
			}
	}

}
