import java.util.Scanner;
//import java.util.Locale;

public class AreaDiametroCircunferencia{
	public static void main(String[] args){
		//Locale.setDefault(Locale.Category.FORMAT, Locale.US);
		System.out.println("Para el diametro, circunferencia y area de un circulo");
	
		Scanner entrada = new Scanner(System.in);
		
		int radio;
		double diametro, area, circunferencia, pi;
		
		System.out.print("Ingresa el radio:  ");
		radio = entrada.nextInt();
		
		diametro = 2 * radio;
		
		area = Math.PI * radio *  radio;
		
		circunferencia = 2 * radio * Math.PI;
		
		System.out.printf("El perimetro es:%f%n", diametro);
		
		System.out.printf("El perimetro es:%f%n", area);
		
		System.out.printf("El perimetro es:%f%n", circunferencia);
	}
}
		
		
