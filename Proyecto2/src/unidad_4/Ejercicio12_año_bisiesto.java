package unidad_4;
import java.util.Scanner;
public class Ejercicio12_a�o_bisiesto {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		Scanner memory = new Scanner(System.in);
		int a�o;
		System.out.println("�Es el a�o bisiesto o no?, marca 365 para normal o 366 para bisiesto");
		a�o = memory.nextInt();
		
			if (a�o % 4 == 0 && a�o % 100 != 0) {
			System.out.println("El a�o es bisiesto");
			}
			else {
				System.out.println("El a�o es normal");
			}
	}

}
