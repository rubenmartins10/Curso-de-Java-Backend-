package exerciciosIfElse;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		
		System.out.println("Digite o número A");
		A = sc.nextInt();
		
		System.out.println("Digite o número B");
		B = sc.nextInt();
		
		if ( A % B == 0) {
			System.out.println("Os números são múltiplos");
		}
		else {
			System.out.println("Os números não são múltiplos");
		}
		
		sc.close();
	}

}
