package view.menu_components.labels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class MyLabel18Bold extends JLabel{
	public MyLabel18Bold(String label) {
		super(label);
		Font f = new Font("Calibri", Font.BOLD, 18);
		this.setFont(f);
		this.setForeground(Color.white);
	}
}
