package primera;

import java.util.Scanner;

import docentes.Docentes;

public class Persona {
	private int edad;
	private String nombre;
	private String apellido;
	protected String fecha_nacimiento;
	
	public Persona(int edad, String nombre, String apellido, String fecha_nac) {
		this.edad = edad;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_nacimiento = fecha_nac;
	}
	
	public Persona() {
		
	}	
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	 public String getAtributos(){
	      return "\n Nombre " + this.nombre 
	               + "\n Apellido " + this.apellido
	               + "\n Edad " + this.edad
	               + "\n Fecha Nac " + this.fecha_nacimiento;
	    }

	protected void caminar() {
		System.out.println("Esta caminando...");
	}
	
	private void dormir(int veces, String nombre) {
		System.out.println(nombre +" esta durmiendo " + veces + " veces a la semana");
	}
	
	protected double comer(double cantidad, String nombre) {
		double resultado;
		resultado = 78.55*cantidad;
		return resultado; 
	}

    public static void main(String[] args) {
    	boolean entrar = true;
    	Docentes procesos_mate = new Docentes();
    	
    	procesos_mate.guardarMateria( new Docentes(602800,"Lenguaje Java","Programación"));
    	//procesos_mate.getMaterias(); 
    	
    	procesos_mate.getMaterias(); 
    	
    	//procesos_mate.altaDocentes(new Docentes(602801,"Mate","",40,"Carlo Daniel","Estrada Dominguez","29/09/1985"));
    	//procesos_mate.listadoDocente();
    	int op;
    	long nomina;
    	String materia, parescolar;
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while(entrar) {
    		System.out.println("---------------Docentes--------------------");
    		System.out.println("1. Guardar materia");
    		System.out.println("2. Mostrar info");
    		System.out.println("3. Eliminar materia");
    		System.out.println("4. Modifica materia");
    		System.out.println("5. Salir");
    		op = sc.nextInt();
    	
    		/*
    		 * realiza las siguientes tareas:
    		 * 1. el opcion salir que te saque del sistema
    		 * 2. en caso 1 guardar materia, que ahi mismo le des la opción al usuario
    		 * si quiere agregar mas materias para el docentes. y le des la opcion si se quiere salir 
    		 * o seguir guardando más materias.
    		 * 3. investigar como eliminar elementos de un arreglo y hacer el caso 3
    		 * */
    		switch (op) {
				case 1: {
					System.out.println("Nomina");
					nomina = sc.nextLong();
					System.out.println("Materia: ");
					materia = sc.nextLine();
					System.out.println("Parescolar");
					parescolar = sc.nextLine();
					
					procesos_mate.guardarMateria( new Docentes(nomina,materia,parescolar));
					
				}
				
				case 2: {
					
				}
			default:
				throw new IllegalArgumentException("Unexpected value: " + op);
			}
    		
    	}
    	
    	
    }
}
