package model.data;

public class Order {
	private Client client;
	private Basket basket;
	
	public Order(Client client, Basket basket) {
		this.setBasket(basket);
		this.setClient(client);
	}
	
	//GETTER, SETTER
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Basket getBasket() {
		return basket;
	}
	public void setBasket(Basket basket) {
		this.basket = basket;
	}
	
}
