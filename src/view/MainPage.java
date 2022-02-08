package view;

import java.awt.*;

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
		this.setContentPane(this.getMainPanel());
		
	
		
		
		
		//Add logo
		JLabel logo = new Logo(); 
		add(logo);
		
		// Add basket
		JLabel vinyl = new Vinyl();
		add(vinyl);
		
		//Add menuPanel
		JPanel menuPanel = new MenuPanel();
		add(menuPanel);
		
		//Add submenuPanel
		JPanel smallPanel = new SmallPanel();
		add(smallPanel);
		
		
		//Add Links
		JPanel linkspanel = new Linkpanel();
		add(linkspanel);
		
		
		//Add Info Panel
		JPanel infoPanel = new InfoPanel();
		add(infoPanel);
		
		//Add Middle Panel
		JPanel middlePanel = new MiddlePanel();
		add(middlePanel);
		
		
		
		
		setVisible(true);
	}
	
	
	public MainPanel getMainPanel() {
		return mainPanel;
	}
	public void setMainPanel(MainPanel mainPanel) {
		this.mainPanel = mainPanel;
	}
	
	
	
}	

