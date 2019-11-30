package cuentaCorriente;

public class ProbandoCuentaCorriente {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		CuentaCorriente cuenta1 = new CuentaCorriente(5000);
		CuentaCorriente cuenta2 = new CuentaCorriente();
		
		System.out.println(cuenta1.DetallesCuenta());
		System.out.println(cuenta2.DetallesCuenta());
		
		cuenta1.cargo(1000);
		System.out.println(cuenta1.saldo());
		cuenta2.ingreso(600);
		System.out.println(cuenta2.saldo());
		cuenta1.transferencia(cuenta2, 400);

		
		System.out.println(cuenta1.DetallesCuenta());
		System.out.println(cuenta2.DetallesCuenta());
		
		CuentaCorrienteProfe cuenta3 = new CuentaCorrienteProfe();
		
		System.out.println(cuenta3.toString());
		
	}

}
