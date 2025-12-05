package curso_programacao;

import java.util.Locale;


public class Main {

	public static void main(String[] args) {
		int y = 32;
		System.out.println(y);
		
		double x = 10.35784;
		System.out.println(x); 
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.println("Resultado = " + x + " metros");
		System.out.printf("Resultado = %2f metros%n" , x);
		
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("A %s tem %d anos e ganha %.2f de renda por mes" , nome, idade, renda);
		
		
		
	}

}
