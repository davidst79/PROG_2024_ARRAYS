package bucles;

public class Ej02 {

	public static void main(String[] args) {
		
		for(int i=1;i<=20;i++) {
			
			if(i%2==0) {
				System.out.println(i+", que es par");
			}
			else System.out.println(i);			
		}
		
		System.out.println("***********");
		
		
		int contador = 1;
		while(contador<=20) {
			
			if(contador%2==0) {
				System.out.println("El número "+contador+" es par");
			}
			else System.out.println(contador);
			
			contador++;
		}
		
		
		
	}
}
