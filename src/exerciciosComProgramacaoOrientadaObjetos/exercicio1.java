package exerciciosComProgramacaoOrientadaObjetos;

import java.util.Locale;
import java.util.Scanner;

import entitites.Retangle;

public class exercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangle retangle = new Retangle();
		System.out.println("Enter retangle width and height: ");
		retangle.width = sc.nextDouble();
		retangle.height = sc.nextDouble();
		
		System.out.println();
		System.out.println("AREA: " + retangle.area());
		
		System.out.println();
		System.out.println("PERIMETER: " + retangle.perimeter());
		
		System.out.println();
		System.out.println("DIAGONAL: " + retangle.diagonal());
		
		
		sc.close();
		
		

	}

}
