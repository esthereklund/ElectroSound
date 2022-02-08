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
		this.setMainPanel(new MainPanel());
		this.setContentPane(this.getMainPanel());
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(MainPage.class.getResource("/images/vinyl.png")));
		
		setVisible(true);
	}
	
	
	public MainPanel getMainPanel() {
		return mainPanel;
	}
	public void setMainPanel(MainPanel mainPanel) {
		this.mainPanel = mainPanel;
	}
	
	
	
}	

