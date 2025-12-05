package listaDeExercicios;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num1, num2;		
		
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		double resultado = (double) num1 + num2;

		
		System.out.println("A soma dos dois números é : " + resultado);
		sc.close();

	}

}
