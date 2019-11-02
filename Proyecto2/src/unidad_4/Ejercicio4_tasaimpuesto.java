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
			if (bruto <= 8350) {
				soloIVA = bruto*0.1;
				brutomasIVA = bruto+soloIVA;
				System.out.printf("El impuesto añadido sera de %f%nEl total del salario sera %f%n",soloIVA, brutomasIVA);
			}
				else if (bruto >= 8350 || bruto <=33950) {
					soloIVA = bruto*0.15;
					brutomasIVA = bruto+soloIVA;
					System.out.printf("El impuesto añadido sera de %f%nEl total del salario sera %f%n",soloIVA, brutomasIVA);
				}
					else if (bruto >= 33951 || bruto <=82250) {
						soloIVA = bruto*0.25;
						brutomasIVA = bruto+soloIVA;
						System.out.printf("El impuesto añadido sera de %f%nEl total del salario sera %f%n",soloIVA, brutomasIVA);
					}
						else if (bruto >= 82251 || bruto <=171550) {
							soloIVA = bruto*0.28;
							brutomasIVA = bruto+soloIVA;
							System.out.printf("El impuesto añadido sera de %f%nEl total del salario sera %f%n",soloIVA, brutomasIVA);
						}
							else if (bruto >= 171551 || bruto <=372950) {
								soloIVA = bruto*0.33;
								brutomasIVA = bruto+soloIVA;
								System.out.printf("El impuesto añadido sera de %f%nEl total del salario sera %f%n",soloIVA, brutomasIVA);
							}
								else if (bruto >= 372951) {
									soloIVA = bruto*0.35;
									brutomasIVA = bruto+soloIVA;
									System.out.printf("El impuesto añadido sera de %f%nEl total del salario sera %f%n",soloIVA, brutomasIVA);
								}
			break;
			}/*cierre case 0*/
		case 1: {
			if (bruto <= 16700) {
				soloIVA = bruto*0.1;
				brutomasIVA = bruto+soloIVA;
				System.out.printf("El impuesto añadido sera de %f%nEl total del salario sera %f%n",soloIVA, brutomasIVA);
			}
				else if (bruto >= 16701 || bruto <=67900) {
					soloIVA = bruto*0.15;
					brutomasIVA = bruto+soloIVA;
					System.out.printf("El impuesto añadido sera de %f%nEl total del salario sera %f%n",soloIVA, brutomasIVA);
				}
					else if (bruto >= 67901 || bruto <=137050) {
						soloIVA = bruto*0.25;
						brutomasIVA = bruto+soloIVA;
						System.out.printf("El impuesto añadido sera de %f%nEl total del salario sera %f%n",soloIVA, brutomasIVA);
					}
						else if (bruto >= 137051 || bruto <=208850) {
							soloIVA = bruto*0.28;
							brutomasIVA = bruto+soloIVA;
							System.out.printf("El impuesto añadido sera de %f%nEl total del salario sera %f%n",soloIVA, brutomasIVA);
						}
							else if (bruto >= 208851 || bruto <=372950) {
								soloIVA = bruto*0.33;
								brutomasIVA = bruto+soloIVA;
								System.out.printf("El impuesto añadido sera de %f%nEl total del salario sera %f%n",soloIVA, brutomasIVA);
							}
								else if (bruto >= 372951) {
									soloIVA = bruto*0.35;
									brutomasIVA = bruto+soloIVA;
									System.out.printf("El impuesto añadido sera de %f%nEl total del salario sera %f%n",soloIVA, brutomasIVA);
								}
			break;
			}/*cierre del caso 1*/
		case 2: {
			if (bruto <= 8350) {
				soloIVA = bruto*0.1;
				brutomasIVA = bruto+soloIVA;
				System.out.printf("El impuesto añadido sera de %f%nEl total del salario sera %f%n",soloIVA, brutomasIVA);
			}
				else if (bruto >= 8350 || bruto <=33950) {
					soloIVA = bruto*0.15;
					brutomasIVA = bruto+soloIVA;
					System.out.printf("El impuesto añadido sera de %f%nEl total del salario sera %f%n",soloIVA, brutomasIVA);
				}
					else if (bruto >= 33951 || bruto <=68525) {
						soloIVA = bruto*0.25;
						brutomasIVA = bruto+soloIVA;
						System.out.printf("El impuesto añadido sera de %f%nEl total del salario sera %f%n",soloIVA, brutomasIVA);
					}
						else if (bruto > 68526 || bruto <=104425) {
							soloIVA = bruto*0.28;
							brutomasIVA = bruto+soloIVA;
							System.out.printf("El impuesto añadido sera de %f%nEl total del salario sera %f%n",soloIVA, brutomasIVA);
						}
							else if (bruto > 104426 || bruto <=186475) {
								soloIVA = bruto*0.33;
								brutomasIVA = bruto+soloIVA;
								System.out.printf("El impuesto añadido sera de %f%nEl total del salario sera %f%n",soloIVA, brutomasIVA);
							}
								else if (bruto >= 186476) {
									soloIVA = bruto*0.35;
									brutomasIVA = bruto+soloIVA;
									System.out.printf("El impuesto añadido sera de %f%nEl total del salario sera %f%n",soloIVA, brutomasIVA);
								}
			break;
			}/*cierre case 2*/
		case 3: {
			if (bruto <= 11950) {
				soloIVA = bruto*0.1;
				brutomasIVA = bruto+soloIVA;
				System.out.printf("El impuesto añadido sera de %f%nEl total del salario sera %f%n",soloIVA, brutomasIVA);
			}
				else if (bruto >= 11951 || bruto <=45500) {
					soloIVA = bruto*0.15;
					brutomasIVA = bruto+soloIVA;
					System.out.printf("El impuesto añadido sera de %f%nEl total del salario sera %f%n",soloIVA, brutomasIVA);
				}
					else if (bruto >= 45501 || bruto <=117450) {
						soloIVA = bruto*0.25;
						brutomasIVA = bruto+soloIVA;
						System.out.printf("El impuesto añadido sera de %f%nEl total del salario sera %f%n",soloIVA, brutomasIVA);
					}
						else if (bruto > 117451 || bruto <=190200) {
							soloIVA = bruto*0.28;
							brutomasIVA = bruto+soloIVA;
							System.out.printf("El impuesto añadido sera de %f%nEl total del salario sera %f%n",soloIVA, brutomasIVA);
						}
							else if (bruto > 190201 || bruto <=372950) {
								soloIVA = bruto*0.33;
								brutomasIVA = bruto+soloIVA;
								System.out.printf("El impuesto añadido sera de %f%nEl total del salario sera %f%n",soloIVA, brutomasIVA);
							}
								else if (bruto >= 372951) {
									soloIVA = bruto*0.35;
									brutomasIVA = bruto+soloIVA;
									System.out.printf("El impuesto añadido sera de %f%nEl total del salario sera %f%n",soloIVA, brutomasIVA);
								}
			break;
			}/*cierre case 3*/
		  }/*cierre switch*/
			
	}/*cierre metodo main*/
}/*cierre public class*/

