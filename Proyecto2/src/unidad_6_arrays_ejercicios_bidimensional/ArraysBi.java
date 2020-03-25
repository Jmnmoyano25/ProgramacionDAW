package unidad_6_arrays_ejercicios_bidimensional;
import java.util.*;

public class ArraysBi {
	Scanner sc = new Scanner(System.in);
	//ATRIBUTOS
	private int[] array;
	private int[][] arrayBi;
	
	//CONSTRUCTORES
	protected ArraysBi() {}
	
	protected ArraysBi(int[] array, int[][] arrayBi) {
		this.array = array;
		this.arrayBi = arrayBi;
	}
	
	//METODOS
	
	/*
	 * METODOS DE INICIALIZACIÓN
	 */
	public int[]  InicializaArrayInt() {
		int x;
		System.out.println("\nCual es la longitud del array: ");
		x = sc.nextInt();
		int[] b = new int[x];
		return b;		
	}
	public double[] InicializaArrayDouble() {
		int x;
		System.out.println("\nCual es la longitud del array: ");
		x = sc.nextInt();
		double[] b = new double[x];
		return b;		
	}
	public String[] InicializaArrayString() {
		int x;
		System.out.println("\nCual es la longitud del array: ");
		x = sc.nextInt();
		String[] b = new String[x];
		return b;		
	}
		
	public int[][] InicializaArrayBiInt() {
		int x;
		int y;
		System.out.println("\nCuantas lineas: ");
		x = sc.nextInt();
		System.out.println("\nCuantas columnas: ");
		y = sc.nextInt();
		int[][] b = new int[x][y];
		return b;
	}
	public double[][] InicializaArrayBiDouble() {
		int x;
		int y;
		System.out.println("\nCuantas lineas: ");
		x = sc.nextInt();
		System.out.println("\nCuantas columnas: ");
		y = sc.nextInt();
		double[][] b = new double[x][y];
		return b;
	}
	
