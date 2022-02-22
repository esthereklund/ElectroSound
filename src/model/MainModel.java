package model;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.Base64;
import javax.swing.ImageIcon;


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
		
		//this.loadArticlesFromDB();
		this.loadArticlesWithPics();
		System.out.println(this.getSortment().getAllArticles());
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
	
	// LAden Artikeln mit Bildern
	public void loadArticlesWithPics() {
		try {
			ResultSet res = this.getDbConnection().getArticlesWithPics();
			System.out.println(res);
			while(res.next()) {
				this.getSortment().getAllArticles()
				.add(new Cd(this.decodePic(res.getString("bild")), res.getInt(1), res.getString(2), res.getDouble(3)));
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
	
	// Bilder
	
	public String encodePic(String imageName) {
		try {
			byte[] original = Files.readAllBytes(Paths.get(this.getClass().getResource("/images/"+imageName).toURI()));
			byte[] encoded = Base64.getEncoder().encode(original);
			String encodedString = new String(encoded);
			return encodedString;
			
		}catch(Exception e2){
			e2.printStackTrace();
		}
		return null;
	}
	
	public ImageIcon decodePic(String encodedPic) {
		byte[] decoded = Base64.getDecoder().decode(encodedPic);
		ImageIcon pic = new ImageIcon(decoded);
		ImageIcon scaledPic = new ImageIcon(pic.getImage().getScaledInstance(150, 150, 0));
		return scaledPic;
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



//public ImageIcon getPicture() {
//try {
//	byte[] original = Files.readAllBytes(Paths.get(this.getClass().getResource("/images/product.jpg").toURI()));
//	System.out.println(original.length);
//	byte[] encoded = Base64.getEncoder().encode(original);
//	System.out.println(encoded.length);
//	System.out.println(new String(encoded).length());
//	byte[] decoded = Base64.getDecoder().decode(encoded);
//	System.out.println(decoded.length);
//	
//	ImageIcon pic = new ImageIcon(decoded);
//	ImageIcon scaledPic = new ImageIcon(pic.getImage().getScaledInstance(150, 150, 0));
//	return scaledPic;
//	
//	
//	
//}catch(Exception e2){
//	e2.printStackTrace();
//}
//return null;
//}

//public static void main(String [] args) {
//MainModel m = new MainModel();
//String db = m.encodePic("db.jpg");
////String rave = m.encodePic("right.jpg");
////String matrix = m.encodePic("matrix..jpg");
////String openspace = m.encodePic("product.jpg");
//String spicy = m.encodePic("spicy.jpg");
////String thisthat = m.encodePic("thisthat.jpg");
////String buya = m.encodePic("buya.jpg");
//
//try {
////	m.getDbConnection().addImage(openspace, 1);
////	m.getDbConnection().addImage(buya, 2);
////	m.getDbConnection().addImage(matrix, 3);
////	m.getDbConnection().addImage(thisthat, 4);
////	m.getDbConnection().addImage(rave, 5);
//	m.getDbConnection().addImage(spicy, 6);
//	m.getDbConnection().addImage(db, 7);
//	
//}catch(Exception e) {
//	e.printStackTrace();
//}
//}
