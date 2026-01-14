package exerciciosEstruturaRepetitivaFor;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double N = sc.nextDouble();
		
		for ( int i=0; i<N; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			
			if ( a == 0 || b == 0) {
				System.out.println("Divisão impossível");
			}
			else {
				double divisao = a / b; 
				System.out.printf("%.2f", divisao);
			}
		}
		
		sc.close();
	}

}
