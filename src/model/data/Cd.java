package model.data;

import java.util.Objects;

import javax.swing.ImageIcon;

import model.interfaces.Article;

public class Cd implements Article{
	private int articleId;
	private String articleTitle;
	private double articlePrice;
	private String beschreibung;
	private String datum;
	private boolean special;
	private ImageIcon icon;
	
	public Cd(int cdId, String titel, double preis) {
		this.setArticleId(cdId);
		this.setArticleTitle(titel);
		this.setArticlePrice(preis);
		
	}
	
	public Cd(ImageIcon icon, int cdId, String titel, double preis) {
		this.setIcon(icon);
		this.setArticleId(cdId);
		this.setArticleTitle(titel);
		this.setArticlePrice(preis);
	}
	
	//ToString
	@Override
	public String toString() {
		return "Cd[cdId=" + articleId+ ", titel=" + articleTitle +  ", preis=" + articlePrice +"]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(articleId, articleTitle, articlePrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cd other = (Cd) obj;
		return articleId == other.articleId
				&& Double.doubleToLongBits(articlePrice) == Double.doubleToLongBits(other.articlePrice)
				&& Objects.equals(articleTitle, other.articleTitle);
	}

	//GETTER, SETTER
	public int getArticleId() {
		return articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public String getArticleTitle() {
		return articleTitle;
	}

	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}

	public double getArticlePrice() {
		return articlePrice;
	}

	public void setArticlePrice(double articlePrice) {
		this.articlePrice = articlePrice;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public boolean isSpecial() {
		return special;
	}

	public void setSpecial(boolean special) {
		this.special = special;
	}

	public ImageIcon getIcon() {
		return icon;
	}

	public void setIcon(ImageIcon icon) {
		this.icon = icon;
	}
	
	
}
