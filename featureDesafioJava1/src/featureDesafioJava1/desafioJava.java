package featureDesafioJava1;

import java.util.Scanner;

public class desafioJava {
	
	public static void main(String[] args) {
		
		/*
		 * Ingresar una fecha por teclado: dd/mm/yyyy (dd int, mm int, yyyy int)
			validar que dd >=1 && <=31 TENIENDO EN CUENTA EL MES
			validar que mes >=1 && <=12
			validar que año >=1900 && <= 2099

		 */

		System.out.println("Ingrese una fecha comenzando por el dia");
		Scanner teclado = new Scanner(System.in);
		int cont = 0; 
		while(cont <= 3) {
			cont++;
			int dd = teclado.nextInt();
			if(dd >=1 && dd <=31) {
				System.out.println("Ingrese el mes:");
				cont++;
			}else {
				System.out.println("El dia ingresado no es valido");
				break;
			}
			
			int mes = teclado.nextInt();
			if(mes >=1 && mes <=12) {
				System.out.println("Ingrese el año:");
				cont++;
			}else {
				System.out.println("El mes ingresado no es valido");
				break;
			}
			
			int anio = teclado.nextInt();
			if (anio >=1900 && anio <= 2099) {
				System.out.println("La fecha ingresada es correcta");
				if (((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0))){
					
					System.out.println("El año "+ anio + " es bisiesto" );
					cont++;
				}else {
					System.out.println("El año " + anio + " no es bisiesto");
					break;
				}
			}else {
				System.out.println("El año ingresado no es valido");
				break;
			} 
				
		}
		teclado.close();
		System.out.println("Gracias");
	}
	
	

}
