import java.util.Scanner;

public class ProductosEnteros{
	public static void main(String[] args){
		System.out.println("Cuadrado y Cubo de enteros");
	
		Scanner entrada = new Scanner(System.in);
		
		int a, b, c, d, e, f, g, h, i ,j, a2, b2, c2, d2, e2, f2, g2, h2, i2, j2, a3, b3, c3, d3, e3, f3, g3, h3, i3, j3;
			
		a = 0; b = a + 1; c = b + 1; d = c + 1; e = d + 1; f = e + 1; g = f + 1; h = g + 1; i = h + 1; j = i + 1;
		a2 = a * a; b2 = b * b; c2 = c * c; d2 = d * d; e2 = e * e; f2 = f * f; g2 = g * g; h2 = h * h; i2 = i * i; j2 = j * j;
		a3 = a2 * a; b3 = b2 * b; c3 = c2 * c; d3 = d2 * d; e3 = e2 * e; f3 = f2 * f; g3 = g2 * g; h3 = h2 * h; i3 = i2 * i; j3 = j2 * j;
		
		System.out.printf("%s%s%s%d%s%d%s%d%n%d%s%d%s%d%n%d%s%d%s%d%n%d%s%d%s%d%n%d%s%d%s%d%n%d%s%d%s%d%n%d%s%d%s%d%n%d%s%d%s%d%n%d%s%d%s%d%n%d%s%d%s%d%n",
		"número\t", "cuadrado\t", "cubo\n",
		a, "\t", a2, "\t\t", a3,
		b, "\t", b2, "\t\t", b3,
		c, "\t", c2, "\t\t", c3,
		d, "\t", d2, "\t\t", d3,
		e, "\t", e2, "\t\t", e3,
		f, "\t", f2, "\t\t", f3,
		g, "\t", g2, "\t\t", g3,
		h, "\t", h2, "\t\t", h3,
		i, "\t", i2, "\t\t", i3,
		j, "\t", j2, "\t\t", j3);	

	}
}
		
		
