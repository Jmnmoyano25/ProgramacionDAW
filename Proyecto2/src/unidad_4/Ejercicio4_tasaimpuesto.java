/*4. Escribe un programa que procese la tasa de impuesto de los salarios atendiendo a la
filiación o estado civil. El programa debe preguntar para que el usuario introduzca estado
civil (0 para solteros, 1 para recién casados o viudos, 2 para casados y separados y 3 para
cabeza de familia ) y salario y se procese la tasa total del salario que es el porcentaje del
salario.

10% $0–$8,350 			 $0–$16,700 		  $0–$8,350 			 $0–$11,950
15% $8,351–$33,950  	 $16,701–$67,900 	  $8,351–$33,950  		 $11,951–$45,500
25% $33,951–$82,250  	 $67,901–$137,050 	  $33,951–$68,525 		 $45,501–$117,450
28% $82,251–$171,550  	 $137,051–$208,850 	  $68,526–$104,425   	 $117,451–$190,200
33% $171,551–$372,950  	 $208,851–$372,950    $104,426–$186,475      $190,201–$372,950
35% $372,951+  			 $372,951+ 			  $186,476+  			 $372,951+
*/

package unidad_4;
import java.util.Scanner;
public class Ejercicio4_tasaimpuesto {
	public static void main(String[] args) {
		
	Scanner memory = new Scanner (System.in);
	
	int estadoCivil;
	double bruto, brutomasIVA, soloIVA;
	 
	System.out.println("Cual es tu estado civil:\n\n\t0-Solteros\n\t1-Recien casados o viudos\n\t2-Casados y separados\n\t3-Cabeza de familia");
	estadoCivil = memory.nextInt();
	System.out.println("Cuanto ganas: ");
	bruto = memory.nextDouble();
	
		switch (estadoCivil){
		case 0: {
			if (bruto <= 8.350) {
				soloIVA = bruto*0.1;
				brutomasIVA = bruto+soloIVA;
				System.out.printf("El impuesto añadido sera de %f%nEl total del salario sera %f%n",soloIVA, brutomasIVA);
			}
		}
			
		}
	}
}
