/*21. El formato ISBN-10 (International Standard Book Number) tiene 10 dígitos:
d1d2d3d4d5d6d7d8d9d10 . El último dígito d10 se saca a partir de los otros 9 con la
siguiente fórmula:
(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) %
11
Si la suma de comprobación es 10, el último dígito se denota con X. Escribe un programa que
introduciendo los 9 dígitos muestre el ISBN-10. La entreda debe ser con variable entera

//Ejemplos
Enter the first 9 digits of an ISBN as integer: 013601267
The ISBN-10 number is 0136012671
Enter the first 9 digits of an ISBN as integer: 013031997
The ISBN-10 number is 013031997X
*/


package unidad_4;
import java.util.Scanner;
public class Ejercicio21_IBSN {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
	Scanner memory = new Scanner(System.in);
	
	int d1, d2, d3, d4, d5, d6, d7, d8, d9;
	
	
	System.out.println("Enter the first 9 digits of an ISBN as integer: ");
	d1 = memory.nextInt();
	d2 = memory.nextInt();
	d3 = memory.nextInt();
	d4 = memory.nextInt();
	d5 = memory.nextInt();
	d6 = memory.nextInt();
	d7 = memory.nextInt();
	d8 = memory.nextInt();
	d9 = memory.nextInt();
	
	System.out.println("The ISBN-10 number is " +d1+d2+d3+d4+d5+d6+d7+d8+d9+(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) %
			11);
	
	
	}

}
