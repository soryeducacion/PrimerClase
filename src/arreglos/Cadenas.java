package arreglos;

import java.util.Scanner;

public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nombres = new String[3];
		int[] edades = new int[10]; // arreglos de tipo entero
		double[] precios = new double[5]; //arreglos de tipo flotante 
		
		Scanner captura = new Scanner(System.in);
		String nombre;
		for(int i = 0; i< nombres.length; i++) {
			System.out.println("Dame el nombre "+ i );
			nombre = captura.nextLine();
			nombres[i] = nombre;
		}
		
		for(int n = 0; n < nombres.length; n++) {
			System.out.println("El nombre es: "+nombres[n]);
		}

	}

}