package unidad_3;

public class PruebaComplejo {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Complejo uno = new Complejo();
		Complejo dos = new Complejo(3,5);
		
		uno.cambia_Real(4);
        dos.cambia_Imag(7);

        System.out.println("Numero complejo uno: " + uno.toString());
        System.out.println("Numero complejo dos: " + dos.toString());

        uno.sumar(dos);
        System.out.println("Suma uno + dos: " + uno.toString());
	}

}
