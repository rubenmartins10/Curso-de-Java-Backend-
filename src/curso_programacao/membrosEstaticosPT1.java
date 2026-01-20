package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entitites.Calculator;

public class membrosEstaticosPT1 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
						
		double c = Calculator.circumference(radius);
		
		double v = Calculator.volume(radius); //na parte 2 da aula de membros estáticos, definimos as funções na classe como static
											// e assim só nos precisamos de chamar pelo nome da classe para chamar pela função
		
		System.out.printf("Circumference %.2f%n ", c);
		System.out.printf("Volume: %.2f%n ", v);
		System.out.printf("PI value: %.2f%n ", Calculator.PI);
		
		
		
		sc.close();

	}

}
