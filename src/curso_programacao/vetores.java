package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class vetores {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n]; //criamos um vetor de tamanho n elementos
		
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble(); // o valor que escrevermos é guardado na posição vect[i]
		}
		
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma += vect[i];
		}
		
		double avg = soma/n;
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		
		
		sc.close();
		
	}

}
