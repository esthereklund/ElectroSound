package model.interfaces;

import javax.swing.ImageIcon;

public interface Article {
	int getArticleId();
	String getArticleTitle();
	double getArticlePrice();
	void setArticleId(int number);
	void setArticleTitle(String name);
	void setArticlePrice(double price);
	public void setIcon(ImageIcon icon);
	public ImageIcon getIcon();
}
