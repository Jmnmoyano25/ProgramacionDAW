package unidad_7_herencia;

public class EmpleadoComercial extends Empleado {

	
	@Override
	public void calcularSalario() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		this.salario = this.salario + 75;
		System.out.println(salario);
	}
	
	public static void main(String[] args) {

	EmpleadoComercial ecom = new EmpleadoComercial();
	
	ecom.calcularSalario();
	}
}
