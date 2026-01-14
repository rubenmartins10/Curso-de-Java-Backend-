package exerciciosEstruturaRepetitivaFor;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
			if (N == 0) {
			    System.out.println("Fatorial: 1");
			} 
			else {
			    int fact = 1;
			    for (int i = 1; i <= N; i++) {
			        fact = fact * i;
			    }
			    System.out.println("Fatorial: " + fact);
			}
		
		sc.close();

	}

}
