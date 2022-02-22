package model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

import model.crud.SQLiteConnection;
import model.data.Basket;
import model.data.Cd;
import model.data.Client;
import model.data.Order;
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
		this.setSortment(new Sortiment());
		this.loadArticlesFromDB();
	}
	
	// Laden der Daten aus der Datenbank
	public void loadArticlesFromDB() {
		try {
			ResultSet res = this.getDbConnection().getDataFromDatabase();
			while(res.next()) {
				this.getSortment().getAllArticles()
				.add(new Cd(res.getInt(1), res.getString(2), res.getDouble(3)));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Article> getSortmentAsList(){
		System.out.println("get Sortment as List");
		return new ArrayList<>(this.getSortment().getAllArticles());
	}
	
	
	// Artikel zum Warenkorb hinzufügen
	public void addItemToBasket(String articleName, int number) {
		System.out.println(" "+ number + " " + articleName + " added");
		Set<Article> range = this.getSortment().getAllArticles();
		//System.out.println(range.stream().filter(a -> a.getArticleTitle().equals(articleName)).findFirst());;
		 
		Optional<Article> opt = range.stream().filter(a -> a.getArticleTitle().equals(articleName)).findFirst();
		if(opt.isPresent()) {
			Article article = opt.get();
			this.getBasket().addBasketItem(article, number);
		}
	}
	
	//Bestellung bestätigen
	public void confirmOrder(Map<String, String> data) {
		data.forEach((k,v)->{
			System.out.println("Key: "+k + "Value: " +v);
		});
		Order order = new Order(new Client(data.get("email"), data.get("surname"), data.get("name"), 
				data.get("street"), data.get("house"), data.get("pobox"), data.get("city")), this.getBasket());
		System.out.println(order);
	}
	
	
	//GETTER, SETTER
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
