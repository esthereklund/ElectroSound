package view.menu_components;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class Newness extends JPanel{
	private CatLabel catLabel;
//	private MyLabel18Bold newsText;

	public Newness() {
		this.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.setBounds(28, 37, 310, 310);
		this.setLayout(null);
		
		this.setCatLabel(new CatLabel("Neue Produkte", "/images/left.jpg"));
		this.add(this.getCatLabel());

	}

	public CatLabel getCatLabel() {
		return catLabel;
	}

	public void setCatLabel(CatLabel catLabel) {
		this.catLabel = catLabel;
	}

	
}
