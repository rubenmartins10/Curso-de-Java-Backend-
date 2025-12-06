package exerciciosIfElse;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int num;
		
		System.out.println("Digite um número ");
		num = sc.nextInt();
		
		if ( num <= 25 ) {
			System.out.println("Número dentro do intervalo [0,25]");
		}
		else if ( num > 25 && num <= 50 ) {
			System.out.println("Número dentro do intervalo [25,50]");
		}
		else if ( num > 75 && num <= 100 ) {
			System.out.println("Número dentro do intervalo [75,100]");
		}
		else {
			System.out.println("O número está fora de algum intervalo");
		}
		
		sc.close();
	}

}
