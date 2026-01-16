package curso_programacao;

	import java.util.Locale;
	import java.util.Scanner;

	import entitites.Product;

	public class object_e_toString {
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
			
			//System.out.println(product.toString()); //com a função toString no Product.java, podemos colocar assim ou sem o ".toString"
			
			System.out.println();
			System.out.println("Product data: " + product);
			
			System.out.println();
			System.out.println("Enter the number of products to be added in stock: ");
			int quantity = sc.nextInt();
			product.addProducts(quantity);//atualização da quantidade dentro do objeto product
			
			System.out.println();
			System.out.println("Updated data: " + product);
			
			System.out.println();
			System.out.println("Enter the number of products to be removed from stock: ");
			quantity = sc.nextInt();
			product.removeProducts(quantity);
			
			System.out.println();
			System.out.println("Updated data: " + product);
			
			
			
			sc.close();

		}

	}


