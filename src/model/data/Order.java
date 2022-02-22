package model.data;

public class Order {
	private Client client;
	private Basket basket;
	private double totalAmount;
	private double totalMwSt;
	
	public Order(Client client, Basket basket) {
		this.setBasket(basket);
		this.setClient(client);
		double total = 0;
		double totalMwst = 0;
		for(int i = 0; i<this.getBasket().getBasketItems().size(); i++) {
			total += this.getBasket().getBasketItems().get(i).getTotal();
			totalMwst += this.getBasket().getBasketItems().get(i).getTotalMwst();
		} 
		this.setTotalAmount(total);
		this.setTotalMwSt(totalMwst);
	}
	
	
	@Override
	public String toString() {
		return "Order [client=" + client + ", basket=" + basket + ", totalAmount=" + totalAmount + ", totalMwSt="
				+ totalMwSt + "]";
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

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public double getTotalMwSt() {
		return totalMwSt;
	}

	public void setTotalMwSt(double totalMwSt) {
		this.totalMwSt = totalMwSt;
	}
	
}
