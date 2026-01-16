package problemasExemplo;

import java.util.Locale;
import java.util.Scanner;

import entitites.Product;

public class aula74_outroProblemaExemplo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.name = sc.nextLine(); //faz a leitura do nome e guarda dentro da variável product no campo name
		System.out.println("Price: ");
		product.price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		
		sc.close();

	}

}
