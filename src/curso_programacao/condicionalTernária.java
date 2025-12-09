package curso_programacao;

import java.util.Scanner;

public class condicionalTernária {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		/* podemos fazer assim : 
		double preco = 34.5;
		double desconto;
		if (preco < 20.0) {
			desconto = preco * 0.1;
		}
		else {
			desconto = preco * 0.05;
		}
		*/
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		System.out.println(desconto);
		
		sc.close();

	}

}

