/*13. (**Lab Práctico**): Vamos a crear un programa de gestión de préstamos
en el que se solicitan los siguientes requisitos:

El usuario debe introducir la tasa de interés, la cantidad total del 
préstamo y los años en los que los pagos de la deuda se realizan.

Debe procesarse y mostrar el pago mensual y la cantidad total de los pagos.

El pago mensual y el total del pago se calculan con las siguientes fórmulas:
```
pagoMensual = ( totalPrestamo * tasaDeInteresMensual ) / (1 - 1 / ((1  + tasaDeInteresMensual ) ^ ( numAnyos x 12 )))

totalPago = pagoMensual * numAnyos * 12
```
* El interés debe ser un porcentaje 4.5% por ejemplo, si quieres obtener 
el interés mensual debes dividir por 100 y luego dividir por 12. 

Puedes utilizar las funciones Math que necesites.

Un ejemplo sería de programa sería:

```
Introduce la tasa de interés, por ejemplo, 7.25: 5.75
Introduce el número de años como entero, por ejemplo 5: 15
Introduce la cantidad del pŕestamo, por ejemplo: 120000.95: 250000 
La mensualidad a pagar es: $2076.02
El pago total es: $373684.53
```*/

package unidad_2;
import java.util.Scanner;
public class Ejercicio13Prestamos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner memory = new Scanner (System.in);
		
		double Tprestamo,TIM, anios, Tpago, Pmensual;
		
		System.out.println("Ingresa la Tasa de Interes Mensual (TIM) ej. 7,25: ");
		TIM = memory.nextDouble();
		System.out.println("\nIngresa la cantidad total del prestamo ej. 20000: ");
		Tprestamo = memory.nextDouble();		
		System.out.println("\nEn cuantos años quieres pagarlo ej. 15: ");
		anios = memory.nextDouble();
		
		Pmensual = (Tprestamo * TIM) / (1-1 / (Math.pow(1+TIM, anios)));
		
		Tpago = Pmensual * anios * 12;
		
		System.out.printf("La mensualidad a pagar es de: %f€%n", Pmensual);
		System.out.printf("El pago total con intereses asciende a: %f€%n", Tpago);
	}

}
