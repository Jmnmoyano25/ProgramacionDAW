/*11. Cuál es el resultado del siguiente programa con datos introducidos 2, 3 y 6*/ 


package unidad_4;
import java.util.Scanner;
public class Ejercicio11 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		double x = 2, y = 3, z = 6;
		
		System.out.println("(x < y && y < z) is " + (x < y && y < z));
		System.out.println("(x < y || y < z) is " + (x < y || y < z));
		System.out.println("!(x < y) is " + !(x < y));
		System.out.println("(x + y < z) is " + (x + y < z));
		System.out.println("(x + y > z) is " + (x + y > z));
	}
}
/*
(x < y && y < z) is true
(x < y || y < z) is true
!(x < y) is false
(x + y < z) is true
(x + y > z) is false
*/