package bucles;

import java.util.Scanner;

public class Ej10 {
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Altura de la torre");
		int altura = teclado.nextInt();
		
		System.out.println("\n");
		for(int i=0;i<altura;i++) {
			
			System.out.println("*");
		}
	}
		
}
