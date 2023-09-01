package escuela;

public class alumno {
	public String nombre;
	public String apellido;
	public int nota;
	public int numExamen;
	public alumno alumnos;
	public alumno() {
		// TODO Auto-generated constructor stub
	}

	

	public alumno(String nombre, String apellido, int nota, int numExamen) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nota = nota;
		this.numExamen = numExamen;
		
	}



	@Override
	public String toString() {
		return "alumno [nombre=" + nombre + ", apellido=" + apellido + ", nota=" + nota + ", numExamen=" + numExamen
				+ "]";
	}
	
	
	
}
