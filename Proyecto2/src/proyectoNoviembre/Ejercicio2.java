package proyectoNoviembre;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente

		Scanner memory = new Scanner (System.in);
		
		int num, I= 1, n;
		
		System.out.println("Introduce un entero positivo: ");
		num = memory.nextInt();
		
		System.out.println("El n�mero " +num+ " tiene " + Integer.toString(num).length() + " d�gitos");
		
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
