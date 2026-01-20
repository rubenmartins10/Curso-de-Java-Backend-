package entitites;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	//colocamos sempre o construtor depois dos atributos e antes dos métodos
	public Product (String name, double price, int quantity) {
		//este construtor obrigada a fornecer o nome, o preço e a quantidade
		this.name = name; //uma forma de diferenciar o atributo do objeto do parametro do objeto
		this.price = price;
		this.quantity = quantity;
	}
	
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity; //significa uma autorefência para o objeto, neste caso ele quer chamar o atributo da classe e não o parâmetro da função
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity; //igual mas para remover produtos
	}
	
	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
		
	}

}
