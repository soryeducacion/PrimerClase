package primera;

public class MiClase {

    // Métodos
    public static void saludar() {
        System.out.println("Hola, mundo!");
    }

    public void saludarPersona(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }

    public int sumar(int a, int b) {
        return a + b;
    }

    public String obtenerMensaje() {
        return "Este es un mensaje";
    }

    public static void main(String[] args) {
       // MiClase miClase = new MiClase();

    	 System.out.println("Cantidad de argumentos: " + args.length);
         for (int i = 0; i < args.length; i++) {
             System.out.println("Argumento " + i + ": " + args[i]);
         }
    }
}
