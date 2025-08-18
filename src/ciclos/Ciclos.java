package ciclos;

public class Ciclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CICLO WHILE
		
		int i = 1; // Se declara la variable en i=1 para que se cumpla la condicion y entre al arreglo.
		//while (condición) { sintaxis
		while (i <= 5) {
		    System.out.println("Número: " + i);
		    i++;
		}
		
		/*CICLO FOR
		 sintaxis del ciclo
		 for (inicialización; condición; actualización) {
		 */
		for (int x = 1; x <= 5; x++) {
		    System.out.println("Iteración: " + x);
		}
		
		/*Ciclo do-while
		  Es similar al while, pero siempre ejecuta al menos una vez el bloque de código, ya que la condición se evalúa después.
		  sintaxis 
		  do {
			    // Código que se repite
			} while (condición);
		*/
		int j = 1;
		do {
		    System.out.println("Valor: " + j);
		    j++;
		} while (j <= 5);
		

	}

}
