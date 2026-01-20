package entitites;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	//colocamos sempre o construtor depois dos atributos e antes dos métodos
	public Product (String name, double price, int quantity) {
		//este construtor obrigada a fornecer o nome, o preço e a quantidade
		this.name = name; //uma forma de diferenciar o atributo do objeto do parametro do objeto
		this.price = price;
		this.quantity = quantity;
		
	}
			//PROPOSTA DE MELHORIA, ONDE VAMOS CRIAR UM CONSTRUTOR OPCIONAL,
			//O QUAL RECEBE APENAS O NOME E O PREÇO, A QUANTIDADE EM STOCK É INICIADA A 0
	
	public Product (String name, double price) {
		//este construtor obrigada a fornecer o nome, o preço e a quantidade
		this.name = name; //uma forma de diferenciar o atributo do objeto do parametro do objeto
		this.price = price;
		quantity = 0; //a linguagem java por padrão inicializa números de objetos e arrays em 0
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setName(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
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
