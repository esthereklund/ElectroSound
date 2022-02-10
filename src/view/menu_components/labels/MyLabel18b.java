package view.menu_components.labels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class MyLabel18b extends JLabel{
	public MyLabel18b() {
		Font f = new Font("Calibri", Font.TRUETYPE_FONT, 18);
		this.setFont(f);
		
	}
	public MyLabel18b(String label) {
		super(label);
		Font f = new Font("Calibri", Font.TRUETYPE_FONT, 18);
		this.setFont(f);
	}
}
