package view;

import java.awt.*;
import java.awt.event.ActionListener;

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
	
	//ButtonListeners
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
	
	
	
	//LabelListeners
	
	public void viewGuestPage() {
		this.getMainPanel().getCenterPanel().changeView(true,  false,  false,  false, false);
	}
	public void viewFirstPage() {
		this.getMainPanel().getCenterPanel().changeView(false,  true,  false,  false,  false);
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
	
	
	
}	

