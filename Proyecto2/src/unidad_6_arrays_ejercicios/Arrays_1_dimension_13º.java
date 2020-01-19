package unidad_6_arrays_ejercicios;
import java.util.Scanner;
public class Arrays_1_dimension_13º {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner sc = new Scanner(System.in);
			
			//EJERCICIO 13
		int [] arrayInicial = new int[100];
		int [] arrayFinal = new int[100];
		int i = 0;
		int j = 0;
		int opcion;
		int minimo = 500;
		int maximo = 0;
		
		for(i = 0; i < arrayInicial.length; i++) {
			//arrayInicial[i] = i;
			arrayInicial[i] = (int) (Math.random()*501);
			
			//sacamos el minimo y el máximo del array arrayInicial
			if(arrayInicial[i] < minimo) {
				minimo = arrayInicial[i];
			}
			if(arrayInicial[i] > maximo) {
				maximo = arrayInicial[i];
			}
			
		}
		
		/*for(i = 0; i < arrayInicial.length; i++) {
		System.out.println(arrayInicial[i]);
		}*/
		
		//imprimimos 4 lineas con los 100 numeros, 25 numeros por linea
		for(i = 0; i < arrayInicial.length; i++) {
			if(i == 25 || i == 50 || i == 75) {
				System.out.println(" ");
			}
			if(i < 25) {
							
				if(arrayInicial[i] < 10) {
					System.out.print("  "+arrayInicial[i]+"   ");
				}else if(arrayInicial[i] > 9 && arrayInicial[i] < 100) {
					System.out.print(" "+arrayInicial[i]+"   ");
				}
				else if (arrayInicial[i] > 99) {
					System.out.print(" "+arrayInicial[i]+"  ");
				}
			}else if(i > 24 && i < 50) {
				if(arrayInicial[i] < 10) {
					System.out.print("  "+arrayInicial[i]+"   ");
				}else if(arrayInicial[i] > 9 && arrayInicial[i] < 100) {
					System.out.print(" "+arrayInicial[i]+"   ");
				}
				else if (arrayInicial[i] > 99) {
					System.out.print(" "+arrayInicial[i]+"  ");
				}
			}else if(i > 49 && i < 75) {
				
				if(arrayInicial[i] < 10) {
					System.out.print("  "+arrayInicial[i]+"   ");
				}else if(arrayInicial[i] > 9 && arrayInicial[i] < 100) {
					System.out.print(" "+arrayInicial[i]+"   ");
				}
				else if (arrayInicial[i] > 99) {
					System.out.print(" "+arrayInicial[i]+"  ");
				}
			}else if(i > 74) {
				
				if(arrayInicial[i] < 10) {
					System.out.print("  "+arrayInicial[i]+"   ");
				}else if(arrayInicial[i] > 9 && arrayInicial[i] < 100) {
					System.out.print(" "+arrayInicial[i]+"   ");
				}
				else if (arrayInicial[i] > 99) {
					System.out.print(" "+arrayInicial[i]+"  ");
				}
			}
		}
		
		
		/*
		for(i = 0; i < arrayInicial.length - 75; i++) {
			
			//System.out.print(arrayInicial[i]);
			

		}

		
		System.out.println(" ");


		for(i = 25; i < arrayInicial.length - 50; i++) {
			if(arrayInicial[i] < 10) {
				System.out.print(arrayInicial[i]+"    ");
			}else if(arrayInicial[i] > 9 && arrayInicial[i] < 100) {
				System.out.print(arrayInicial[i]+"   ");
			}
			else if (arrayInicial[i] > 99) {
				System.out.print(arrayInicial[i]+"  ");
			}
		}
		System.out.println(" ");
		for(i = 50; i <= 74; i++) {
			if(arrayInicial[i] < 10) {
				System.out.print(arrayInicial[i]+"    ");
			}else if(arrayInicial[i] > 9 && arrayInicial[i] < 100) {
				System.out.print(arrayInicial[i]+"   ");
			}
			else if (arrayInicial[i] > 99) {
				System.out.print(arrayInicial[i]+"  ");
			}
		}
		System.out.println(" ");
		for(i = 75; i <= 99; i++) {
			if(arrayInicial[i] < 10) {
				System.out.print(arrayInicial[i]+"    ");
			}else if(arrayInicial[i] > 9 && arrayInicial[i] < 100) {
				System.out.print(arrayInicial[i]+"   ");
			}
			else if (arrayInicial[i] > 99) {
				System.out.print(arrayInicial[i]+"  ");
			}
		}*/
		
