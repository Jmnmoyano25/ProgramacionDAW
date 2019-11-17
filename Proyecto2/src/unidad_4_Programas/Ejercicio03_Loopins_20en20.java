/*Ejercicio 3 Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle
do-while, un bucle while y otro for.*/

package unidad_4_Programas;

public class Ejercicio03_Loopins_20en20 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		int x = 360;
		while(x > 159) {
			System.out.println("while" + x);
			x-=20;
		}
		x = 360;
		do {
			System.out.println("do-while" + x);
			x-=20;
		}while (x >=160);
		for(x = 360;x > 159; x-=20) {
			System.out.println("for" + x);
		}
	}

}
