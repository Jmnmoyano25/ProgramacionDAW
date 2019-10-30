/* vlaores del ejercicio 
 x=2 y=3
 x=3 y=4
 x=2 y=2
 */
package unidad_4;

import java.util.Scanner;
public class Ejercicio1_if {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner memory =new Scanner(System.in);
		int x, y, z;
		
		System.out.println("Ingresa el valor de x: ");
		x = memory.nextInt();
		System.out.println("Ingresa el valor de y: ");
		y = memory.nextInt();
		
		if (x>2) {
			if (y>2) {
				z = x + y;
				System.out.println("z es: " +z);
				
			}
		}else System.out.println("x es: "+x);
	}

}
