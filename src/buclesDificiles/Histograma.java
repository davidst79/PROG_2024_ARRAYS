package buclesDificiles;

import java.util.Scanner;

public class Histograma {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		int positivos = 0;
		int negativos = 0;
		
		// leer numero
		System.out.println("Escribe un número");
		int numero = teclado.nextInt();
		
		while(numero!=0) {
			
			if(numero>0) {
				positivos++;
			}
			else negativos++;
			
			// leer numero
			System.out.println("Escribe otro número");
			numero = teclado.nextInt();
		}
		
		System.out.println("Positivos:");
		for(int i=0;i<positivos;i++) {
			System.out.print("*");
		}
		
		System.out.println();
		
		System.out.println("Negativos:");
		for(int i=0;i<negativos;i++) {
			System.out.print("*");
		}
		
		
		
		

	}

}
