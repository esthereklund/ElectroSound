package model.data;

import java.util.HashSet;
import java.util.Set;

import model.interfaces.Article;

public class Sortiment {
	Set<Article> allArticles;

	public Sortiment() {
		this.setAllArticles(new HashSet<>());
	}
	
	//GETTER, SETTER
	public Set<Article> getAllArticles() {
		return allArticles;
	}

	public void setAllArticles(Set<Article> allArticles) {
		this.allArticles = allArticles;
	}
}
