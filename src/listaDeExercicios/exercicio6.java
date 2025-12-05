package listaDeExercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double A, B, C;
		double triangulo, circulo, trapezio, quadrado, retangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		//triangulo
		triangulo = A * C / 2;
		System.out.println("A área do triangulo é : " + triangulo);
		
		//circulo
		circulo = ((3.14159) * Math.pow(C, 2.00));
		System.out.println("A área do circulo é : " + circulo);
		
		//trapezio 
		trapezio = ((A + B) / 2) * C;
		System.out.println("A área do trapézio é : " + trapezio);
		
		//quadrado
		quadrado = B * B; 
		System.out.println("A área do quadrado é : " + quadrado);
		
		//retangulo
		retangulo = A * B;
		System.out.println("A área do retangulo é : " + retangulo);
		
		
		sc.close();
		
	}

}
