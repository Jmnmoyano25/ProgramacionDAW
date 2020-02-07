package unidad_6_arrays_ejercicios_propuestos;
import java.util.*;

public class PruebaConteoAbecedarioConMetodos {


			//ATRIBUTOS
		private int[] contador = new int[32];
		//array con todas las letas más las vocales acentuadas
		private char[] abc = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z','á','é','í','ó','ú'};
		private String frase;



			//CONSTRUCTOR
		public PruebaConteoAbecedarioConMetodos() {}


			//METODOS

			//metodo que genera un contador de letras a la par que abc
		public int[] cuentaVocales() {
	
			for(int i = 0; i < frase.length(); i++) {
				for(int j = 0; j < abc.length; j++) {
					if(frase.charAt(i) == abc[j]) {
						this.contador[j]++;
					}
				}
			}
			return contador;
		}


			//método que imprime cualquier array
		public void imprimeArray(int[] arrayCualquiera ) {
		
			for(int i = 0; i < arrayCualquiera.length; i++) {
				System.out.println("La letra "+this.abc[i]+" se repite "+arrayCualquiera[i]+" veces.");
			}
		}

			//metodo que pasa abc a minusculas
		public void pasarMinusculas(String frase) {
			this.frase = frase.toLowerCase();
		}


			//METODOS GETTER Y SETTER SOLO DE FRASE

		public String getFrase() {
			return frase;
		}

		public void setFrase(String frase) {
			this.frase = frase;
		}
	
	
	
public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		Scanner sc = new Scanner(System.in);
		ConteoAbecedario abc = new ConteoAbecedario();
		
		String fra;

		System.out.println("Escribe una frase: ");
		fra = sc.nextLine();
		
			//damos formato al atributo frase
		abc.setFrase(fra);
		
			//pasamos frase a minusculas
		abc.pasarMinusculas(fra);
		
			//imprimimos abc y contador			
		abc.imprimeArray(abc.cuentaVocales());
		

		
	}
}
	
