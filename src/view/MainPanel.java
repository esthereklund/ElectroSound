package view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel extends JPanel{
	
	public MainPanel() {
		this.setLayout(null);
		this.setBounds(0, 0, 1400, 1050);
		this.setBackground(Color.black);
		
		ImageIcon img = new ImageIcon(getClass().getResource("/images/night.jpg"));
		JLabel backGround = new JLabel("", img, JLabel.CENTER);
		this.add(backGround);
	}
}
