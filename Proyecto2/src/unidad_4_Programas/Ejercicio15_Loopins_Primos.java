/*EJERCICIO 15
  
Escribe un programa que pida un n�mero entero positivo por teclado y que
muestre a continuaci�n los 5 n�meros consecutivos a partir del n�mero
introducido. Al lado de cada n�mero se debe indicar si se trata de un primo o
no.
Ejemplo:
Por favor, introduzca un n�mero entero positivo: 17
17 es primo
18 no es primo
19 es primo
20 no es primo
21 no es primo
*/


package unidad_4_Programas;
import java.util.Scanner;
public class Ejercicio15_Loopins_Primos {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		Scanner sc = new Scanner(System.in);
		int num;
		int contador = 0;//esta nos da si es primo o no

		
		System.out.println("Ingresa un numero entero positivo: ");
		num = sc.nextInt();
		
		for(int j = 0; j < 4; j++) {
			
			for(int i = 1; i <= num; i++) {//PARA UN NUMERO FUNCIONA, PERO EN EL BUCLE NO
				if((num % i) == 0){
					contador++;
				}
								
			}
			if(contador <= 2) {
				System.out.println(num+" es primo.");
			}else {
				System.out.println(num+" no es primo.");
			}
		
			
		/*	int contador = 2;
		 	boolean primo=true;	
			while ((primo) && (contador!=num)){
			  if (num % contador == 0)
			    primo = false;
			  contador++;
			}
			System.out.println(primo);*///METODO DE INTERNET
			num++;
			contador=0;
		}

	}

}
