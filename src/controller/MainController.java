package controller;

import java.awt.event.ActionEvent;

import view.MainPage;

public class MainController {
	private MainPage view;
	
	public MainController() {
		this.setView(new MainPage());
		this.getView().alBtnSpecial(this::changeToProductPage);
		this.getView().alBtnAmbient(this::changeToProductPage);
		this.getView().alBtnBreakbeat(this::changeToProductPage);
		this.getView().alBtnDownbeat(this::changeToProductPage);
		this.getView().alBtnHouse(this::changeToProductPage);
		this.getView().alBtnIndustrial(this::changeToProductPage);
		this.getView().alBtnTrance(this::changeToProductPage);
		this.getView().alBtnTechno(this::changeToProductPage);
	}

	
	private void changeToProductPage(ActionEvent e) {
		this.getView().viewProductList();
	}
	public MainPage getView() {
		return view;
	}

	public void setView(MainPage view) {
		this.view = view;
	}
	
}
