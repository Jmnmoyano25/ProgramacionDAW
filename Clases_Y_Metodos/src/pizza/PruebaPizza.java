package pizza;
import java.util.Scanner;
public class PruebaPizza {

	public static void main(String[] args) {
		

		Scanner sr = new Scanner(System.in);
		
		Pizza uno = new Pizza("Mediana","Margarita");
		Pizza dos = new Pizza("Mediana","Margarita");
		Pizza tres = new Pizza("Mediana","Margarita");
		
		//pizza pedida = new Pizza ();
		
		System.out.println(uno.tama�o());
		System.out.println(uno.tipo());
		System.out.println(uno.estadoPedida());
	
		
		
		System.out.println(dos.tama�o());
		System.out.println(dos.tipo());
		System.out.println(dos.estadoPedida());
		

		
		uno.pedidos();
		uno.servida();
		System.out.println(uno.estadoServida());
		System.out.println(dos.estadoServida());
		
		
	}

}
	


