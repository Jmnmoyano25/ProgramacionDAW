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
		vocales[5] = '�';
		vocales[6] = '�';
		vocales[7] = '�';
		vocales[8] = '�';
		vocales[9] = '�';
		vocales[10] = 'A';
		vocales[11] = 'E';
		vocales[12] = 'I';
		vocales[13] = 'O';
		vocales[14] = 'U';
		vocales[15] = '�';
		vocales[16] = '�';
		vocales[17] = '�';
		vocales[18] = '�';
		vocales[19] = '�';
		

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
