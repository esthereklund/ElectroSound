package view.menu_components;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Logo extends JLabel{
	public Logo() {
		
		ImageIcon unscaled = new ImageIcon(getClass().getResource("/images/logo.png"));
		Image scaled = unscaled.getImage().getScaledInstance(220, 154, 0);
		ImageIcon scaledlogo = new ImageIcon(scaled);	
		this.setText("");
		this.setIcon(scaledlogo);
		this.setBounds(0, 0, 250, 175);
		

		
	} 
	
}
