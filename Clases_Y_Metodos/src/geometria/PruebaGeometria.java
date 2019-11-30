package geometria;
import java.util.Scanner;
public class PruebaGeometria {

	public static void main(String[] args) {

		Scanner memory = new Scanner(System.in);
		
		System.out.println("valor de r: ");
		double rad = memory.nextDouble();
		
		System.out.println("valor de h: ");
		double alt = memory.nextDouble();
		
		
		System.out.println(Geometria.longitudCircunferencia(9,7));
		System.out.printf("%.2f\n",Geometria.volumenCilindro(rad, alt));//%.2f me da dos decimales
		System.out.printf("%.2f",Geometria.volumenCilindro2());//sin valores en el metodo, coge los valores iniciales de los atributos
		
	}

}
