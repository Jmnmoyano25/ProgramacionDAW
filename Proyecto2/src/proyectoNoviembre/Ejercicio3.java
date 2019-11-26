package proyectoNoviembre;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner memory = new Scanner(System.in);
		
		double l1,l2,l3, area, sp;
		
		System.out.println("dime lado 1: ");
		l1 = memory.nextDouble();
		System.out.println("dime lado 2: ");
		l2 = memory.nextDouble();
		System.out.println("dime lado 3: ");
		l3 = memory.nextDouble();
		
		sp = ((l1 + l2 + l3)/2);
		
		area = Math.sqrt((sp*((sp-l1)*(sp-l2)*(sp-l3))));
		System.out.println("el area es: "+area);
	}

}
