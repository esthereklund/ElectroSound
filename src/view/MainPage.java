package view;
import model.*;
import model.data.Cd;
import model.interfaces.Article;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import view.menu_components.*;


public class MainPage extends JFrame{
		
	private MainPanel mainPanel;
	
	public MainPage(){
		
		this.setSize(1400, 1050);
		this.setResizable(false);
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("ElectroSound");
		this.setMainPanel(new MainPanel());
		this.setContentPane(this.getMainPanel());
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(MainPage.class.getResource("/images/vinyl.png")));
		
		setVisible(true);
	}
	
	//ButtonListeners menu
	public void alBtnSpecial(ActionListener a) {
		this.getMainPanel().getUpperPanel().getMenuPanel().getSpecials().addActionListener(a);;
	}
	public void alBtnAmbient(ActionListener a) {
		this.getMainPanel().getUpperPanel().getMenuPanel().getAmbient().addActionListener(a);;
	}
	public void alBtnBreakbeat(ActionListener a) {
		this.getMainPanel().getUpperPanel().getMenuPanel().getBreakbeat().addActionListener(a);;
	}
	public void alBtnDownbeat(ActionListener a) {
		this.getMainPanel().getUpperPanel().getMenuPanel().getDownbeat().addActionListener(a);;
	}
	public void alBtnHouse(ActionListener a) {
		this.getMainPanel().getUpperPanel().getMenuPanel().getHouse().addActionListener(a);;
	}
	public void alBtnIndustrial(ActionListener a) {
		this.getMainPanel().getUpperPanel().getMenuPanel().getIndustrial().addActionListener(a);;
	}
	public void alBtnTrance(ActionListener a) {
		this.getMainPanel().getUpperPanel().getMenuPanel().getTrance().addActionListener(a);;
	}
	public void alBtnTechno(ActionListener a) {
		this.getMainPanel().getUpperPanel().getMenuPanel().getTechno().addActionListener(a);;
	}
	
	//button LIsteners side
	
	public void alBtnSpecialS(ActionListener a) {
		this.getMainPanel().getCenterPanel().getProduct().getCategoryButtons().getSpecials().addActionListener(a);;
	}
	public void alBtnAmbientS(ActionListener a) {
		this.getMainPanel().getCenterPanel().getProduct().getCategoryButtons().getAmbient().addActionListener(a);;
	}
	public void alBtnBreakbeatS(ActionListener a) {
		this.getMainPanel().getCenterPanel().getProduct().getCategoryButtons().getBreakbeat().addActionListener(a);;
	}
	public void alBtnDownbeatS(ActionListener a) {
		this.getMainPanel().getCenterPanel().getProduct().getCategoryButtons().getDownbeat().addActionListener(a);;
	}
	public void alBtnHouseS(ActionListener a) {
		this.getMainPanel().getCenterPanel().getProduct().getCategoryButtons().getHouse().addActionListener(a);;
	}
	public void alBtnIndustrialS(ActionListener a) {
		this.getMainPanel().getCenterPanel().getProduct().getCategoryButtons().getIndustrial().addActionListener(a);;
	}
	public void alBtnTranceS(ActionListener a) {
		this.getMainPanel().getCenterPanel().getProduct().getCategoryButtons().getTrance().addActionListener(a);;
	}
	public void alBtnTechnoS(ActionListener a) {
		this.getMainPanel().getCenterPanel().getProduct().getCategoryButtons().getTechno().addActionListener(a);;
	}
	
	
	//other Buttons
	public void alBtnSearch(ActionListener a) {
		this.getMainPanel().getUpperPanel().getSearchButton().addActionListener(a);
	}
	public void alBtnToBasket(ActionListener a) {
	//	this.getMainPanel().getCenterPanel().getBasket().getActualize().addActionListener(a);
	}
	public void alBtnToTrash(ActionListener a) {
	//	this.getMainPanel().getCenterPanel().getBasket().get
	}
	public void alBtnToShop(ActionListener a) {
		this.getMainPanel().getCenterPanel().getBasket().getBack().addActionListener(a);
	}
	public void alBtnActual(ActionListener a) {
		
	}
	public void alBtnKasse(ActionListener a) {
		this.getMainPanel().getCenterPanel().getBasket().getPurchase().addActionListener(a);
	}
	
	public void alAddToBasket(ActionListener al) {
		this.getMainPanel().getCenterPanel().getListPanel().alAddToBasket(al);
	}
	
	//LabelListeners
	
	public void mlKonto(MouseListener e) {
		this.getMainPanel().getUpperPanel().getLabelPanel().getLink1().addMouseListener(e);
	}
	
	public void mlKasse(MouseListener e) {	
		this.getMainPanel().getUpperPanel().getLabelPanel().getLink0().addMouseListener(e);
	}
	
	public void mlAnmelden(MouseListener e) {
		this.getMainPanel().getUpperPanel().getLabelPanel().getLink2().addMouseListener(e);
	} 
	public void mlLogo(MouseListener e) {
		this.getMainPanel().getUpperPanel().getLogo().addMouseListener(e);
	}
	public void mlBasket(MouseListener e) {	
		this.getMainPanel().getUpperPanel().getVinyl().addMouseListener(e);
	}
	
	
	//view Seiten
	
	public void viewGuestPage() {
		this.getMainPanel().getCenterPanel().changeView(false,  true,  false,  false, false);
	}
	public void viewFirstPage() {
		this.getMainPanel().getCenterPanel().changeView(true,  false,  false,  false,  false);
	}
	public void viewProductPage() {
		this.getMainPanel().getCenterPanel().changeView(false,  false,  true,  false,  false);
	}	
	public void viewProductList() {
		this.getMainPanel().getCenterPanel().changeView(false, false, false, true, false);
	}
	public void viewBasketPage() {
		this.getMainPanel().getCenterPanel().changeView(false,  false,  false,  false,  true);
	}
	
	
	public MainPanel getMainPanel() {
		return mainPanel;
	}
	public void setMainPanel(MainPanel mainPanel) {
		this.mainPanel = mainPanel;
	}

	public void loadList(List<Article> list) {
		System.out.println("Load List ");
		this.getMainPanel().getCenterPanel().getListPanel().displayResults(list);
		
	}
	
}	

