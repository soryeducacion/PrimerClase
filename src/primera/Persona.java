package primera;

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
    	Docentes procesos_mate = new Docentes();
    	procesos_mate.guardarMateria( new Docentes(602800,"Lenguaje Java","Programación"));
    	procesos_mate.getMateria();    	
    	
    }
}
