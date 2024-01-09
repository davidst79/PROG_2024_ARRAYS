package bucles;

import java.util.Scanner;

public class Ej05 {
	
	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		int total = 0;
		int max = -999999999;

		for(int i=0;i<5;i++) {
			
			System.out.println("dame un numero");
			int numero = teclado.nextInt();
			
			total+=numero;
			if(numero>max) {
				max=numero;
			}
		}
		
		System.out.println("el maximo ha sido el "+max);
		System.out.println("la media es de "+total/5);
		
		
		System.out.println("+++++++++++++++++");
		
		
		int i=0;
		total = 0;
		max = -999999999;
		while(i<5) {
			
			System.out.println("dame un numero");
			int numero = teclado.nextInt();
			
			total+=numero;
			if(numero>max) {
				max=numero;
			}			
			i++;
		}
		
		System.out.println("el maximo ha sido el "+max);
		System.out.println("la media es de "+total/5);
				
		
		
		
		
		
		
	}
}
