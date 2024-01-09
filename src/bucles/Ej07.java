package bucles;

import java.util.Scanner;

public class Ej07 {

	public static void main(String[] args) {


		Scanner teclado = new Scanner(System.in);
		
		System.out.println("dame la base de una potencia");
		int base = teclado.nextInt();
		
		System.out.println("dame el exponente de una potencia");
		int exponente = teclado.nextInt();
		
		

		int potencia = 1;
		for(int i=0;i<exponente;i++) {
			
			potencia = potencia * base;
		}
		
		System.out.println("la potencia vale = "+potencia);

		
		System.out.println("+++++++++++++++++");
		
		int i = 0;
		potencia = 1;
		while(i<exponente) {
			
			potencia = potencia * base;
			i++;
		}
		
		System.out.println("la potencia vale = "+potencia);		
		
	}

}
