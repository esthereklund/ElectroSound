package model.data;

import model.interfaces.Article;

public class BasketItem {
	private Article article;
	private int number;
	private double total;
	private double totalMwst; 
	
	public BasketItem(Article article, int number) {
		this.setArticle(article);
		this.setNumber(number);
		this.setTotal(article.getArticlePrice()*number);
		this.setTotalMwst(this.getTotal()*19/119);
	}
	
	
	@Override
	public String toString() {
		return "BasketItem [article=" + article + ", number=" + number + ", total=" + total + ", totalMwst=" + totalMwst
				+ "]";
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

	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getTotalMwst() {
		return totalMwst;
	}

	public void setTotalMwst(double totalMwst) {
		this.totalMwst = totalMwst;
	}
	
}
