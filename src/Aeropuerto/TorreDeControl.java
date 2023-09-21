package Aeropuerto;

import java.util.ArrayList;
import java.util.Scanner;

public class TorreDeControl {
	/*
	 * Creacion de la lista de voladores
	 */

	private ArrayList<Volador> voladores;
	
	
	public TorreDeControl() {
		this.voladores = new ArrayList<>();
	}

	public void agregarVolador(Volador v) {
		this.voladores.add(v);
	}
	
	/*
	 * Metodo para autorizar si el volador puede o no aterrizar en el aeropuerto
	 * Dependera de la categoria del volador para saber si puede aterrizar
	 * 
	 * Si su categoria es mayor o igual que 3 podra aterrizar sin problemas pero si su categoria es
	 * mayor que uno dependera del operario decidir si puede o no aterrizar en pista 2
	 * si su categoria es menor o igual que 1 directamente no podra aterrizar en el aeropuerto
	 * 
	 */
	public void autorizarAterrizaje() {
		for(Volador v1:voladores) {
			if(v1.aprobado()) {
				System.out.println("El volador "+v1.toString()+ " esta aprobado para aterrizar en pista 1");
				System.out.println("--------------");
			}else {
				System.out.println("NO ESTA APROBADO "+v1.toString()+" para aterrizar");
				
				if(v1.getCategoria()>1) {
					Scanner scanner = new Scanner(System.in);
					boolean isAccepted = false;
					String permiso;
					do {
						System.out.println("La categoria del volador es mayor que 1 por lo tanto el operario debe decidir si puede o no aterrizar en pista 2");
						System.out.println();
						System.out.print("Autoriza al volador a aterrizar? S/N: ");
						permiso = scanner.next();
						permiso.toUpperCase();
						if(permiso.equalsIgnoreCase("S")) {
							isAccepted=true;
							System.out.println("El volador fue aceptado para aterrizar en pista 2");
							System.out.println("-----------");
						}else {
							System.out.println("El volador no fue aceptado para aterrizar en este aeropuerto");
							System.out.println("-----------");
							break;
						}
					}while(isAccepted!=true);
				}else {
					System.out.println("La categoria del volador es menor o igual que 1 no puede aterrizar en este aeropuerto");
					System.out.println("-------------");
					
				}
				
			}
		}
	}
	
}
