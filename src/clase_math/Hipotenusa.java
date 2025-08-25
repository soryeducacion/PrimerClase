package clase_math;

import java.util.Scanner;

public class Hipotenusa
{
	public static void main(String[] args)
	{
		Scanner captura = new Scanner(System.in);
		double base;
		double altura;
		double hipotenusa;
		
		System.out.print("Introduzca la base del triángulo rectángulo: ");
		base = captura.nextDouble();
		System.out.print("Introduzca la altura del triángulo rectángulo: ");
		altura = captura.nextDouble();
		hipotenusa = Math.sqrt(base * base + altura * altura); // SE UTILIZO LA CLASE MATH PARA LA RAIZ CUADRADA
		System.out.println("Longitud de la hipotenusa = " + hipotenusa);
		
	} // fin del main
} // fin de la clase encontrarHipotenusa