package unidad_7_herencia;

public class EmpleadoFijo extends Empleado {

	@Override
	public void calcularSalario() {
		// TODO Apéndice de método generado automáticamente
		this.salario += 100;
		System.out.println(salario);
	}
	
	public static void main(String[] args) {
		
		EmpleadoFijo efij = new EmpleadoFijo();
		
		efij.calcularSalario();
	}


}
