package unidad_6_arrays_ejercicios_propuestos;

public class ContarVocales {

		//ATRIBUTOS
	
	private char[] vocales = new char[20];
	private String frase;
	
	
		//CONSTRUCTORES
	
	public ContarVocales () {
	}
	
	public ContarVocales (String frase) {
		this.frase = frase;
	}
	
		//METODOS
	
	public int cuentaVocales() {
		int contador = 0;
		
		vocales[0] = 'a';
		vocales[1] = 'e';
		vocales[2] = 'i';
		vocales[3] = 'o';
		vocales[4] = 'u';
		vocales[5] = 'á';
		vocales[6] = 'é';
		vocales[7] = 'í';
		vocales[8] = 'ó';
		vocales[9] = 'ú';
		vocales[10] = 'A';
		vocales[11] = 'E';
		vocales[12] = 'I';
		vocales[13] = 'O';
		vocales[14] = 'U';
		vocales[15] = 'Á';
		vocales[16] = 'É';
		vocales[17] = 'Í';
		vocales[18] = 'Ó';
		vocales[19] = 'Ú';
		

		for (int i = 0; i < this.frase.length(); i++) {
			for(int j = 0; j < vocales.length; j++) {
				if (this.frase.charAt(i) == vocales[j] ) {
					contador++;
				}
			}
			
		}
		return contador;
		
	}

	public char[] getVocales() {
		return vocales;
	}

	public void setVocales(char[] vocales) {
		this.vocales = vocales;
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}
	
	
	
}
