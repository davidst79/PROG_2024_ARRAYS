package bucles;

import java.util.Scanner;

public class Ej12 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Altura de la torre");
		int altura = teclado.nextInt();
		
		System.out.println("\n");
		
		for(int fila=1;fila<=altura;fila++) {
	
			for(int numero=1;numero<=fila;numero++) {	
			
				System.out.print(fila);
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}
