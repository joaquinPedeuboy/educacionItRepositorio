package principal;

import java.util.Scanner;

import escuela.alumno;

public class principalMain {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese cantidad de alumnos");
		int cantAlumnos = scanner.nextInt();
		alumno[] alumnos = new alumno[cantAlumnos];
		int contadorAlumnos = 0;
		int opcion;
		do {
			System.out.println("1: Registrar Alumno");
			System.out.println("2: Mostrar notas mas altas");
			System.out.println("3: Mostrar notas mas bajas");
			System.out.println("4: Mostrar alumnos que promocionan");
			System.out.println("5: Mostrar alumnos que recursan");
			System.out.println("6: Salir");
			System.out.println("Ingresar opcion");
			opcion = scanner.nextInt();
			
			switch(opcion) {
			case 1:{
				if(contadorAlumnos<alumnos.length) {
					System.out.println("Ingrese Nombre");
					String nombre = scanner.next();
					System.out.println("Apellido del alumno");
					String apellido = scanner.next();
					System.out.println("Numero de examen");
					int numExamen = scanner.nextInt();
					System.out.println("Ingrese Nota");
					int nota = scanner.nextInt();
					if(nota<0 || nota >10) {
						System.out.println("La nota debe estar entre 0 y 10");
						break;
					}
					alumnos[contadorAlumnos] = new alumno(nombre, apellido, nota, numExamen);
					contadorAlumnos++;
					}else {
					System.out.println("No se puede ingresar mas alumnos");
					}
					break;
				}
			case 2:{
				for(alumno a:alumnos) {
					if(a!=null && a.nota>=8) {
						System.out.println("Las notas mas altas son: ");
						System.out.println(a.toString());
					}
				}break;
				}
			
			case 3:{
				for(alumno a:alumnos) {
					if(a!=null && a.nota<7) {
						System.out.println("Las notas mas bajan son: ");
						System.out.println(a.toString());
					}
				}break;
				
				}
			case 4:{
				System.out.println("Los alumnos que promocionan son: ");
				for(alumno a:alumnos) {
					if(a!=null && a.nota>=7) {
						System.out.println(a.toString());
					}
				}break;
			}
			case 5:{
				for(alumno a:alumnos) {
					if(a!=null && a.nota<7) {
						String recursa = "Recursa";
						System.out.println(a.toString()+ recursa);
					}
				}break;
			}
			}
		}while(opcion!=6);
		
		scanner.close();
	}	
}

