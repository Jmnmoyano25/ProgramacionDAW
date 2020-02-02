package unidad_5_clases_y_metodos;

public class Persona {

		//ATRIBUTOS
	
	private String nombre;
	private int edad, DNI;
	private String sexo;
	private double peso, altura;
	
		//CONSTRUCTORES
	public Persona() {}
	
	public Persona(String nombre, int DNI, int edad, String sexo) {
		this.nombre = nombre;
		this.DNI = DNI;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	public Persona(String nombre, int DNI, int edad, String sexo, double peso, double altura) {
		this.nombre = nombre;
		this.DNI = DNI;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
		//METODOS
	
	public double IMC() {
	//peso kg/altura^2 m
		double IMC;
		IMC = peso/Math.pow(altura, 2);
		return IMC;
	}
	
	public String valoracionIMC() {
		String resultado;
		
		if(IMC() < 20) {
			resultado= "Peso por debajo de lo normal";
		}else if(IMC() >= 25) {
			resultado= "Tiene sobrepeso";
		}else {
			resultado= "Peso normal";
		}
		return resultado;
	}
	
	public boolean mayorDeEdad() {
		boolean adulto = true;
		if(edad < 18) {
			adulto = false;
			System.out.println("Eres menor de edad");
		}else {
			System.out.println("Eres mayor de edad");
		}
		return adulto;
	}
	
	//no creo que este bien aún
	private void comprobarSexo(String sexo) {
		sexo = this.sexo;
		if (sexo == "H" || sexo == "M" || sexo == "h" || sexo == "m") {
			System.out.println("sexo correcoto");
		}else {
			sexo = "H";
		}
	}
		//mirar el git de javi para este ejercicio
	
	
			//METODO TO STRING()
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + ", IMC()=" + IMC() + ", valoracionIMC()=" + valoracionIMC() + "]";
	}
			//GETTERS & SETTERS
						
	
	public String getNombre() {
		return nombre;
	}
		public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getDNI() {
		return DNI;
	}
	public void setDNI(int dNI) {
		DNI = dNI;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
		
	
}
