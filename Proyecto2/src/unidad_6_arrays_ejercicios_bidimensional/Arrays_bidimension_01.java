package unidad_6_arrays_ejercicios_bidimensional;

public class Arrays_bidimension_01{

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		ArraysBi uno = new ArraysBi();
		
		int[][] a = new int[3][6];
		int[] c = new int[6];
		int[] d = new int[6];
		int[] e = new int[6];
		int[][] s;
		int cont = 0;
		
		a[0][0] = 0;
		a[0][1] = 30;
		a[0][2] = 2;
		a[0][5] = 5;
		a[1][0] = 75;
		a[1][4] = 0;
		a[2][2] = -2;
		a[2][3] = 9;
		a[2][5] = 11;
		
		double[][] b = new double[3][6];
		b[0][0] = 0;
		b[0][1] = 30;
		b[0][2] = 2;
		b[0][5] = 5;
		b[1][0] = 75;
		b[1][4] = 0;
		b[2][2] = -2;
		b[2][3] = 9;
		b[2][5] = 11;
		
		uno.ImprimeArrayBiDouble(b);
		
		//uno.Burbjuja(a);
		

		for(int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {
				if(i == 0) {
					c[cont] = a[i][j];
					cont++;
				}else if(i == 1) {
					d[cont] = a[i][j];
					cont++;
				}else if(i == 2) {
					e[cont] = a[i][j];
					cont++;
				}
				System.out.print(a[i][j]+" ");
				
			}
		System.out.println();		
		cont=0;
		}
		
		System.out.println("\n\n");
		
		uno.ImprimeArrayInt(c);
		uno.Burbuja(c);;
		System.out.println();
		uno.ImprimeArrayInt(c);
		
		s = uno.InicializaArrayBiInt();
		uno.RellenaArrayBi(s);;
		uno.ImprimeArrayBiInt(s);
		
		//uno.FilasBiInt(s);
		
		//uno.ColumnasBiInt(s);
		
		uno.DiagonalBiInt(s);
	}

}
