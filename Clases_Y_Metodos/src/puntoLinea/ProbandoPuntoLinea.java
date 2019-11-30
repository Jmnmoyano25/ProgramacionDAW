package puntoLinea;

public class ProbandoPuntoLinea {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		PuntoLinea p1 = new PuntoLinea(8.1, 6.6);
		PuntoLinea p2 = new PuntoLinea(7.5, 0.35);
		PuntoLinea linea = new PuntoLinea(p1,p2);
		
		System.out.println(linea.linea);
	}

}
