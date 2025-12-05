package listaDeExercicios;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double raio, area;
		
		raio = sc.nextDouble();
		raio = Math.pow(raio, 2.0);
		area = (3.14159 * raio);
		System.out.printf("A área do círculo tem o valor de %.4f ", area);
		
		sc.close();
	

	}

}
