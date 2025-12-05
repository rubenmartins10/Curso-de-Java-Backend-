package exerciciosIfElse;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digita um número");	
		numero = sc.nextInt();
		
		if ( numero >= 0 ) {
			System.out.println("Número Não Negativo");
		}
		else {
			System.out.println("Número Negativo");
		}
		
		sc.close();

	}

}
