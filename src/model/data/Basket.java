package model.data;

import java.util.*;

import model.interfaces.Article;

public class Basket {
	private List<BasketItem> basketItems;
	private double total;
	private double totalMwSt;
	
	//Konstruktor
	public Basket() {
		this.setBasketItems(new ArrayList<>());
		double t = 0;
		double m = 0;
		for(int i = 0; i < this.getBasketItems().size(); i++) {
			t += this.getBasketItems().get(i).getTotal();
			m += this.getBasketItems().get(i).getTotalMwst();
		}
		this.setTotal(t);
		this.setTotalMwSt(m);
	}
	
	//BasketItem hinzufügen
	public void addBasketItem(Article article, int number) {
//		var basketItem = new BasketItem(article, number);
//		System.out.println(basketItem +" added");
		this.getBasketItems().add(new BasketItem(article, number));
		System.out.println("BasketItem hinzugefügt - Basket"); 
	}
	
	
	//GETTER, SETTER
	public List<BasketItem> getBasketItems() {
		return basketItems;
	}

	public void setBasketItems(List<BasketItem> basketItems) {
		this.basketItems = basketItems;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getTotalMwSt() {
		return totalMwSt;
	}

	public void setTotalMwSt(double totalMwSt) {
		this.totalMwSt = totalMwSt;
	}
	
}
