package view.menu_components.labels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class MyLabel16b extends JLabel{
	public MyLabel16b() {
		Font f = new Font("Calibri", Font.TRUETYPE_FONT, 16);
		this.setFont(f);
		
	}
	public MyLabel16b(String label) {
		super(label);
		Font f = new Font("Calibri", Font.TRUETYPE_FONT, 16);
		this.setFont(f);
	}
}