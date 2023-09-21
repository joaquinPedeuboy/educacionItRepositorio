package Aeropuerto;

public class Helicopteros extends Volador implements requerimientos{
	/*
	 * Atributos
	 */

	public Helicopteros(String tipoDeAeronave, String nombre, int categoria, String fecha) {
		super(tipoDeAeronave, nombre, categoria, fecha);
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * Metodos
	 */
	@Override
	public boolean aprobado() {
		return contratoCkeck();
	}

	@Override
	public boolean contratoCkeck() {
		return getCategoria() >= getMinCat();
		
	}

}
