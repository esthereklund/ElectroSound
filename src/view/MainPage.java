package view;

import java.awt.*;

import javax.swing.*;

import view.menu_components.*;


public class MainPage extends JFrame{
	MainPage(){
		
		setSize(1400, 1010);
		setResizable(false);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Background
		ImageIcon img = new ImageIcon(getClass().getResource("/images/night.jpg"));
		JLabel backGround = new JLabel("", img, JLabel.CENTER);
		setContentPane(backGround);
		
		
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
		
		
		
		//Add Buttons
		
		//Add Links
		
		
		
		
		
		
		
		setVisible(true);
	}
	
	public static void main(String args[]) {
		
		new MainPage();
	}
	
	
	
}	

