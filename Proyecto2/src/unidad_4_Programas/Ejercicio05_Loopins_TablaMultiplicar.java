/*Ejercicio 5 : Muestra la tabla de multiplicar de un n�mero introducido por teclado.*/

package unidad_4_Programas;
import java.util.Scanner;
public class Ejercicio05_Loopins_TablaMultiplicar {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		Scanner vivo = new Scanner(System.in);
		int x, y;
		System.out.println("Escribe un numero y te muestro la tabla de multiplicar hasta el 10");
		x = vivo.nextInt();
		for(int i = 0; i <= 10;i++) {
			y = x * i;
			System.out.println(x + " por " + i + " = "+ y);	 
		}
	}

}
