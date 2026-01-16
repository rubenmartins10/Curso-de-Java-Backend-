package entitites;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity; //significa uma autorefência para o objeto, neste caso ele quer chamar o atributo da classe e não o parâmetro da função
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity; //igual mas para remover produtos
	}

}
