/*10. Realiza un programa que calcule la nota que hace falta sacar en el segundo
examen de la asignatura Programación para obtener la media deseada. Hay
que tener en cuenta que la nota del primer examen cuenta el 40% y la del
segundo examen un 60%.

Ejemplo 1:
```
Introduce la nota del primer examen: 7
¿Qué nota quieres sacar en el trimestre? 8.5
Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo examen.
```
Ejemplo 2:
```
Introduce la nota del primer examen: 8
¿Qué nota quieres sacar en el trimestre? 7
Para tener un 7 en el trimestre necesitas sacar un 6.33 en el segundo examen*/

package unidad2;

import java.util.Scanner;

public class Ejercicio10MediaExamenProgramacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
	Scanner memory = new Scanner(System.in);
	
	double nota1, nota2, media;
	
	System.out.print("Que nota sacaste en el primer examen: ");
	nota1 = memory.nextDouble();
	
	System.out.print("¿Qué nota quieres sacar en el trimestre? ");
	media = memory.nextDouble();
	
	nota2 = ((media*100)-(nota1*40))/60;
	
	System.out.printf("La segunda nota tiene que ser: %f",nota2);
	}

}
