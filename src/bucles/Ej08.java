package bucles;

import java.util.Scanner;

public class Ej08 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime un numero para calcular su tabla");
		int numero = teclado.nextInt();

		
		for(int i=0;i<10;i++) {
			
			System.out.println(numero+" x "+(i+1)+" = "+numero*(i+1));
		}
		
		
		
		System.out.println("************************");
		
		
		int i= 1;
		while(i<=10) {
			
			System.out.println(numero+" x "+i+" = "+numero*i);
			i++;
		}
		
		teclado.close();
		
	}
	
}
