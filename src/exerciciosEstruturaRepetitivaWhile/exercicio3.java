package exerciciosEstruturaRepetitivaWhile;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int x;
		x = sc.nextInt();
		
		while ( x < 4 ) {
			if ( x == 1 ) {
				System.out.println("Alcool : 1");
			}
			else if ( x == 2 ) {
				System.out.println("Gasolina : 2");
			}
			else if ( x == 3 ) {
				System.out.println("Diesel : 3");
			}
			
			x = sc.nextInt();
		}
		
		System.out.println("Muito Obrigado");
		
		sc.close();
		
	}

}
