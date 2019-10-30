/*9. (Ejercicio Financiero): Supón que tienes 100€ de beneficio mensual en una
 *  cuenta bancaria con un interés anual de 3.75%. El interés mensual
 *   sería: 0.0375/12 = 0.003125. 
 *
* Después del primer mes la ganancia sería: 100 + (0.003125 *100) = 100.3125
* Después del segundo mes sería de: (100.3125 + 100) * ( 1 + .003125) = 200.9384765625

Realiza un programa que calcule y muestre por pantalla el beneficio de los 6 primeros meses.
 De entrada pide el beneficio mensual, ej 100€.*/


package  unidad2;

import java.util.Scanner;

public class Ejercicio09Financiero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner memory = new Scanner (System.in);
	
	double vI, iA, iM, vI1, vI2, vI3, vI4, vI5, vI6;
	
	System.out.println("Cual es el valor inicial: ");
	vI = memory.nextDouble();
	System.out.println("Cual es el interes anual: ejemplo 3.75");
	iA = memory.nextDouble();
	
	iM = (iA / 100)/12;
	
	vI1 = vI + (iM * vI);
	vI2 = (vI1 + vI) * (iM +1);
	vI3 = (vI2 + vI) * (iM +1);
	vI4 = (vI3 + vI) * (iM +1);
	vI5 = (vI4 + vI) * (iM +1);
	vI6 = (vI5 + vI) * (iM +1);
	
	System.out.printf("Los beneficios totales semestralmente son: %f" , vI6);
	
		
	}

}
