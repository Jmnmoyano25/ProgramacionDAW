package circulo;

public class Circulo {

	public double radio;

	
	//constructores
	
	public Circulo(double radio) {
		this.radio = radio;
	}
	public Circulo() {
		radio = 2;
	}
	
	//metodos
	
	public double calcularSuperficie () {
		return Math.pow(radio, 2) * Math.PI;
	}
	
	
}
