package unidad_5_clases_y_metodos;

public class DNISpanish {

		//atributos
	
		private int numDNI;
		private String numNIF;
		private static final String LETRAS_NIF = "TRWAGMYFPDXBNJZSQVHLCKE";
		//private String secuenciaLetrasNIF = "TRWAGMYFPDXBNJZSQVHLCKE";
		

		
		//constructores
		
		public DNISpanish() {
		
		}
		
		
		//metodos
		public int getDNI() {
			return numDNI;
		}
		
		public String getNIF() {
			return numNIF;
		}
		
		public void establecer (int DNI) {
			this.numDNI = DNI;
		}
		public void establecer (String NIF) {
			this.numNIF = NIF;
		}
		
		//metodos ocultos para calculo del metodo public "esteblecer DNI"
		
		private static char calcularLetraNIF(int DNI) {
			int posLetra = DNI % 23;
			char letra = LETRAS_NIF.charAt(posLetra);
			
			return letra;
		}
		private String prueba() {
			String LETRA = Character.toString(calcularLetraNIF(this.numDNI));
			
			String DNI = String.valueOf(this.numDNI); 
			
			String NIF = DNI + LETRA;
			return NIF;
		}
		
		//metodos ocultos para calculo del metodo public "establecer NIF"
		
		private static char estraerLetraNIF(String NIF) {
						
			char LETRA = NIF.charAt(NIF.length()-1);
			
			return LETRA;
			
		}
		private static int estraerNumeroNIF(String NIF) {
			
			 
			int NUMERO = Integer.parseInt(NIF.substring(0, NIF.length()-1));
			
			return NUMERO;
		}
		
		//metodo comprobar los metodos anteriores
		/*
		private boolean validarNIF(String NIF) {
			
			
		}*/
		
}
