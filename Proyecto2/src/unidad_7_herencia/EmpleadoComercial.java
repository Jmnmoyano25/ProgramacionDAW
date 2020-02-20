package unidad_7_herencia;

public class EmpleadoComercial extends Empleado {

	
	@Override
	public void calcularSalario() {
		// TODO Apéndice de método generado automáticamente
		this.salario = this.salario + 75;
		System.out.println(salario);
	}
	
	public static void main(String[] args) {

	EmpleadoComercial ecom = new EmpleadoComercial();
	
	ecom.calcularSalario();
	}
}
