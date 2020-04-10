package unidad_9_colecciones;

public class Clientes {

	//ATRIBUTOS
	private String nombre;
	private String n_cuenta;
	private double saldo;
	
	//CONSTRUCTOR
	public Clientes(String nombre, String n_cuenta, double saldo){
		this.nombre = nombre;
		this.saldo = saldo;
		this.n_cuenta = n_cuenta;
	}

	//METODOS
	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getN_cuenta() {
		return n_cuenta;
	}

	protected void setN_cuenta(String n_cuenta) {
		this.n_cuenta = n_cuenta;
	}

	protected double getSaldo() {
		return saldo;
	}

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((n_cuenta == null) ? 0 : n_cuenta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clientes other = (Clientes) obj;
		if (n_cuenta == null) {
			if (other.n_cuenta != null)
				return false;
		} else if (!n_cuenta.equals(other.n_cuenta))
			return false;
		return true;
	}
	
	
	
	
	
	
}
