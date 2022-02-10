package view.menu_components;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class SMLabel extends JLabel{
	public SMLabel(String path) {
		ImageIcon unscaled = new ImageIcon(getClass().getResource(path));
		Image scaled = unscaled.getImage().getScaledInstance(40, 40, 0);
		this.setIcon(new ImageIcon(scaled));
	}
}
