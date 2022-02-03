package view.menu_components;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Linkpanel extends JPanel {
	
	public Linkpanel() {
		this.setBounds(900, 0, 500, 100);
		this.setOpaque(false);
		this.setLayout(new FlowLayout(FlowLayout.RIGHT, 30 ,10 ));
		
		JLabel link0 = new JLabel("Zur Kasse");
		JLabel link1 = new JLabel("Ihr Konto");
		JLabel link2 = new JLabel("Anmelden");
		
		Font f = new Font("Calibri", Font.TRUETYPE_FONT, 16);
		link0.setFont(f);
		link0.setForeground(Color.white);
		link1.setFont(f);
		link1.setForeground(Color.white);
		link2.setFont(f);
		link2.setForeground(Color.white);
		
		this.add(link0);
		this.add(link1);
		this.add(link2);
	}
}
