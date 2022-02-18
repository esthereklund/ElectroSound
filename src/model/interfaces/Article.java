package model.interfaces;

public interface Article {
	int getArticleId();
	String getArticleTitle();
	double getArticlePrice();
	void setArticleId(int number);
	void setArticleTitle(String name);
	void setArticlePrice(double price);
}
