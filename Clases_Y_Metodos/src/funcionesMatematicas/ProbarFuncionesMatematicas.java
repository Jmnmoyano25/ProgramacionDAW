package funcionesMatematicas;
import java.util.Scanner;
public class ProbarFuncionesMatematicas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		funcionesMatematicas primos = new funcionesMatematicas();
		System.out.println("Escribe un número: ");
		int primo = sc.nextInt();
		
	    primos.esPrimo(primo);
	    primos.cuentaDigitos(109);
	}

}