		do {
		System.out.println("\nQue quieres destacar, máximo o mínimo:\n1 Máximo\n2 Mínimo\n3 para salir");
		opcion = sc.nextInt();
			switch (opcion){
			
			case 1:
				for(i = 0; i < arrayInicial.length; i++) {
					if (arrayInicial[i] == maximo) {
					if(i == 25 || i == 50 || i == 75) {
						System.out.println(" ");
					}
					if(i < 25) {
									
						if(arrayInicial[i] < 10) {
							System.out.print(" *"+arrayInicial[i]+"*  ");
						}else if(arrayInicial[i] > 9 && arrayInicial[i] < 100) {
							System.out.print("*"+arrayInicial[i]+"*  ");
						}
						else if (arrayInicial[i] > 99) {
							System.out.print("*"+arrayInicial[i]+"* ");
						}
					}else if(i > 24 && i < 50) {
						if(arrayInicial[i] < 10) {
							System.out.print(" *"+arrayInicial[i]+"*  ");
						}else if(arrayInicial[i] > 9 && arrayInicial[i] < 100) {
							System.out.print("*"+arrayInicial[i]+"*  ");
						}
						else if (arrayInicial[i] > 99) {
							System.out.print("*"+arrayInicial[i]+"* ");
						}
					}else if(i > 49 && i < 75) {
						
						if(arrayInicial[i] < 10) {
							System.out.print(" *"+arrayInicial[i]+"*  ");
						}else if(arrayInicial[i] > 9 && arrayInicial[i] < 100) {
							System.out.print("*"+arrayInicial[i]+"*  ");
						}
						else if (arrayInicial[i] > 99) {
							System.out.print("*"+arrayInicial[i]+"* ");
						}
					}else if(i > 74) {
						
						if(arrayInicial[i] < 10) {
							System.out.print(" *"+arrayInicial[i]+"*  ");
						}else if(arrayInicial[i] > 9 && arrayInicial[i] < 100) {
							System.out.print("*"+arrayInicial[i]+"*  ");
						}
						else if (arrayInicial[i] > 99) {
							System.out.print("*"+arrayInicial[i]+"* ");
						}
					}
				}
				else {
					if(i == 25 || i == 50 || i == 75) {
						System.out.println(" ");
					}
					if(i < 25) {
									
						if(arrayInicial[i] < 10) {
							System.out.print("  "+arrayInicial[i]+"   ");
						}else if(arrayInicial[i] > 9 && arrayInicial[i] < 100) {
							System.out.print(" "+arrayInicial[i]+"   ");
						}
						else if (arrayInicial[i] > 99) {
							System.out.print(" "+arrayInicial[i]+"  ");
						}
					}else if(i > 24 && i < 50) {
						if(arrayInicial[i] < 10) {
							System.out.print("  "+arrayInicial[i]+"   ");
						}else if(arrayInicial[i] > 9 && arrayInicial[i] < 100) {
							System.out.print(" "+arrayInicial[i]+"   ");
						}
						else if (arrayInicial[i] > 99) {
							System.out.print(" "+arrayInicial[i]+"  ");
						}
					}else if(i > 49 && i < 75) {
						
						if(arrayInicial[i] < 10) {
							System.out.print("  "+arrayInicial[i]+"   ");
						}else if(arrayInicial[i] > 9 && arrayInicial[i] < 100) {
							System.out.print(" "+arrayInicial[i]+"   ");
						}
						else if (arrayInicial[i] > 99) {
							System.out.print(" "+arrayInicial[i]+"  ");
						}
					}else if(i > 74) {
						
						if(arrayInicial[i] < 10) {
							System.out.print("  "+arrayInicial[i]+"   ");
						}else if(arrayInicial[i] > 9 && arrayInicial[i] < 100) {
							System.out.print(" "+arrayInicial[i]+"   ");
						}
						else if (arrayInicial[i] > 99) {
							System.out.print(" "+arrayInicial[i]+"  ");
						}
					}
				}
				}
				break;
			
			case 2:
				
				for(i = 0; i < arrayInicial.length; i++) {
					if (arrayInicial[i] == minimo) {
					if(i == 25 || i == 50 || i == 75) {
						System.out.println(" ");
					}
					if(i < 25) {
									
						if(arrayInicial[i] < 10) {
							System.out.print(" *"+arrayInicial[i]+"*  ");
						}else if(arrayInicial[i] > 9 && arrayInicial[i] < 100) {
							System.out.print("*"+arrayInicial[i]+"*  ");
						}
						else if (arrayInicial[i] > 99) {
							System.out.print("*"+arrayInicial[i]+"* ");
						}
					}else if(i > 24 && i < 50) {
						if(arrayInicial[i] < 10) {
							System.out.print(" *"+arrayInicial[i]+"*  ");
						}else if(arrayInicial[i] > 9 && arrayInicial[i] < 100) {
							System.out.print("*"+arrayInicial[i]+"*  ");
						}
						else if (arrayInicial[i] > 99) {
							System.out.print("*"+arrayInicial[i]+"* ");
						}
					}else if(i > 49 && i < 75) {
						
						if(arrayInicial[i] < 10) {
							System.out.print(" *"+arrayInicial[i]+"*  ");
						}else if(arrayInicial[i] > 9 && arrayInicial[i] < 100) {
							System.out.print("*"+arrayInicial[i]+"*  ");
						}
						else if (arrayInicial[i] > 99) {
							System.out.print("*"+arrayInicial[i]+"* ");
						}
					}else if(i > 74) {
						
						if(arrayInicial[i] < 10) {
							System.out.print(" *"+arrayInicial[i]+"*  ");
						}else if(arrayInicial[i] > 9 && arrayInicial[i] < 100) {
							System.out.print("*"+arrayInicial[i]+"*  ");
						}
						else if (arrayInicial[i] > 99) {
							System.out.print("*"+arrayInicial[i]+"* ");
						}
					}
				}
				else {
					if(i == 25 || i == 50 || i == 75) {
						System.out.println(" ");
					}
					if(i < 25) {
									
						if(arrayInicial[i] < 10) {
							System.out.print("  "+arrayInicial[i]+"   ");
						}else if(arrayInicial[i] > 9 && arrayInicial[i] < 100) {
							System.out.print(" "+arrayInicial[i]+"   ");
						}
						else if (arrayInicial[i] > 99) {
							System.out.print(" "+arrayInicial[i]+"  ");
						}
					}else if(i > 24 && i < 50) {
						if(arrayInicial[i] < 10) {
							System.out.print("  "+arrayInicial[i]+"   ");
						}else if(arrayInicial[i] > 9 && arrayInicial[i] < 100) {
							System.out.print(" "+arrayInicial[i]+"   ");
						}
						else if (arrayInicial[i] > 99) {
							System.out.print(" "+arrayInicial[i]+"  ");
						}
					}else if(i > 49 && i < 75) {
						
						if(arrayInicial[i] < 10) {
							System.out.print("  "+arrayInicial[i]+"   ");
						}else if(arrayInicial[i] > 9 && arrayInicial[i] < 100) {
							System.out.print(" "+arrayInicial[i]+"   ");
						}
						else if (arrayInicial[i] > 99) {
							System.out.print(" "+arrayInicial[i]+"  ");
						}
					}else if(i > 74) {
						
						if(arrayInicial[i] < 10) {
							System.out.print("  "+arrayInicial[i]+"   ");
						}else if(arrayInicial[i] > 9 && arrayInicial[i] < 100) {
							System.out.print(" "+arrayInicial[i]+"   ");
						}
						else if (arrayInicial[i] > 99) {
							System.out.print(" "+arrayInicial[i]+"  ");
						}
					}
				}
				}
				break;
			
			default:
				if(opcion != 1 || opcion != 2)
				System.out.println("Escribe 1 para Máximo o 2 para Minimo");
				
			
			}
		}while(opcion != 3);
		System.out.println("Programa terminado");

			
		
		
	}

}
