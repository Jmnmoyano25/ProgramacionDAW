package proyecto2tri;

import java.util.Scanner;
public class MarkovMatriz {
		
		//Crea una matriz por teclado
		
		public static double[][] getMatrix() {
			Scanner input = new Scanner(System.in);

			double[][] m = new double[3][3];

			System.out.println("Enter a 3-by-3 matrix row by row:");
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[i].length; j++) {
					m[i][j] = input.nextDouble();
				}
			}
			return m;
		}

		/** isMarkovMatrix returns true if matrix is a positive Markov matrix */
		public static boolean isMarkovMatrix(double[][] m) {
			return isElementsPositive(m) && isEachColumnSum1(m);
		}

		/** isElementsPositive returns true if each 
		    element in the matrix is positive */
		public static boolean isElementsPositive(double[][] m) {
			for (int i = 0; i < m.length; i++) {
				for (int j = 0; j < m[i].length; j++) {
					if (m[i][j] < 0)
						return false;
				}
			}
			return true;
		}

		/** isEachColumnSum1 returns true if the 
		    sum of the elements in each column is 1 */
		public static boolean isEachColumnSum1(double[][] m) {
			for (int col = 0; col < m.length; col++) {
				double sum = 0; // Sum of each column
				for (int row = 0; row < m.length; row++) {
					sum += m[row][col];
				}
				if (sum != 1)
					return false;
			}
			return true;
		}
		/** Main method */
		public static void main(String[] args) {
			double[][] matrix = getMatrix();

			System.out.println("Es matriz de Markov?: " + isMarkovMatrix(matrix));
		}
	}
