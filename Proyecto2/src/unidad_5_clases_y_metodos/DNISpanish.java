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
			//llamamos al metodo calcularLetraNIF para 
			char letra = calcularLetraNIF(DNI);
			this.numDNI = DNI;
			System.out.println(letra);
			
		}
		public void establecer (String NIF) throws Exception{
			
			if(validarNIF(NIF)) {
				System.out.println("OK DNI");
				this.numDNI  = extraerNumeroNIF(NIF);
			}
			else throw new Exception("KO DNI");
		}
		
		//metodos ocultos para calculo del metodo public "esteblecer DNI"
		//este metodo es para el caso de que el usuario introduzca el DNI
		
		private static char calcularLetraNIF(int DNI) {
			int posLetra = DNI % 23;
			char letra = LETRAS_NIF.charAt(posLetra);
			
			//la variable DNI en este metodo es inveNtado, podria ser "perico"
			return letra;
		}
		
		
		/*private String prueba() {
			String LETRA = Character.toString(calcularLetraNIF(this.numDNI));
			
			String DNI = String.valueOf(this.numDNI); 
			
			String NIF = DNI + LETRA;
			return NIF;
		}*/
		
		//metodos ocultos para calculo del metodo public "establecer NIF"
		//estos metodos sos para el caso que el usuario introduzca el NIF
		
		private static char extraerLetraNIF(String NIF) {
						
			char LETRA = NIF.charAt(NIF.length()-1);
			
			return LETRA;
			//la variable NIF en este metodo es inventado, podria ser "juanito"
		}
		private static int extraerNumeroNIF(String NIF) {
			
			 
			int NUMERO = Integer.parseInt(NIF.substring(0, NIF.length()-1));
			
			return NUMERO;
		}
		
		//metodo comprobar los metodos anteriores
		
		private boolean validarNIF(String NIF) {
			
			boolean valida = true;
			int numEX = extraerNumeroNIF(NIF);
			char letraEX = extraerLetraNIF(NIF);
			char letra = calcularLetraNIF(numEX);
			
			if (letraEX == letra) {
				return valida;
			}
			else valida = false;
			
			return valida;
			
			
		}
		
}
