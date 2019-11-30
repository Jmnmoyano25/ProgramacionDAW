/*5�
Crea las clases Punto y Linea. De un punto se tienen que saber sus coordenadas x e y, mientras que una l�nea est� definida por 
dos puntos. Define las clases y los m�todos necesarios para que el siguiente c�digo muestre la salida que se indica.

Programa principal:

Punto p1 = new Punto(4.21, 7.3);
Punto p2 = new Punto(-2, 1.66);
Linea l = new Linea(p1, p2);
System.out.println(l);

Salida:
Programaci�n orientada a objetos 204
L�nea formada por los puntos (4.21, 7.3) y (-2.0, 1.66)
*/

package puntoLinea;

public class PuntoLinea {
	
	//ATRIBUTOS
	double x, y;
	String linea="";
	
	//CONSTRUCTORES
	public PuntoLinea (double x, double y) {
		this.x = x;
		this.y = y;
	}
	public PuntoLinea(PuntoLinea punto1, PuntoLinea punto2) {
		linea = "L�nea formada por los puntos ("+punto1.x+", "+punto1.y+") y ("+punto2.x+", "+punto2.y+")";
	}
	
	//METODOS
	void crearPuntos() {
		
	}
	

}
