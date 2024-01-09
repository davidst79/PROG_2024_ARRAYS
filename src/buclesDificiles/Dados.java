package buclesDificiles;

import java.util.Scanner;

public class Dados {

	public static void main(String[] args) {


		Scanner teclado = new Scanner(System.in);

		System.out.println("Numero en los dados");
		int sumaDados = teclado.nextInt();

		int contadorCombinaciones = 0;
		for(int dado1=1;dado1<=6;dado1++) {
			
			for(int dado2=1;dado2<=6;dado2++) {
				
				if(dado1+dado2==sumaDados) {
					
					System.out.println(dado1+" "+dado2);
					contadorCombinaciones++;
				}
			}
		}
		
		System.out.println("total "+contadorCombinaciones);
		
		
		
		
	}

}
