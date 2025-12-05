package listaDeExercicios;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double A, B, C, D;
		double diferenca;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		D = sc.nextDouble();

		diferenca = (A * B - C * D);
		System.out.printf("A diferença é igual a : %.2f", diferenca);
		
		sc.close();
	}

}
