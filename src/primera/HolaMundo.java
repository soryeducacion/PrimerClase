package primera;

import java.util.Scanner;

public class HolaMundo {
	
	public static void main(String[] args) {
		int num1, edad;
		int num2;
		boolean flag = true;
		float datoF = 55.3f;
		double precio = 44.5;
        int resultado;
		String nombre = "hola mundo";
		String apellido;
		
		Scanner captura = new Scanner(System.in);	
		
		while(flag) {
			System.out.println("Captura un numero: ");
			System.out.println("Suma 1");
			System.out.println("Resta 2");
			System.out.println("Salir 3");
			int op = captura.nextInt();
			
			switch(op) {
				case 1:
					System.out.println("Dame el primer numero: ");
					num1 = captura.nextInt();
					System.out.println("Dame el segundo numero: ");
					num2 = captura.nextInt();
					resultado = num1 + num2;
					System.out.println("Resultado: "+ resultado);
					break;
				case 2:
					System.out.println("Dame el primer numero: ");
					num1 = captura.nextInt();
					System.out.println("Dame el segundo numero: ");
					num2 = captura.nextInt();
					 resultado = num1 - num2;
					System.out.println("Resultado: "+ resultado);
					break;
				case 3:
					flag = false;
					System.out.println("Gracias por usar el sistema");
					break;
				default:
					System.out.println("Dato invalido");
			
			}
		}
	}

}
