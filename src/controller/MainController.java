package controller;

import java.awt.Component;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.EventObject;
import java.util.List;

import javax.swing.ActionMap;
import javax.swing.JLabel;

import model.Cd;
import model.MainModel;
import view.MainPage;
import view.menu_components.listItem.ProductItem;

public class MainController extends MouseAdapter{
	private MainPage view;
	private MainModel mainModel;
	
	public MainController() {
		this.setView(new MainPage());
		this.setMainModel(new MainModel());
		
		this.getView().alBtnSpecial(this::changeToProductPage);
		this.getView().alBtnAmbient(this::changeToProductPage);
		this.getView().alBtnBreakbeat(this::changeToProductPage);
		this.getView().alBtnDownbeat(this::changeToProductPage);
		this.getView().alBtnHouse(this::changeToProductPage);
		this.getView().alBtnIndustrial(this::changeToProductPage);
		this.getView().alBtnTrance(this::changeToProductPage);
		this.getView().alBtnTechno(this::changeToProductPage);
		
		this.getView().alBtnSpecialS(this::changeToProductPage);
		this.getView().alBtnAmbientS(this::changeToProductPage);
		this.getView().alBtnBreakbeatS(this::changeToProductPage);
		this.getView().alBtnDownbeatS(this::changeToProductPage);
		this.getView().alBtnHouseS(this::changeToProductPage);
		this.getView().alBtnIndustrialS(this::changeToProductPage);
		this.getView().alBtnTranceS(this::changeToProductPage);
		this.getView().alBtnTechnoS(this::changeToProductPage);
		
		this.getView().alBtnSearch(this::changeToProductPage);
		this.getView().alBtnToShop(this::changeToProductPage);
		this.getView().alBtnKasse(this::changeToGuest);
		
		this.getView().mlKonto(this);
		this.getView().mlKasse(this);
		this.getView().mlAnmelden(this);
		this.getView().mlLogo(this);
		this.getView().mlBasket(this);

	}

	
	public void getData(ActionEvent e) {
		try {
			List<Cd> list = this.getMainModel().getDataFromDB();
			this.getView().loadList(list);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	
	private void changeToProductPage(ActionEvent e) {
		this.getView().viewProductList();
	}
	private void changeToGuest(ActionEvent e) {
		this.getView().viewGuestPage();
	}
	
	private void changeToBasket(ActionEvent e) {
		this.getView().viewBasketPage();
	}
	
	private void changeToFirst(ActionEvent e) {
		this.getView().viewFirstPage();
	}
	private void changeToProduct(ActionEvent e) {
		this.getView().viewProductPage();
	}
	
	
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
