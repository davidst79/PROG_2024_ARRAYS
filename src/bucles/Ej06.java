package bucles;

public class Ej06 {

	public static void main(String[] args) {


		for(int i=1;i<=21;i++) {
			
			if(i%3==0 && i%7==0) {
				System.out.println(i+ " es multiplo de 3 y 7");
			}
			else if(i%3==0) {
				System.out.println(i+ " es multiplo de 3");
			}
			else if(i%7==0) {
				System.out.println(i+ " es multiplo de 7");
			}
			else System.out.println(i);
		}
		
		System.out.println("++++++++++++++++++");
		
		int i = 1;
		while(i<=15) {
			
			if(i%3==0 && i%7==0) {
				System.out.println(i+ " es multiplo de 3 y 7");
			}
			else if(i%3==0) {
				System.out.println(i+ " es multiplo de 3");
			}
			else if(i%7==0) {
				System.out.println(i+ " es multiplo de 7");
			}
			else System.out.println(i);			
			
			i++;
		}

	}

}
