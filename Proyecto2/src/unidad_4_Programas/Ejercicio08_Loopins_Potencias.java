/*Ejercicio 8: Escribe un programa que pida una base y un exponente (entero positivo) y que
calcule la potencia.*/

package unidad_4_Programas;

import java.util.Scanner;
public class Ejercicio08_Loopins_Potencias {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner memory = new Scanner(System.in);
			int resultado, base, exp, i=0;
			double resultadoDou, baseDou, expDou;
			
			
			do{
			System.out.print("Introduzca la base: ");
		    base = memory.nextInt();
		    baseDou = (int) base;
		    System.out.print("Introduzca el exponente: ");
		    exp = memory.nextInt();
		    expDou = (int) exp;
			
		    resultadoDou = Math.pow(baseDou, expDou);
		    
		    resultado = (int) resultadoDou;
		    
				
			System.out.println(base+"^"+exp+" = "+resultado);
			i++;
			}while(i<5);
	}

}
