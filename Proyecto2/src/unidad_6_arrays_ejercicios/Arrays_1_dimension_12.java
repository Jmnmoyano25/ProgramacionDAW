package unidad_6_arrays_ejercicios;
import java.util.Scanner;
public class Arrays_1_dimension_12 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner sc = new Scanner(System.in);
		//EJERCICIO 12
		
		int[] arrayInicial = new int[10];
		int[] arrayFinal = new int[10];
		int[] Indice = new int[10];
		int arrayOrdenada = 0;
		int i = 0;
		int inicial, ultimo, x, y;
		
		
		
			//llenamos el array inicial
		
		for(i = 0; i < arrayInicial.length; i++) {
			arrayInicial[i] =  i + 1;//(int) (Math.random()*100);
		}
			//llenamos el array del indice
		for(i = 0; i < Indice.length; i++) {
			Indice[i] = i;
		}
		
			//imprimimos indice y valor
		System.out.print("Índice\t");
		for(i = 0; i < Indice.length; i++) {
			System.out.print("["+Indice[i]+"]"+"  ");
		}
		System.out.println("\n");
		System.out.print("Valor\t");
			//le pongo un if para que cuadren los valores del indice [i] con los valores de valor
		for(i = 0; i < arrayInicial.length; i++) {
			if(arrayInicial[i] < 10) {
				System.out.print(" "+arrayInicial[i]+" "+"  ");
			}else {
				System.out.print(" "+arrayInicial[i]+"  ");
			}
			
		}
		
			//ahora pedimos dos numeros enteros del 0 al 9
		System.out.println("\n\nEscribe un primer número entero entre el 0 y el 9");
		x = sc.nextInt();
		
		System.out.println("Escribe un segundo número entero entre el 0 y el 9");
		y = sc.nextInt();
		
		ultimo = Math.max(x, y);
		inicial = Math.min(x, y);
		
		
	    // Copia el array arrayInicial en arrayFinal.
	    for (i = 0; i < 10; i++) {
	    	arrayFinal[i] = arrayInicial[i];
	    }
	    
	    arrayFinal[ultimo] = arrayInicial[inicial];
	    
	    for (i = ultimo + 1; i < 10; i++)
	      arrayFinal[i] = arrayInicial[i - 1];
	    
	    arrayFinal[0] = arrayInicial[9];
	    
	    for (i = 0; i < inicial; i++)
	      arrayFinal[i + 1] = arrayInicial[i];
		
		/*//esto no me funciona
		for(i = 0; i < arrayFinal.length; i++) {
			if(i == inicial) {
				arrayOrdenada = ultimo;
				arrayFinal[arrayOrdenada] = arrayInicial[i];
			}else if(arrayOrdenada == ultimo){
				arrayOrdenada++;
			}
			else {
			arrayFinal[arrayOrdenada] = arrayInicial[i];
			arrayOrdenada++;
			}
		}*/
		/*
		for(i = 0; i < arrayFinal.length; i++) {
			if(i == ultimo) {
				arrayOrdenada++;
			}else {
			arrayFinal[arrayOrdenada] = arrayInicial[i];
			arrayOrdenada++;
			}
		}*/
		/*
		arrayOrdenada = 0;
		for(i = 0; i < arrayFinal.length; i++) {
			if(arrayOrdenada == inicial) {
				arrayFinal[ultimo] = arrayInicial[inicial];
			}
			if(arrayOrdenada == ultimo +1) {
				arrayFinal[ultimo] = arrayInicial[inicial];
			}else {
				System.out.print(arrayOrdenada + " arrayOrdenada ");
				System.out.println(" ");
				
			arrayFinal[arrayOrdenada] = arrayInicial[i];
			
			System.out.print(arrayFinal[arrayOrdenada] + " arrayFinal ");
			System.out.print(arrayOrdenada + " arrayOrdenada ");
			System.out.print(arrayInicial[i] + " arrayInicial ");
			arrayOrdenada++;
			}
		}*/
		
		System.out.println(" ");
		System.out.print("Valor\t");
			//le pongo un if para que cuadren los valores del indice [i] con los valores de valor
		for(i = 0; i < arrayFinal.length; i++) {
			if(arrayFinal[i] < 10) {
				System.out.print(" "+arrayFinal[i]+" "+"  ");
			}else {
				System.out.print(" "+arrayFinal[i]+"  ");
			}
			
		}
		
		
		
		
		
		
	}

}
