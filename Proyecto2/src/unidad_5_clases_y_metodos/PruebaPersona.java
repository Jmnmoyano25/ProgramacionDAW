package unidad_5_clases_y_metodos;
import java.util.Scanner;
public class PruebaPersona {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner sc = new Scanner(System.in);
		/*
		String nom, sex;
		int ed, DNI;
		double peso, altura;
		System.out.println("Cual es tu nombre: ");
		nom = sc.toString();
		System.out.println("Cual es tu edad: ");
		ed = sc.nextInt();
		System.out.println("Escribe tu DNI sin letra: ");
		DNI = sc.nextInt();
		System.out.println("Cual es tu sexo: ");
		sex = sc.toString();
		System.out.println("Cuanto pesas en Kg: ");
		peso = sc.nextDouble();
		System.out.println("Cuanto mides: ");
		altura = sc.nextDouble();
		
		Persona p1 = new Persona(nom, ed, DNI, sex, peso, altura);
		Persona p2 = new Persona(nom, ed, DNI, sex);
		Persona p3 = new Persona();
		*/
		/* NO SE COMO HACER ESTO
		public static String adulto(Persona.comprobarSexo()) {
			
			return "adulto";
		}
		*/
		Persona p9 = new Persona("juanma",57896,45,"h", 85, 1.75);
		
		p9.IMC();
		p9.valoracionIMC();
		//p9.toString();
		System.out.println(p9.toString());
		
		Persona p8 = new Persona("Anita",57896,45,"h", 57, 1.72);
		
		p8.IMC();
		p8.valoracionIMC();
		//p9.toString();
		System.out.println(p8.toString());
		
		
	}

}
