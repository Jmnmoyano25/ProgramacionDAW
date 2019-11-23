/*Crea un un programa que pida dos puntos por teclado (x1, x2) e (y1, y2) 
 * y muestre la distancia de ambos puntos. La fórmula utilizada es 
 * sqrt((x2 - x1)^2 + (y2-y1)^2)) . 
 * El símbolo sqrt es raíz cuadrada y ^ es el exponente. 
 * Se pueden utilizar la funciones Math.pow y Math.sqrt.
 */

package unidad2;
import java.util.Scanner;
public class Ejercicio11DistanciaEntreLineas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner memory = new Scanner (System.in);
	int x1, x2, y1, y2;
	double resultado;
	
	System.out.print("dame el punto x1:");
	x1 = memory.nextInt();
	
	System.out.print("dame el punto x2:");
	x2 = memory.nextInt();
	
	System.out.print("dame el punto y1:");
	y1 = memory.nextInt();
	
	System.out.print("dame el punto y2:");
	y2 = memory.nextInt();
	
	resultado = Math.pow(Math.sqrt(x2 - x1), 2 + Math.pow((y2 - y1), 2));
	
	System.out.printf("la distancia entre los dos puntos es: %f",resultado);
	
	}

}
