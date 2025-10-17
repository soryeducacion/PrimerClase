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
	
	 @Override
    public String getAtributos(){
        return super.getAtributos() 
                + "\n Materia " + this.materia 
                + "\n Parescolar " + this.parescolar
                + "\n Nomina " + this.nomina;
    }
	
	public void altasDocentes(Persona persona) {
		
	}
	
	
	public void guardarMateria(Docentes materias) {
		//System.out.println(lista_materias.equals(materias.nomina));
		
		boolean mate = buscar_materia(materias.nomina,materias.materia);
		
		if(mate) {
			System.out.println("La materia ya esta registrada");
		}else {
			lista_materias.add(materias);
		}
		
	}
	
	public boolean buscar_materia(long nomina, String materia) {
		boolean buscar_nom = false;
		for(Docentes lista : lista_materias) {
			if(lista.nomina== nomina && lista.getMateria() == materia) {
				buscar_nom = true;
				break;
			}
			
		}
		return buscar_nom;
	}
	
    public void getMaterias() {
    	 System.out.println("Listado de Materias");
    	for (Docentes lista : lista_materias){
    		System.out.println(lista.getAtributos());
    	}
    }
    
    public void altaDocentes(Persona docente) {
    	docentes.add(docente);
    }
    

    public void listadoDocente() {
    	 System.out.println("Listado de Docentes");
    	for (Persona lista : docentes){
    		System.out.println(lista.getAtributos());
    	}
    }
	
}
