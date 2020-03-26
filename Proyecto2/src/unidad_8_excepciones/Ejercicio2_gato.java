package unidad_8_excepciones;

public class Ejercicio2_gato {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		Gato Willy = new Gato("macho");
		Gato Pequi = new Gato("hembra");
		Gato Thor = new Gato("macho");
		Gato Canela = new Gato("hembra");
		
		try{
			Willy.apareaCon(Thor);
		}catch(ExcepcionApareamientoImposible EAI) {
			System.out.println("Los gatos no se aparean, se estan peleando ¡O no!");
		}
		
		try{
			Willy.apareaCon(Canela);
		}catch(ExcepcionApareamientoImposible EAI) {
			System.out.println("Los gatos no se aparean, se estan peleando ¡O no!");
		}
		
	}

}
