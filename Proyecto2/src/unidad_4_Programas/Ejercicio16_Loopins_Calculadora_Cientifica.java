/*EJERCICIO 16

Escribe un programa que tenga el siguiente menú de una calculadora científica básica

########### CALCULADORA CIENTÍFICA ###########
1. Números primos entre dos enteros positivos dados.
2. Cálculo x en la ecuación ax + b = 0 (a y b son dados)
3. Cálculo del tiempo t que tardará en caer un objeto desde una altura h. Siendo
(t = SQRT((2*h)/g). g = 9.81 m/s^2
4. Salir de programa
*/

package unidad_4_Programas;
import java.util.Scanner;
public class Ejercicio16_Loopins_Calculadora_Cientifica {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner sc = new Scanner(System.in);
		
		//VARIABLES
		//case 1
		int z, i;
		int opcion, num1, num2;
		int contador = 0;
		//caso 2
		double a, b, x;
		//caso 3
		double h, t, g= 9.81;
		
		System.out.println("########## CALCULADORA CIENTÍFICA #########");
		System.out.println("1. Números primos entre dos enteros positivos dados.");
		System.out.println("2. Cálculo x en la ecuación ax + b = 0 (a y b son dados)");
		System.out.println("3. Cálculo del tiempo t que tardará en caer un objeto desde una altura h. Siendo: \n(t = SQRT((2*h)/g). g = 9.81 m/s^2)");
		System.out.println("4. Salir de programa");
		
		System.out.println("Opción: ");
		opcion = sc.nextInt();
		

			switch(opcion) {
				case 1:
			System.out.println("Escribe 2 enteros positivos: ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			if (num1 < num2) {
				for(z = num1; z <= num2; z++) {
					for(i = 1; i <= z; i++) {
						if(z % i == 0)
							contador++;
					}
					if (contador <=2)
					System.out.println(z+" es primo");
					else
					System.out.println(z+" no es primo");
					contador=0;
				}
				
			}else {
				for(z = num1; z >= num2; z--) {
					for(i = 1; i <= z; i++) {
						if(z % i == 0)
							contador++;
					}
					if (contador <=2)
					System.out.println(z+" es primo");
					else
					System.out.println(z+" no es primo");
					contador=0;
				}
			}				
					break;
					//FIN DEL CASE 1
				case 2:
			System.out.println("Escribe los valores de a y b: ");
			a = sc.nextDouble();
			b = sc.nextDouble();
			//ax + b = 0, 1º ax = -b, 2º ax/a = -b/a 3º x = -b/a
			x = -b / a;
			System.out.printf("El valor de x es: %.2f",x);
					break;
					//FIN DEL CASE 2
				case 3:
			//(t = SQRT((2*h)/g). g = 9.81 m/s^2)
			System.out.println("Cual es la altura: ");
			h = sc.nextDouble();
			
			t = Math.sqrt((2*h)/g);
			System.out.printf("El tiempo que tarda en caer el objeto sera: %.2f%s",t,"s");
					break;
					//FIN DEL CASE 3
				case 4:
			System.out.println("Fin de la calculadora");
			break;
					//FIN DEL CASE 4
			default:
				System.out.println("La opcion introducida es incorrecta");
			
			}
		
	}

}
