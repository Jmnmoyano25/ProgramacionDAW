package unidad_6_arrays_ejercicios;
import java.util.Scanner;
public class Arrays_1_dimension_01_02 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner memory = new Scanner (System.in);
			//EJERCICIO 1
		
		int[] num = new int[12];
		
		num[0]= 39;
		num[1]= -2;
		num[4]= 0;
		num[6]= 14;
		num[8]= 5;
		num[9]= 120;
		
		for(int i=0; i<num.length;i++) {
			System.out.print(num[i]);
		}
		//Los valores sin inicializar se consideran 0.
		System.out.println("\n\tFin del ejercicio 1\n");
		
		
			//EJERCICIO 2
		
		char[] simbolo = new char[10];
		
		simbolo[0] = 'a';
		simbolo[1] = 'x';
		simbolo[4] = '@';
		simbolo[6] = ' ';
		simbolo[7] = '+';
		simbolo[8] = 'Q';
		
		for(int i=0; i<simbolo.length;i++) {
			System.out.print(simbolo[i]);
		}
		//los valores sin asignar so aparecen
		System.out.println("\n\tFin del ejercicio 2\n");
		
		
	} 

}
