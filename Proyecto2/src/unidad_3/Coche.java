/*Dise�ar un clase Coche
 ======================
-marca
-modelo
-kilometrajeTotal = 0

-m�todo devuelve el km total
-m�todo recorre(int km)
*/
package unidad_3;

public class Coche {
	//ATRIBUTOS:
	String marca;
	String modelo;
	int kilometrajeTotal = 0;
	
			//CONSTRUCORES (PARA INICIALIZAR LOS ATRIBUTOS DE LA CLASE)
	
	//constructor ESTANDAR
	public Coche() {}
	
	//constructor de la clase 
	public Coche(String mar, String mod) {
		marca = mar;
		modelo = mod;
	}
	
			//M�TODOS
	
	//m�todo recorre a�ade un entero a "kilometrajeTotal" cuando lo llamemos desde un objeto, void no devuelve nada, solo admite datos.
	public void recorre (int km) {
		kilometrajeTotal += km; //esto es igual a kilometrajeTotal = kilometrajeTotal + km;
	}
	
	//m�todo devuelve los kilometros de kilometrajeTotal
	public int devuelveKmTotal() {
		return kilometrajeTotal;
	}
	

}
