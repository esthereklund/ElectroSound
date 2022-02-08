package view.menu_components;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class MyLabel16 extends JLabel{
	public MyLabel16(String label) {
		super(label);
		Font f = new Font("Calibri", Font.TRUETYPE_FONT, 16);
		this.setFont(f);
		this.setForeground(Color.white);
	}
}
