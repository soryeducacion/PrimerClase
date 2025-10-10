package docentes;

import java.util.ArrayList;

import primera.Persona;

public class Docentes extends Persona {
	private long nomina;
	protected String materia;
	protected String parescolar;
	
	ArrayList<Docentes> lista_materias = new ArrayList<>();
	ArrayList<Persona> docentes = new ArrayList<>();
	
	public Docentes (long nomina, String materia, String parescolar){
		this.nomina = nomina;
		this.materia = materia;
		this.parescolar = parescolar;
	}
	
	public Docentes (long nomina, String materia, String parescolar,int edad, String nombre, String apellido, String fecha_nacimiento){
		super(edad,nombre,apellido,fecha_nacimiento);
		this.nomina = nomina;
		this.materia = materia;
		this.parescolar = parescolar;		
	}
	
	public Docentes() {}

	public long getNomina() {
		return nomina;
	}

	public void setNomina(long nomina) {
		this.nomina = nomina;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getParescolar() {
		return parescolar;
	}

	public void setParescolar(String parescolar) {
		this.parescolar = parescolar;
	}
	
	public String datosDocente() {
		return "Materia: " + getMateria() + " Parescolar: " + getParescolar();
	}
	
	public void altasDocentes(Persona persona) {
		
	}
	
	public void guardarMateria(Docentes materias) {
		lista_materias.add(materias);
	}
	
    public void getMaterias() {
    	 System.out.println("Listado de Materias");
    	for (Docentes lista : lista_materias){
    		System.out.println(lista.datosDocente());
    	}
    }
    
    public void altaDocentes(Persona docente) {
    	docentes.add(docente);
    }
    

    public void listadoDocente() {
    	 System.out.println("Listado de Docentes");
    	for (Persona lista : docentes){
    		System.out.println("Docente: " +lista.getApellido());
    	}
    }
	
}
