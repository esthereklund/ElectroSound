package view.menu_components;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuPanel extends JPanel{

	Color petrol = new Color(0, 102, 102);
	
	public MenuPanel(){
		
		this.setBounds(0, 150, 1400, 60);
		this.setBackground(petrol);
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 20));
		
		JButton specials = new MenuButton("Specials");
		JButton ambient = new MenuButton("Ambient");
		JButton breakbeat = new MenuButton("Breakbeat");
		JButton downbeat = new MenuButton("Downbeat");
		JButton house = new MenuButton("House");
		JButton industrial = new MenuButton("Industrial & Noise");
		JButton trance = new MenuButton("Trance");
		JButton techno = new MenuButton("Techno");
		
		this.add(specials);
		this.add(ambient);
		this.add(breakbeat);
		this.add(downbeat);
		this.add(house);
		this.add(industrial);
		this.add(trance);
		this.add(techno);
		
	}
	
	
	
}
