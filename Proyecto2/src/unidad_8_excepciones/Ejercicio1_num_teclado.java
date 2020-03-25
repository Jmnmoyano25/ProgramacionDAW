
package unidad_8_excepciones;

import java.util.*;

public class Ejercicio1_num_teclado {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner sc = new Scanner(System.in);
		String[] cont = {"primero","segundo","tercero","cuarto","quinto","sexto"};
		//int cont = 1;
		int i = 0;
		boolean correcto = false;
		//int num = 0;
		
		do {
			try {
				System.out.println("Escribe el "+cont[i]+" numero entero por teclado: ");
				int num = Integer.parseInt(sc.nextLine());
				correcto = true;
				i++;
			}catch(Exception e) {
				System.out.println("El numero introducido no es un entero");
				System.out.println("Introduce el valor de nuevo");
				correcto = false;
			}
			if(correcto == true) {
			System.out.println("El numero introducido es CORRECTO!!\n\n");
			}else {
				System.out.println("El numero intruducido es ERRONEO!!\n\n");
			}

		}while (i < 6);
		System.out.println("Programa terminado");
		
	}

}
