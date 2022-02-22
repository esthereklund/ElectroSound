package model.data;

import model.interfaces.Article;

public class BasketItem {
	private Article article;
	private int number;
	
	public BasketItem(Article article, int number) {
		this.setArticle(article);
		this.setNumber(number);
	}
	
	


	//GETTER, SETTER
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	
}
