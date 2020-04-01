package proyecto2tri;

public class Cuadrado extends ObjetoGeometrico implements Colorable {
		private double side;

		public Cuadrado() {
		}

		public Cuadrado(double side) {
			this.side = side;
		}

		public Cuadrado(double side, String color, boolean filled) {
			super(color, filled);
			setSide(side);
		}

		public void setSide(double side) {
			this.side = side;
		}

		public double getSide() {
			return side;
		}

		@Override
		public double getArea() {
			return Math.pow(side, 2);
		}

		@Override
		public double getPerimeter() {
			return side * 4;
		}

		@Override
		public String howToColor() {
			return "Color por los cuatro lados";
		}

		@Override
		public String toString() {
			return super.toString() + "\nSide: " + side + "\nArea: " + getArea()
				+ "\nPerimeter: " + getPerimeter();
		}
	}
