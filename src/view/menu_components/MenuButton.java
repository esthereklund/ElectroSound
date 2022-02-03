package view.menu_components;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

public class MenuButton extends JButton{
	Color petrol = new Color(0, 102, 102);
	Color sky = new Color(153,255,255);
	
	public MenuButton(String name) {
		
		super(name);
		this.setBackground(petrol);
		this.setForeground(Color.white);
		Font f = new Font("Calibri", Font.TRUETYPE_FONT, 18);
		this.setFont(f);
//		this.setSize(60, 40);
	} 
}
