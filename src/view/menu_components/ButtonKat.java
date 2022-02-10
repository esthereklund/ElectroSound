package view.menu_components;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;

public class ButtonKat extends JButton{
	public ButtonKat(String name) {
		super(name);
		Color petrol = new Color(0, 102, 102);
		Color sky = new Color(100,255,255);
		this.setBackground(sky);
		this.setPreferredSize(new Dimension(100, 25));
	}
}
