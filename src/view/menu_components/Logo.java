package view.menu_components;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Logo extends JLabel{
	public Logo() {
		
		ImageIcon img2 = new ImageIcon(getClass().getResource("/images/logo.png"));
		Image scaledimg2 = img2.getImage().getScaledInstance(220, 154, 0);
		ImageIcon scaledlogo = new ImageIcon(scaledimg2);	
		this.setText("");
		this.setIcon(scaledlogo);
		this.setBounds(0, 0, 250, 175);
		
		
	} 
	
}
