package view.menu_components.labels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class TitelLabel extends JLabel{
	public TitelLabel(String title) {
		super(title);
		this.setBounds(0,0,300,27);
		this.setForeground(Color.white);
		this.setFont(new Font("Calibri", Font.TRUETYPE_FONT, 22));
	}
}
