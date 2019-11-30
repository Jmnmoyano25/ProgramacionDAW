/*4º
 Implementa la clase CuentaCorriente.
 Cada cuenta corriente tiene un número de cuenta de 10 dígitos. 
 Para simplificar, el número de cuenta se genera de forma aleatoria cuando se crea una cuenta nueva. 
 La cuenta se puede crear con un saldo inicial; en caso de no especificar saldo, se pondrá a cero inicialmente.
 En una cuenta se pueden hacer ingresos y gastos. También es posible hacer una transferencia entre una cuenta y otra.
 Se permite el saldo negativo.

Programa principal:

CuentaCorriente cuenta1 = new CuentaCorriente();
CuentaCorriente cuenta2 = new CuentaCorriente(1500);
CuentaCorriente cuenta3 = new CuentaCorriente(6000);
System.out.println(cuenta1);
System.out.println(cuenta2);
System.out.println(cuenta3);
cuenta1.ingreso(2000);
cuenta2.cargo(600);
cuenta3.ingreso(75);
cuenta1.cargo(55);
cuenta2.transferencia(cuenta3, 100);
System.out.println(cuenta1);
System.out.println(cuenta2);
System.out.println(cuenta3);
Salida:
Número de cta: 6942541557 Saldo: 0,00 €
Número de cta: 9319536518 Saldo: 1500,00 €
Número de cta: 7396941518 Saldo: 6000,00 €
Número de cta: 6942541557 Saldo: 1945,00 €
Número de cta: 9319536518 Saldo: 800,00 €
Número de cta: 7396941518 Saldo: 6175,00 €*/

package cuentaCorriente;

public class CuentaCorriente {

	//ATRIBUTOS O CAMPOS
	private String numeroCuenta = "";
	double saldo;
	
	//CONSTRUCTORES
	public CuentaCorriente() {
	this.crearCuenta();
	}
	public CuentaCorriente( double saldo) {
		/*for (int i=0;i<10;i++) {
			num_cuenta = num_cuenta + Integer.toString((int)(Math.random()*10));*/
		this.crearCuenta();
		this.saldo = saldo;
	}
	
	private void crearCuenta() {
		//numeroCuenta = ((int)Math.floor(Math.random()*1000000000)); MI METODO
		for(int i = 0; i < 10; i++) {//METODO DEL PROFE CON FOR, MAS PRACTICO
			numeroCuenta += (int)(Math.random()*10);
		}
	}
	
	
	public String DetallesCuenta() {

		return "La cuenta: "+ numeroCuenta+ ", con saldo: "+String.format("%.2f", saldo);
	}
	
	public String saldo() {
		return "El saldo actual es: "+String.format("%.0f", saldo);
	}
		
	void cargo(int dinero) {
		saldo -= dinero;
	}
	void ingreso(int dinero) {
		saldo += dinero;
	}
	void transferencia(CuentaCorriente cuentab, int dinero) {
		saldo -= dinero;
		cuentab.saldo += dinero;
	}
	

	
}
