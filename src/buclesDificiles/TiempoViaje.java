package buclesDificiles;

import java.util.Scanner;

public class TiempoViaje {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int tiempo = 0;
		
		// leer tramo
		System.out.println("Escribe un tiempo de tramo");
		int tramo = teclado.nextInt();
		
		while(tramo>0) {
			
			tiempo += tramo;
			
			System.out.println("por ahora llevas "+tiempo/60+"h "+tiempo%60+"'");

			// leer tramo
			System.out.println("Escribe un tiempo de tramo");
			tramo = teclado.nextInt();

		}
		
		
	}

}
