/*Ejercicio 10 Escribe un programa que permita ir introduciendo una serie indeterminada de
n�meros mientras su suma no supere el valor 10000. Cuando esto �ltimo ocurra, se debe
mostrar el total acumulado, el contador de los n�meros introducidos y la media.*/

package unidad_4_Programas;
import java.util.Scanner;
public class Ejercicio10_Loopins_Hasta1000 {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		Scanner memory = new Scanner(System.in);
		int x, total=0, contador = 0, media;
		
		System.out.println("\nCuando lleguemos a 1000 paramos");
		
		while (total < 1000){
			System.out.println("\nIntroduce un numero entero: ");
			x = memory.nextInt();
			
			contador++;
				
			
			total += x;
			
		}
		
		media = total / contador;
		System.out.println("\nHas sumado un total de: "+total);
		System.out.println("\nHas introducido un total de: "+contador+" n�meros");
		System.out.println("\nLa media de los n�meros introducidos es: "+media);
				
		
	}

}
