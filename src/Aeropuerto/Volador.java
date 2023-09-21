package Aeropuerto;

public abstract class Volador implements requerimientos{
	/*
	 * Atributos
	 */
	private static final int MIN_CAT = 3;
	private String tipoDeAeronave;
	private String nombre;
	private int categoria;
	private String fecha;
	
	
	/*
	 * Constructores
	 */
	public Volador() {
	}

	public Volador(String tipoDeAeronave, String nombre, int categoria, String fecha) {
		super();
		this.tipoDeAeronave = tipoDeAeronave;
		this.nombre = nombre;
		this.setCategoria(categoria);
		this.fecha = fecha;
	}
	/*
	 * Metodos
	 */
	
	@Override
	public String toString() {
		return "[tipoDeAeronave=" + tipoDeAeronave + ", nombre=" + nombre + ", categoria=" + categoria
				+ ", fecha=" + fecha + "]";
	}


	public int getCategoria() {
		return categoria;
	}


	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}


	public static int getMinCat() {
		return MIN_CAT;
	}
	
	
	
	
}
