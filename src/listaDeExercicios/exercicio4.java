package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int numero;
		double horas, salario, porHora;
		numero = sc.nextInt();
		horas = sc.nextDouble();
		porHora = sc.nextDouble();
		
		salario = horas * porHora;
		
		System.out.printf("O número do funcionário é %d, e recebe %.4f $ de salario ", numero, salario);
		
		sc.close();
		
		
	}

}
