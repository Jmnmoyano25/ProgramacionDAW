/*Ejercicio 1 Muestra los números múltiplos de 5 de 0 a 100
utilizando un bucle while.
utilizando un bucle do-while.
utilizando un bucle for.
*/

package unidad_4_Programas;

public class Ejercicio01_Loopins_MultiplosDe5y0 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		int mult = 0;
		while (mult < 101){
			if (mult % 5 == 0)
			System.out.println("while"+mult);
			mult++;
		}//fin del while
		mult = 0;
		do {
			if (mult % 5 == 0)
				System.out.println("do-while"+mult);
				mult++;
		}while(mult < 101);
		
		for (mult = 0; mult < 101; mult++) {
			if (mult % 5 == 0)
			System.out.println("for"+mult);
		}
		
		
	}

}