	/*
	 * METODOS DE RELLENO
	 */
	public void RellenaArray(int[] a) {
		for(int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random()*50);
		}
	}
	
	public void RellenaArray(double[] a) {
		for(int i = 0; i < a.length; i++) {
			a[i] = (Math.random()*50);
		}
	}
	
	public void RellenaArrayBi(int[][] a) {
		int x;
		int z = 0;
		System.out.println("\n\t1-Correlativo\n\t2-Ramdom");
		x = sc.nextInt();
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if (x == 2) {
					a[i][j] = (int) (Math.random()*50);
				}else
					a[i][j] = z;
				z++;
			}			
		}		
	}
	
	public void RellenaArrayBi(double[][] a) {
		int x;
		int z = 0;
		System.out.println("\n\t1-Correlativo\n\t2-Ramdom");
		x = sc.nextInt();
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if (x == 2) {
					a[i][j] = (Math.random()*50);
				}else
					a[i][j] = z;
				z++;
			}			
		}		
	}
	
	/*
	 * 
	 */
	
	public void ImprimeArrayInt(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	public void ImprimeArraydouble(double[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public void ImprimeArrayBiInt(int[][] a) {
		for(int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a[i].length; j++) {
				
				System.out.print(a[i][j]+" ");
			}
		System.out.println();		
		}
	}
	
	public void Burbuja(int[] a) {
			int aux;
			
			for (int i = 1; i < a.length; i++) {
				
				for (int j = 0; j < a.length - i; j++) {
					
					if (a[j] > a[j + 1]) {
						aux = a[j];
						a[j] = a[j + 1];
						a[j + 1] = aux;
					}
				}
			}
	}
	
	public void Burbuja(double[] a) {
		double aux;
		
		for (int i = 1; i < a.length; i++) {
			
			for (int j = 0; j < a.length - i; j++) {
				
				if (a[j] > a[j + 1]) {
					aux = a[j];
					a[j] = a[j + 1];
					a[j + 1] = aux;
				}
			}
		}
}

	public int[] esPrimos(int[] a) {
		boolean esPrimo = true;
		int[] primos = new int[a.length];
		int[] noPrimos = new int[a.length];
		int[] losPrimos = new int[a.length];
		int primo=0, noPrimo=0;
		//sacamos los primos...
		for(int i = 0; i < a.length; i++) {
			for(int j = 2; j < a[i] -1;j++) {
				if(a[i] % j == 0) {
					esPrimo = false;
				}
			}
			if(esPrimo) {
				primos[primo++] = a[i];
			}else {
				noPrimos[noPrimo++] = a[i];
			}			
		}
		//no lo utilizo por que me pondria los 0 delante
		//ArraysBi.Burbuja(primos);
		//ArraysBi.Burbuja(noPrimos);
		//devolvemos array primos-noPrimos
		for(int i = 0; i < primo; i++) {
			losPrimos[i] = primos[i];
		}
		for(int i = primo; i < primo + noPrimo; i++) {
			losPrimos[i] = noPrimos[i - primo];
		}
		return losPrimos;
		

	}
	
	public void ImprimeArrayBiDouble(double[][] a) {
		for(int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a[i].length; j++) {
				
				System.out.print(a[i][j]+" ");
			}
		System.out.println();		
		}
	}
	
	public int[] SacaArraySimples3filas(int[][] a) {
		int cont = 0;
		int[] c = new int[a.length];
		int[] d = new int[a.length];
		int[] e = new int[a.length];
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
			}
				cont=0;
		}
		return c;		
		
	}
	
	//METODOS QUE MUESTRAN FILAS, COLUMNAS O DIAGONALES 3x3
	public void FilasBiInt(int[][] a) {
		int x;
		int y;

		System.out.println("\nQue fila quieres mostrar: ");
		x = sc.nextInt();
		do {
		if(x > a.length) {
			System.out.println("\nLa fila introducida es mayor que el máximo numero de filas, introduce una fila correcta: ");
			x = sc.nextInt();	
		}
		}while(x > a.length);
		System.out.println("\nComo quieres mostrarla:\n\t1-Normal\n\t2-Inversa\n");
		y = sc.nextInt();
		if(y == 1) {
			for(int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					if(i == x) 
						System.out.print(a[i][j]+" ");					
				}
			}
		}else {
			for(int i = a.length-1; i >= 0; i--) {
				for (int j =a[i].length-1; j >= 0; j--) {
					if(i == x) 
						System.out.print(a[i][j]+" ");					
				}
			}
		}
	}
	public void ColumnasBiInt(int[][] a) {
		int x;
		int y;
		System.out.println("\nQue columna quieres mostrar: ");
		x = sc.nextInt();
		do {
		if(x > a[0].length) {
			System.out.println("\nLa columna introducida es mayor que el máximo numero de columnas, introduce una columna correcta: ");
			x = sc.nextInt();	
		}
		}while(x > a[0].length);
		System.out.println("\nComo quieres mostrarla:\n\t1-Normal\n\t2-Inversa\n");
		y = sc.nextInt();
		if(y == 1) {
			for(int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					if(j == x)
						System.out.println(a[i][j]);
				}
			}
		}else {
			for(int i = a.length -1; i >= 0; i--) {
				for (int j = a[i].length; j >= 0; j--) {
					if(j == x)
						System.out.println(a[i][j]);
				}
			}
		}		
	}
	
	public void DiagonalBiInt(int[][] a) {
		int x;
		int y;
		System.out.println("\nQue diagonal quieres mostrar:\n\t1-Principal\n\t2-Secundaria");
		x = sc.nextInt();
		System.out.println("\nComo quieres mostrarla:\n\t1-Normal\n\t2-Inversa\n");
		y = sc.nextInt();
		if(y == 1) {
			for(int i = 0; i < a.length; i++) {
				for(int j = 0; j < a[i].length; j++) {				
					if(x == 1) {
						if(i == j) {
							System.out.print(a[i][j]+" ");
						}					
					}else if(x == 2) {
						if(i+j == a.length -1) {
							System.out.print(a[i][j]+" ");
						}
					}
				}
			}
		}else {
			for(int i = a.length -1; i >= 0; i++) {
				for(int j = a[i].length; j >= 0 ; j++) {				
					if(x == 1) {
						if(i == j) {
							System.out.print(a[i][j]+" ");
						}					
					}else if(x == 2) {
						if(i+j == a.length -1) {
							System.out.print(a[i][j]+" ");
						}
					}
				}
			}
		}

	}
	
	
}
