package exerciciosIfElse;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		double codigo;
		double quantidade;
		double total;
		
		System.out.printf("Digite um código e a quantidade");
		codigo = sc.nextInt();
		quantidade = sc.nextDouble();
		
		
		
		if ( codigo == 1) {
			total = quantidade * 4.00;
			System.out.printf("O total é : %.2f €", total);
		}
		else if ( codigo == 2 ) {
			total = quantidade * 4.50;
			System.out.printf("O total é : %.2f €", total);
		}
		else if ( codigo == 3 ) {
			total = quantidade * 5.00;
			System.out.printf("O total é : %.2f €", total);
		}
		else if ( codigo == 4 ) {
			total = quantidade * 2.00;
			System.out.printf("O total é : %.2f €", total);
		}
		else if ( codigo == 5 ) {
			total = quantidade * 1.50;
			System.out.printf("O total é : %.2f €", total);
		}
		
		sc.close();
	}

}
