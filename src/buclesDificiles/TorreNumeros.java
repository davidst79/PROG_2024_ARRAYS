package buclesDificiles;

import java.util.Scanner;

public class TorreNumeros {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Altura de la torre");
		int altura = teclado.nextInt();

		System.out.println("\n");

		for (int fila = 1; fila <= altura; fila++) {

			for (int i = 0; i < altura - fila; i++) {
				System.out.print("x");
			}

			for (int i = 0; i < fila * 2 - 1; i++) {
				System.out.print(fila);
			}

			for (int i = 0; i < altura - fila; i++) {
				System.out.print("x");
			}

			System.out.println();
		}

	}
}
