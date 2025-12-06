package exerciciosIfElse;

import java.util.Locale;
import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double eixoX, eixoY;
		
		System.out.println("Digite os valores dos eixos ");
		eixoX = sc.nextDouble();
		eixoY = sc.nextDouble();
		
		if ( eixoX == 0 && eixoY == 0) {
			System.out.println("Origem");
		}
		else if ( eixoX > 0 && eixoY > 0) {
			System.out.println("Q1");
		}
		else if ( eixoX < 0 && eixoY > 0) {
			System.out.println("Q2");
		}
		else if ( eixoX < 0 && eixoY < 0 ) {
			System.out.println("Q3");
		}
		else if ( eixoX > 0 && eixoY < 0 ) {
			System.out.println("Q4");
		}
		else if ( eixoX >= 0 && eixoY == 0 ) {
			System.out.println("Está no eixo X");
		}
		else if ( eixoX == 0 && eixoY > 0 ) {
			System.out.println("Está no eixo Y");
		}
		
		sc.close();
	}

}
