package buclesDificiles;

import java.util.Scanner;

public class Collatz2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Numero de Collatz");
		int topeCollatz = teclado.nextInt();

		
		for(int i=1;i<=topeCollatz;i++) {
			
			int numero = i;
			System.out.print(numero+" *");
			while(numero!=1) {
				
				if(numero%2==0) {
					numero/=2;
				}
				else numero = numero*3+1;
	
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
}
