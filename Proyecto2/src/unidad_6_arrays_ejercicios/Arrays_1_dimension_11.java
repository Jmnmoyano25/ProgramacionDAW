package unidad_6_arrays_ejercicios;
import java.util.Scanner;
public class Arrays_1_dimension_11 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner memory = new Scanner (System.in);
		
			//EJERCICIO 11
		
		int[] arrayInicial = new int[10];
		int[] arrayIndice = new int[10];
		int i = 0;
		int j = 0;
		int[] primos = new int [10];
		int[] noPrimos = new int [10];
		int primo = 0;
		int noPrimo = 0;
		int[] arrayFinal = new int[10];
		
		boolean esPrimo = false;
		
		

		//Solicitamos 10 números enteros
		
        for (i = 0; i < 10; i++) {
        	//System.out.println("Escribe un número entero y después pulsa intro: ");
        	//los meto con un ramdom por no ser pesado
        	arrayInicial[i] = (int) (Math.random()*100);
            //arrayInicial[i] = memory.nextInt(); 
        }
        
        //creamos el arrayIndice
        
        for (i = 0; i < 10; i++) {
            arrayIndice[i] = i; 
        }
        
        //mostramos la tabla con la arrayIncial
        System.out.print("Índice\t");
        for(i = 0; i < 10; i++) {
        	System.out.print("[" + arrayIndice[i] + "]" + "  ");
        }
        System.out.println("\n");
        System.out.print("Valor\t");
        for(i = 0; i < arrayInicial.length; i++) {
        	if(arrayInicial[i] < 10) {
				System.out.print(" "+arrayInicial[i]+" "+"  ");
			}else {
				System.out.print(" "+arrayInicial[i]+"  ");
			}
        	
        }
        
        
        //ahora pasamos los primos al principio del array 
        
        for(i = 0; i < arrayInicial.length; i++) { 
        	
        	//comprovamos que el numero i del arrayInicial se primo
        			esPrimo = true;
        
        	for (j = 2; j < arrayInicial[i] -1; j++) {
        		if (arrayInicial[i] % j == 0) {
        	  
        			esPrimo = false;
        		}
        	}
        	
        	//si el numero i del arrayInicial es primo lo metemos el el array primos 
        	//además sumamos mas 1 al contador de primo.
        	if(esPrimo) {
        		primos[primo++] = arrayInicial[i];
        	}
        	else {
        		noPrimos[noPrimo++] = arrayInicial[i];
        	}
        }
        
       
        
        // Los números primos se menten en las primeras posiciones del arrayFinal.
        for (i = 0; i < primo; i++) {
          arrayFinal[i] = primos[i];
        }
        
        // Los números que no son primos se colocan al final del arrayFinal
        for (i = primo; i < primo + noPrimo; i++) {
          arrayFinal[i] = noPrimos[i - primo];
        }
		
          
       
        //este fue mi primer intento pero no funcionaba
        
        /*
        for(j = 0; j < arrayInicial.length; j++) {
            
        	for(x = 1; x <= arrayInicial[j]; x++) {
        		if(arrayInicial[j] % x == 0) {
        			contador++;
        		}
        	}
        	if(contador <= 2) {
        		arrayFinal[cuentaArray] = arrayFinal[i];
        		cuentaArray++;
        	}
        	contador = 0;
        }
        
        //ahora pasamos el resto de numeros (solo quedan los que no son primos) al resto del arrayFinal
        
        for(j = 0; j < arrayInicial.length; j++) {
            
        	for(x = 1; x <= arrayInicial[j]; x++) {
        		if(arrayInicial[j] % x == 0) {
        			contador++;
        		}
        	}
        	if(contador > 2) {
        		arrayFinal[cuentaArray] = arrayFinal[i];
        		cuentaArray++;
        	}
        	contador = 0;
        }*/
        
        
        //por último mostramos la tabla con la arrayFinal
        
        System.out.println("\n");
        System.out.print("Índice\t");
        for(i = 0; i < arrayIndice.length; i++) {
        	System.out.print("[" + arrayIndice[i] + "]" + "  ");
        }
        System.out.println("\n");
        System.out.print("Valor\t");
        for(i = 0; i < arrayFinal.length; i++) {
        	if (arrayFinal[i] < 10) {
        	System.out.print(" " + arrayFinal[i] + " " + "  ");
        	}else {
			System.out.print(" "+arrayFinal[i]+"  ");
        	}
        }
        
        
	}

}
