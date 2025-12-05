package listaDeExercicios;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double peca1, num1, preco1, peca2, num2, preco2, total1, total2, total;
		
		peca1 = sc.nextDouble();
		num1 = sc.nextDouble();
		preco1 = sc.nextDouble();
		peca2 = sc.nextDouble();
		num2 = sc.nextDouble();
		preco2 = sc.nextDouble();
		
		total1 = peca1 * num1 * preco1;
		total2 = peca2 * num2 * preco2;
		
		total = total1 + total2;
		
		System.out.println("O valor total a pagar é " + total);
		
		
		
		sc.close();
	}

}
