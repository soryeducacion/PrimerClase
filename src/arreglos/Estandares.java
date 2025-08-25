package arreglos;

import java.util.Scanner;

public class Estandares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long[] telefonos;
		Scanner captura = new Scanner(System.in);
		System.out.println("Cuantos numeros quieres almacenar? ");
		int sizeArray = captura.nextInt();
		telefonos = new long[sizeArray]; 
		long num_tel;
		
		for(int x=0; x<sizeArray; x++) {
			System.out.println("Dame el telefono");
			num_tel = captura.nextLong();
			telefonos[x] = num_tel;
		}
		
		for(int i = 0; i < telefonos.length  ; i++ ) {
			System.out.println("El numero de tel es: " +telefonos[i]);
		}
		
		
		
		

	}

}
