package unidad_9_colecciones;

import java.util.*;
public class Cuentas_usuarios {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		
		Clientes cl1 = new Clientes("Juanito Balderrama", "00001", 200000);
		Clientes cl2 = new Clientes("Paquito el Chocolatero", "00002", 100000);
		Clientes cl3 = new Clientes("Maria la Portuguesa", "00003", 150000);
		Clientes cl4 = new Clientes("Susan Sarandon", "00004", 300000);
		Clientes cl5 = new Clientes("Juanito Balderrama", "00001", 200000);
		
		Set <Clientes> clientesBanco = new HashSet<Clientes>();
		
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);
		clientesBanco.add(cl5);
		
		
		
		for (Clientes clientes : clientesBanco) {
			System.out.println(clientes.getNombre() + " " + clientes.getN_cuenta() + " " + clientes.getSaldo());
		}
		
		//como es una coleccion de tipo set y no admite duplicados, el cl5 no aparece
		
	
	}
	

}
