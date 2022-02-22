package controller;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JLabel;

import model.MainModel;
import model.data.Cd;
import model.interfaces.Article;
import view.MainPage;
import view.menu_components.GuestPage;
import view.menu_components.listItem.ProductItem;

public class MainController extends MouseAdapter{
	private MainPage view;
	private MainModel mainModel;
	
	public MainController() {
		this.setView(new MainPage());
		this.setMainModel(new MainModel());
		
		
		//Category Buttons in Menu Bar
		this.getView().alBtnSpecial(this::changeToProductPage);
		this.getView().alBtnAmbient(this::changeToProductPage);
		this.getView().alBtnBreakbeat(this::changeToProductPage);
		this.getView().alBtnDownbeat(this::changeToProductPage);
		this.getView().alBtnHouse(this::changeToProductPage);
		this.getView().alBtnIndustrial(this::changeToProductPage);
		this.getView().alBtnTrance(this::changeToProductPage);
		this.getView().alBtnTechno(this::changeToProductPage);
		
		//Category Buttons in Side Menu 
		this.getView().alBtnSpecialS(this::changeToProductPage);
		this.getView().alBtnAmbientS(this::changeToProductPage);
		this.getView().alBtnBreakbeatS(this::changeToProductPage);
		this.getView().alBtnDownbeatS(this::changeToProductPage);
		this.getView().alBtnHouseS(this::changeToProductPage);
		this.getView().alBtnIndustrialS(this::changeToProductPage);
		this.getView().alBtnTranceS(this::changeToProductPage);
		this.getView().alBtnTechnoS(this::changeToProductPage);
		
		//Buttons on BAasketPage
		this.getView().alBtnSearch(this::changeToProductPage);
		this.getView().alBtnToShop(this::changeToProductPage);
		this.getView().alBtnKasse(this::changeToGuest);
		
		//Change Views
		this.getView().mlKonto(this);
		this.getView().mlKasse(this);
		this.getView().mlAnmelden(this);
		this.getView().mlLogo(this);
		this.getView().mlBasket(this);
	}

	//Nimmt Daten vom Modell und übergibt an View, Action Listener on Button "Kaufen"
	public void getData(ActionEvent e) {
		List<Article> list = this.getMainModel().getSortmentAsList();
		System.out.println("getData in Controller");
		this.getView().loadList(list);
		this.alAddToBasket();
	}
	
	//Action Listener to Button "Kaufen"
	private void alAddToBasket() {
		this.getView().alAddToBasket(this::addItemToBasket);
	}
	
	//Fügt Artikeln zum Warenkorb In Model und View
	public void addItemToBasket(ActionEvent e) {
		JButton btn =(JButton)e.getSource();
		ProductItem res = (ProductItem)btn.getParent();
		Integer number = 1;
		String articleName = res.getTitle().getText();
		this.getMainModel().addItemToBasket(articleName, number);
		this.getView().basketRefresh(this.getMainModel().getBasket());
	}
	
	//Bestellung bestätigen
	public void confirmPurchase(ActionEvent e) {
		var btn = (JButton)e.getSource();
		var guest = (GuestPage)btn.getParent();
		String email = guest.getMail_().getText();
		String surname = guest.getSurname_().getText();
		String name = guest.getName_().getText();
		String house = guest.getNumber_().getText();
		String street = guest.getStreet_().getText();
		String index = guest.getIndex_().getText();
		String city = guest.getCity_().getText();
		Map<String, String> data = new HashMap<>();
		data.put(email, guest.getMail_().getText());
		data.put(surname, guest.getSurname_().getText());
		data.put(name, guest.getName_().getText());
		data.put(street, guest.getStreet_().getText());
		data.put(house, guest.getNumber_().getText());
		data.put(index, guest.getIndex_().getText());
		data.put(city, guest.getCity_().getText());
	}
	
	//Geht zur Produktseite, lädt die Liste
	private void changeToProductPage(ActionEvent e) {
		this.getData(e);
		System.out.println("Go to product Page");
		this.getView().viewProductList();
	}
	//Zu Login Liste
	private void changeToGuest(ActionEvent e) {
		this.getView().viewGuestPage();
	}
	//Zu Warenkorb
	private void changeToBasket(ActionEvent e) {
		this.getView().viewBasketPage();
	}
	// Zur Homepage
	private void changeToFirst(ActionEvent e) {
		this.getView().viewFirstPage();
	}
	private void changeToProduct(ActionEvent e) {
		this.getView().viewProductPage();
	}
	
	
	//Mouse Events
	@Override
	public void mouseClicked(MouseEvent ev) {
	//	System.out.println(e.getSource().getClass().getSimpleName());
		String s = ((JLabel) ev.getSource()).getName();		
		try {
			switch(s) {
			case "Konto":
				this.getView().viewGuestPage();
				break;
			
			case "Kasse":
				this.getView().viewGuestPage();
				break;
				
			case "Anmelden":
				this.getView().viewGuestPage();
				break;
				
			case "Vinyl":
				this.getView().viewBasketPage();
				break;
				
			case "Logo":
				this.getView().viewFirstPage();
			}
		}catch(Exception e) {	
		
		}
	}
	
	
	//GETTER, SETTER
	public MainPage getView() {
		return view;
	}
	public void setView(MainPage view) {
		this.view = view;
	}
	public MainModel getMainModel() {
		return mainModel;
	}
	public void setMainModel(MainModel mainModel) {
		this.mainModel = mainModel;
	}
	
}
