/*
 * 1� Introducimos ArrayIndexOutOfBoundsExceptionmi_excepcion = new ArrayIndexOutOfBoundsException(); (excepci�n no
 *    no controlada que sirve cuando intentamos alcanzar una posici�n de un array que no existe).
 * 	  En el primer if del metodo para demostrar que esta excepcion salta sin necesidad de un try-catch, es decir,
 * 	  no hace falta capturar la excepci�n.
 * 
 * 2� A�adimos la excepci�n EOFExcepci�n (excepcion controlada que salta al encontrarse un archivo de texto no completo)
 *    en el throw para demostrar que nos obliga a introducir un try-catch en la entrada de datos.
 * 
 * 3� Por �ltimo creamos una excepci�n propia para controlar el error del mail.
 */

package unidad_8_excepciones;

import java.io.EOFException;
import javax.swing.JOptionPane;

public class Comprueba_mail {

	public static void main(String[] args) {
		// TODO Ap�ndice de m�todo generado autom�ticamente

		String mail = JOptionPane.showInputDialog("Introduce un mail:");
		
		try {
			comprueba_mail(mail);
		}catch(Longitud_mail_erronea e) {
			System.out.println("La direcci�n de email no es correcta");
			
			//sirver para mostrar la excepci�n en habitual en rojo para tener una pista que clase a generado la excepci�n
			e.printStackTrace();
			
		}
	}

	/*
	 * metodo que comprueba con un bucle si el String introducido contiene una "@" o un "."
	 */
	static void comprueba_mail(String mail) throws Longitud_mail_erronea{

		int arroba = 0;

		boolean punto = false;
		
		if(mail.length()<= 3){
			
			//ArrayIndexOutOfBoundsException mi_excepcion = new ArrayIndexOutOfBoundsException();
			
			//throw new EOFException();
			throw new Longitud_mail_erronea("El mail no puede tener menos de 3 caracteres"); //msj personalizado del constructor de la clase
																							 //del constructor, pero solo lo pondremos si		
		}else {															   					 //si en el catch no capturamos el error.	

		for (int i = 0; i < mail.length(); i++) {
			if (mail.charAt(i) == '@') {

				arroba++;
			}
			if (mail.charAt(i) == '.') {
				punto = true;
			}
		}

		if (arroba == 2 && punto == true) {
			System.out.println("Email correcto");
		} else {
			System.out.println("Email incorrcto");
		}
	}
	}

}

class Longitud_mail_erronea extends Exception{
	
	public Longitud_mail_erronea () {}
	
	public Longitud_mail_erronea (String msj_error) {
		
		super(msj_error);
		
	}
	
}