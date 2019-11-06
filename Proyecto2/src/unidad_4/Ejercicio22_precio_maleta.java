/*22. Una empresa de transporte utiliza la siguiente función para calcular el cose en USD$ de
transporte basado en su peso en libras. Escribe el programa que permita que el usuario
introduzca el peso del packete y mueste el coste de transporte. Si el peso es > 20, muestra el
mensaje "el paquete no puede ser enviado".

		2.5,  if 0  < w < = 2
		4.5,  if 2  < w < = 4
		7.5,  if 4  < w < = 10
		10.5, if 10 < w < = 20

*/

package unidad_4;
import java.util.Scanner;
public class Ejercicio22_precio_maleta {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner memory = new Scanner (System.in);
		double peso, pesotot;
		
		System.out.println("Ingresa el peso de la maleta: ");
		peso = memory.nextDouble();
		
		if (peso <= 2) {
			pesotot = peso * 2.5;
			System.out.printf("El coste de su viaje asciende a: %f%n",pesotot);
		}
			else if (peso <= 4) {
				pesotot = peso * 4.5;
				System.out.printf("El coste de su viaje asciende a: %f%n",pesotot);
			}	
				else if (peso <= 10) { 
					pesotot = peso * 7.5;
					System.out.printf("El coste de su viaje asciende a: %f%n",pesotot);
				}	
					else if (peso <= 20) {
						pesotot = peso * 10.5;
						System.out.printf("El coste de su viaje asciende a: %f%n",pesotot);
					}
						else 
							System.out.println("El peso introducido es mayor de 20, no te permite viajar");
						
	}

}
