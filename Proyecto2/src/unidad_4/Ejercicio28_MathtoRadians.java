package unidad_4;
import java.util.Scanner;
public class Ejercicio28_MathtoRadians {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner memory = new Scanner (System.in);
		
		double  a, b, c, d, e, f, g, h, i, j;
		
		a = Math.abs(30);
		b = Math.abs(90);
		
		c = Math.abs(Math.toRadians(30));
		d = Math.toRadians(90);
		
		e = Math.sin(c);
		f = Math.sin(d);
		
		g = Math.cos(c);
		h = Math.cos(d);
		
		i = Math.tan(c);
		j = Math.tan(d);
				
		System.out.printf("degrades\t\tradianes\t\tsin\t\tcos\t\ttag\n  %f\t\t  %f\t\t %f\t %f\t %f\n  %f\t\t  %f\t\t %f\t %f\t %f",a,c,e,g,i,b,d,f,h,j);
		
	}

}
