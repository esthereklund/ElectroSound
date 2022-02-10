package view.menu_components;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

public class Specials extends JPanel{
	private CatLabel catLabel;
	public Specials() {
		this.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.setBounds(784, 37, 310, 310);
		this.setLayout(null);
		
		this.setCatLabel(new CatLabel("Special Releases", "/images/db.jpg"));
		this.add(this.getCatLabel());

	}
	public CatLabel getCatLabel() {
		return catLabel;
	}

	public void setCatLabel(CatLabel catLabel) {
		this.catLabel = catLabel;
	}

	
}
