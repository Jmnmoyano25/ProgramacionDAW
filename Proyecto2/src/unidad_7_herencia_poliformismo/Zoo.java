package unidad_7_herencia_poliformismo;

public class Zoo {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		AnimalesZoo Gallina = new Gallina();
		AnimalesZoo Leon = new Leon();
		
		Gallina.TipoSonido();
		Leon.TipoSonido();
		Gallina.Forma();
		Leon.Forma();
	}

}
