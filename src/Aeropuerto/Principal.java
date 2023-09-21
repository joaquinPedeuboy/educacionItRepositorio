package Aeropuerto;


public class Principal {
	public static void main(String[] args) {
		/*
		 * Inicializamos una torre de control
		 * 
		 */
		TorreDeControl torre1 = new TorreDeControl();
		
		/*
		 * Inicializamos los voladores
		 */
		Avion avion1 = new Avion("Avion Comercial","Fligh505",5,"5/06/2023");
		Helicopteros h1 = new Helicopteros("Helicoptero de Combate", "HCA 100",2,"05/09/2023");
		Avion avion2 = new Avion("Comercial","Tango05", 2, "09/1/2022");
		Helicopteros h2 = new Helicopteros("Helicoptero periodistico", "ALFA 10", 1, "15/08/2023");
		Avion avion3 = new Avion("Avion privado", "Messi 10", 2, "9/09/2023");
		
		/*
		 * Agregamos los voladores a la lista de la torre de control
		 */
		torre1.agregarVolador(avion1);
		torre1.agregarVolador(h1);
		torre1.agregarVolador(avion2);
		torre1.agregarVolador(h2);
		torre1.agregarVolador(avion3);
	
		/*
		 * Verificamos cuales pueden aterrizar o no
		 */
		torre1.autorizarAterrizaje();
		
		
		
	}
}
