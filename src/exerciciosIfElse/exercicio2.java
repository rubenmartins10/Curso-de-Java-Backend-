package exerciciosIfElse;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número ");
		num = sc.nextInt();
		
		if ( num % 2 == 0 ){
			System.out.println("O número é par");
		}
		else {
			System.out.println("O número é ímpar");
		}
		
		sc.close();
		
	}

}
