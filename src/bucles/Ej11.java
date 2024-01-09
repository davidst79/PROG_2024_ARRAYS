package bucles;

import java.util.Scanner;

public class Ej11 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Altura de la torre");
		int altura = teclado.nextInt();
		
		System.out.println("\n");
		for(int fila=1;fila<=altura;fila++) {

			for(int asteriscos=0;asteriscos<fila;asteriscos++) {	
			
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
}
