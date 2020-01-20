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
			
			//llamamos al método calcularLetraNIF para saber la letra del ENTERO
			
			char letra = calcularLetraNIF(DNI);
			this.numDNI = DNI;
			System.out.println(letra);
		}
		
		public void establecer (String NIF) throws Exception{
			
			//llamamos al metodo validar[boolean], este mismo llama a otros dos metodos
			
			if(validarNIF(NIF)) {
				System.out.println("OK DNI");
				this.numDNI  = extraerNumeroNIF(NIF);
			}
			//throw lo utilizamos para capturar el error
			else throw new Exception("KO DNI");
		}
				//---------------------------------------------------------------
				//metodo oculto para calculo del metodo public "esteblecer DNI"
				//este metodo es usuado cuando se establece el DNI por el usuario
				//---------------------------------------------------------------
		//metod 1º
		private static char calcularLetraNIF(int DNI) {
			int posLetra = DNI % 23;
			char letra = LETRAS_NIF.charAt(posLetra);
			
			//la variable DNI en este metodo es inveNtado, podria ser "perico"
			return letra;
		}
		
		
				//------------------------------------------------------------------		
				//metodos ocultos para calculo del metodo public "establecer NIF"
				//estos metodos son usados cuando se establece el NIF por el usuario
				//------------------------------------------------------------------
		//metodo 2º
		private static char extraerLetraNIF(String NIF) {
						
			char LETRA = NIF.charAt(NIF.length()-1);
			
			return LETRA;
			//la variable NIF en este metodo es inventado, podria ser "juanito"
		}
		
		//metodo 3º
		private static int extraerNumeroNIF(String NIF) {
						 
			int NUMERO = Integer.parseInt(NIF.substring(0, NIF.length()-1));
			
			return NUMERO;
		}
		
				//-----------------------------------------------------------
				//metodo utilizado para comprobar los tres métodos anteriores
				//-----------------------------------------------------------
		//metodo 4º
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
