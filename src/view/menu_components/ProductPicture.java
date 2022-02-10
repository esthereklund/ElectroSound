package view.menu_components;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ProductPicture extends JLabel{
	public ProductPicture(String path) {
		this.setBounds(18, 18, 230, 230);				
		ImageIcon unscaled = new ImageIcon(getClass().getResource(path));
		Image scaled = unscaled.getImage().getScaledInstance(230, 230, 0);
		this.setIcon(new ImageIcon(scaled));

	}

}
