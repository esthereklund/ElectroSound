package model.data;

import java.util.*;

import model.interfaces.Article;

public class Basket {
	private List<BasketItem> basketItems;

	public Basket() {
		this.setBasketItems(new ArrayList<>());
	}
	
	public void addBasketItem(Article article, int number) {
		var basketItem = new BasketItem(article, number);
		System.out.println(basketItem +" added");
		this.getBasketItems().add(basketItem);
	}
	
	public List<BasketItem> getBasketItems() {
		return basketItems;
	}

	public void setBasketItems(List<BasketItem> basketItems) {
		this.basketItems = basketItems;
	}
	
}
