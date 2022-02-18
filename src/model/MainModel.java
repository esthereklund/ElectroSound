package model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

import model.crud.SQLiteConnection;
import model.data.Basket;
import model.data.Cd;
import model.data.Sortiment;
import model.interfaces.Article;
import model.interfaces.DBConnection;

public class MainModel {
	private DBConnection dbConnection;
	private List<Article> cdList;
	private Sortiment sortment;
	private Basket basket;
	
	public MainModel() {
		this.setDbConnection(new SQLiteConnection());
		this.setCdList(new ArrayList<>());
		this.setBasket(new Basket());
	}
	
	public List<Article> loadArticlesFromDB() {
		this.getCdList().clear();
		try {
			ResultSet res = this.getDbConnection().getDataFromDatabase();
			while(res.next()) {
				this.getCdList().add(new Cd(res.getInt(1), res.getString(2), res.getDouble(3)));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return this.getCdList();
	}
	
	public List<Article> getSortmentAsList(){
		return new ArrayList<>(this.getSortment().getAllArticles());
	}
	
	public void addItemToBasket(String articleName, int number) {
		System.out.println(" "+ number + " " + articleName + " added");
		Set<Article> range = this.getSortment().getAllArticles();
		
		
//		System.out.println(range.stream().filter(a -> a.getArticleTitle().equals(articleName)).findFirst());;
		 
		Optional<Article> opt = range.stream().filter(a -> a.getArticleTitle().equals(articleName)).findFirst();
		if(opt.isEmpty()) {
			Article article = opt.get();
			this.getBasket().addBasketItem(article, number);
		}
	}
	
	public DBConnection getDbConnection() {
		return dbConnection;
	}

	public void setDbConnection(DBConnection dbConnection) {
		this.dbConnection = dbConnection;
	}

	public List<Article> getCdList() {
		return cdList;
	}

	public void setCdList(List<Article> cdList) {
		this.cdList = cdList;
	}

	public Sortiment getSortment() {
		return sortment;
	}

	public void setSortment(Sortiment sortment) {
		this.sortment = sortment;
	}

	public Basket getBasket() {
		return basket;
	}

	public void setBasket(Basket basket) {
		this.basket = basket;
	}
	
	


	
	
	
}
