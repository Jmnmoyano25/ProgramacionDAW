/*5º
Crea las clases Punto y Linea. De un punto se tienen que saber sus coordenadas x e y, mientras que una línea está definida por 
dos puntos. Define las clases y los métodos necesarios para que el siguiente código muestre la salida que se indica.

Programa principal:

Punto p1 = new Punto(4.21, 7.3);
Punto p2 = new Punto(-2, 1.66);
Linea l = new Linea(p1, p2);
System.out.println(l);

Salida:
Programación orientada a objetos 204
Línea formada por los puntos (4.21, 7.3) y (-2.0, 1.66)
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
		linea = "Línea formada por los puntos ("+punto1.x+", "+punto1.y+") y ("+punto2.x+", "+punto2.y+")";
	}
	
	//METODOS
	void crearPuntos() {
		
	}
	

}
