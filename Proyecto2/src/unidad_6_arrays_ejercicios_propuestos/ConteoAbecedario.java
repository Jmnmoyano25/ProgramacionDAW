package unidad_6_arrays_ejercicios_propuestos;

public class ConteoAbecedario {
 
		//ATRIBUTOS
	private int[] contador = new int[32];
	//private char[] abc = new char[3];
	private char[] abc = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z','á','é','í','ó','ú'};
	private String frase;
	

	
		//CONSTRUCTOR
	public ConteoAbecedario() {}
	
	
		//METODOS
	
	//private void rellenaArray(int[])
	
	/*private void rellenaABC(char[] abc) {
		abc = {'a', 'a', 'a'};
		this.abc[0] = 'a';
		this.abc[1] = 'e';
		this.abc[2] = 'i';
		this.abc[3] = 'o';
		this.abc[4] = 'u';

	}*/
	
	public int[] cuentaVocales() {
		//char[] abc = {'a','b','c'};
		
		this.abc[0] = 'a';
		this.abc[1] = 'e';
		this.abc[2] = 'i';

		
		for(int i = 0; i < frase.length(); i++) {
			for(int j = 0; j < abc.length; j++) {
				if(frase.charAt(i) == abc[j]) {
					this.contador[j]++;
				}
			}
		}
		
		return contador;
		
	}

	public String imprime() {
		String resultado = "";
		String res_letra;
		String res_contador;
		String[] copia_contador = new String[3];
		String[] copia_abc = new String[3];
		
		for (int j = 0; j < abc.length; j++) {
			
			copia_contador[j] = Integer.toString(cuentaVocales()[j]);
			
			copia_abc[j] = Character.toString(this.abc[j]);
			
			resultado = (copia_abc[j]+ "se repite "+copia_contador[j]);
			//resultado = "jolo";
		}
		
		return resultado;
	}
		
		

	
	/*
	public char[] imprime() {
		//String resultado = "";
		String[] copia = new String[3];
		char[] resultado = new char[3];
	
		for(int i = 0; i < cuentaVocales().length; i++) {
			copia[i] = Integer.toString(contador[i]);
			resultado[i] = copia[i].charAt(0);
		}
		
		return resultado;

	}*/
	

	
	
	
	
		//GETTERS & SETTERS

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}
	
	
	/*
	public String[] centaABC() {
		abc[0] = 
		
	}*/
	
	
}
