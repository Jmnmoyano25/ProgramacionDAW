/*Diseñar una clase PruebaCoche que haga:
======================================
Crear dos coches:
"saab" modelo 93 ==> persona1
"Toyota Avensis" ==> persona2

persona1 recorre: 30km, 40km, 220km
persona2 recorre: 60km, 150km, 90km
imprimir kmTotal del coche persona1
imprimir kmTotal del coche persona2
*/

package unidad_3;

public class PruebaCoche {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		/*Creamos dos objetos de la clase Coche:
			El objeto "coche1" con los atributos "Saab" y "93"
			El objeto "coche2" con los atributos "Toyota" y "Avensis"*/
		Coche coche1 = new Coche ("Saab","93");
		Coche coche2 = new Coche ("Toyota", "Avensis");
		
	
		System.out.println("Juan, con el coche "+coche1.marca+" "+coche1.modelo);
		coche1.recorre(30);	//al utilizar el método recorre, suma los valores a la variable "kilometrajeTotal
		coche1.recorre(40);
		coche1.recorre(220);
		System.out.println("Recorre: "+coche1.devuelveKmTotal()+" Km");
		
		System.out.println("Pedro, con el coche "+coche2.marca+" "+coche2.modelo);
		coche2.recorre(60);
		coche2.recorre(150);
		coche2.recorre(90);
		System.out.println("Recorre: "+coche2.devuelveKmTotal()+" Km");
		
	}

}
