package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entitites.Productt;

public class vetoresParte2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Productt[] vect = new Productt[n];
		
		for (int i=0; i<n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Productt(name, price); //o new product aponta para a posição i do vetor
		}
		
		double soma = 0.0;
		for (int i=0; i<n; i++) {
			soma += vect[i].getPrice();
		}
		
		double avg = soma/n;
		
		System.out.printf("Average price = %.2f%n", avg);
		
		
		
		sc.close();
	}

}
