package proyectoNoviembre;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		Scanner memory = new Scanner (System.in);
		
		int num, I= 1, n;
		
		System.out.println("Introduce un entero positivo: ");
		num = memory.nextInt();
		
		System.out.println("El número " +num+ " tiene " + Integer.toString(num).length() + " dígitos");
		
		while(I < num) {
			n=num%10;
			System.out.println();
			if(n % 2 == 0) {
				System.out.println("par"+n);
			}else{
				System.out.println("impar"+n);
			};
			
			I = I*10;
		}
		System.out.println();
		
		if(num%10==0)
			System.out.println();
		

		
		

	}

}
