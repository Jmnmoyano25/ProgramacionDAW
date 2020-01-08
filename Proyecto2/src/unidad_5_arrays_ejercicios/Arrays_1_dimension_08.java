package unidad_5_arrays_ejercicios;
import java.util.Scanner;
public class Arrays_1_dimension_08 {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		Scanner memory = new Scanner (System.in);
		
			//EJERCICIO 8
		
		double[] temp = new double[12];
		int i = 0;
		String simbolo = "|";
		int var2 = 0;
			
		//introducimos valores de temperatura de eneroa a diciembre
		
        for (i = 0; i < temp.length; i++) {
            System.out.print("Introduce la temperatura y pulsa intro: ");
            temp[i]=memory.nextInt();  
        }
        System.out.println(temp[0] + "\n Enero");
        System.out.println(temp[1] + " Febrero");
        System.out.println(temp[2] + " Marzo");
        System.out.println(temp[3] + " Abril");
        System.out.println(temp[4] + " Mayo");
        System.out.println(temp[5] + " Junio");
        System.out.println(temp[6] + " Julio");
        System.out.println(temp[7] + " Agosto");
        System.out.println(temp[8] + " Septiembre");
        System.out.println(temp[9] + " Octubre");
        System.out.println(temp[10] + " Noviembre");
        System.out.println(temp[11] + " Diciembre \n");
        
        
        //ahora vamos a crear una digrama de barras
        
        for(i = 0; i < temp.length; i++) {
        	//bucle del caracter
        	for(double j = 0.0; j < temp[i]; j++) {
        		System.out.print(simbolo);
        	}
        	System.out.println("\n");
        }
        /*
        //solicitamos dos numeros por teclado para intercambiarlos
        
        System.out.print("Introduce un número entero y pulsa intro: ");
        var1 = memory.nextInt();
        System.out.print("Introduce un segundo número entero y pulsa intro: ");
        var2 = memory.nextInt();
        
        //ahora procedmos a cambiar los numeros introducidos (var1) que coincidan por el (var2)
        
        for (i = 0; i < numeros.length; i++) {
        
          	
        	 if (numeros[i] == var1) {
        	        System.out.print("'" + var2 + "' ");
        	      } else {
        	        System.out.print(numeros[i] + " ");
        	      }
        }
        */
	}

}
