package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas? ");
		int num = sc.nextInt();
		
		double somaAlturas = 0.0;
		int contagemMenores = 0;
		
		double[] vect = new double[num];
		
		for ( int i = 0; i < num; i++) {
			System.out.println("Dados da " + (i + 1) + " pessoa: ");
			System.out.println("Nome: ");
			String nome = sc.next();
			
			System.out.println("Idade: ");
			int idade = sc.nextInt();
			
			System.out.println("Altura: ");
			double altura = sc.nextDouble();
			
			somaAlturas += altura;
			
			if (idade < 16) {
				contagemMenores++;
			}
		}
		
		
		double alturaMedia = somaAlturas / num;
		System.out.printf("Altura média: %.2f%n", alturaMedia);
		
		double percentualMenores = ((double)contagemMenores / num) * 100;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%n", percentualMenores);
		
		
	}

}
