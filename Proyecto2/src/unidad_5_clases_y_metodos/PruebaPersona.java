package unidad_5_clases_y_metodos;
import java.util.*;
import unidad_5_clases_y_metodos.Persona;
public class PruebaPersona {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner sc = new Scanner(System.in);
		
		//valores para los atributos de persona
		System.out.println("Cual es tu nombre: ");
		String nom = sc.next();
		
		System.out.println("Cual es tu edad: ");
		int ed = sc.nextInt();
		
		System.out.println("Escribe tu DNI sin letra: ");
		int DNI = sc.nextInt();
		
		System.out.println("Cual es tu sexo: ");
		String sex = sc.next();
		
		System.out.println("Cuanto pesas en Kg: ");
		double peso = sc.nextDouble();
		
		System.out.println("Cuanto mides: ");
		double altura = sc.nextDouble();
		
		//personas instanciadas de la clase Persona
		Persona p1 = new Persona(nom, ed, DNI, sex, peso, altura);
		Persona p2 = new Persona(nom, ed, DNI, sex);
		Persona p3 = new Persona();
		
		//Setters para p2 y p3
		
		p2.setPeso(75);
		p2.setAltura(1.45);
		
		p3.setNombre("paquito el chocolatero");
		p3.setEdad(96);
		p3.setDNI(57896854);
		p3.setSexo("h");
		p3.setPeso(45);
		p3.setAltura(1.89);
		
		//falta mostrar si son mayaros de edad o no con un metodo estatico
				
		/*NO SE COMO HACER ESTO
		public static String adulto (p1.comprobarSexo()); {
			

		}
		*/
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
	}

}
