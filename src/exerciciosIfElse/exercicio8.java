package exerciciosIfElse;

import java.util.Locale;
import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double salario, salarioDescontado;
		System.out.println("Digite o valor do salario");
		salario = sc.nextDouble();
		
		if ( salario <= 2000 ) {
			System.out.println("Isento de imposto");
		}
		else if ( salario > 2000 && salario <= 3000 ) {
			salarioDescontado = (salario - 2000) * 0.18 + 1000 * 0.08;
			System.out.printf("Desconto : %.2f €", salarioDescontado);
		}
		else if ( salario > 3000 && salario <= 4500 ) {
			salarioDescontado = (salario - 3000) * 0.18 + 1000.0 * 0.08;
			System.out.printf("Desconto : %.2f €", salarioDescontado);
		}
		else if ( salario > 4500 ) {
			salarioDescontado = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
			System.out.printf("Desconto : %.2f €", salarioDescontado);
		}
		
		sc.close();
		
	}

}
