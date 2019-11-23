/*12. (Separación de los dígitos en un entero) Escribe una aplicación que 
reciba del usuario un número compuesto por cinco dígitos, que separe ese 
número en sus dígitos individuales y los imprima, cada uno separado de los 
demás por tres espacios.

Por ejemplo, si el usuario escribe el número 42339, el programa debe 
imprimir:
```
4   2   3   3   9
```*/

package unidad_2;
import java.util.Scanner;
public class Ejercicio12SeparacionEnteros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner memory = new Scanner (System.in);
		
		int a , decMiles, miles, centena, decena, unidad;
		
		
		
		
		System.out.print("Escribe un numero entero de 5 dígitos: ");
		a = memory.nextInt();
		
		unidad = a%10;
		
		a = a/10;
		decena = a%10;
		
		a = a/10;
		centena = a%10;
		
		a = a/10;
		miles = a%10;
		
		a = a/10;
		decMiles = a%10;
		
		
		
		System.out.printf("El número entero introducido separado en unidades seria asi:\n");
		System.out.printf("\t-- %d\t%d\t%d\t%d\t%d --", decMiles, miles, centena, decena, unidad);
		}

}
