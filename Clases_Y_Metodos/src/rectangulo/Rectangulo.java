package rectangulo;

public class Rectangulo {

	private double base;
	private double altura;
	
	public Rectangulo() {}
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	//constructor copia
	public Rectangulo (Rectangulo R) {
		this.base = R.base;
		this.altura = R.altura;
	}
	//metodos

	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getArea() {
		return base * altura;
	}
	public double getPerimetro () {
		return 2 * (base + altura);
	}
}