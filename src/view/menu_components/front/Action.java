package view.menu_components.front;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class Action extends JPanel{
	private CatLabel catLabel;
	public Action() {
		this.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.setBounds(406, 37, 310, 310);
		this.setLayout(null);
		
		this.setCatLabel(new CatLabel("Angebote", "/images/central.jpg"));
		this.add(this.getCatLabel());

	}
	public CatLabel getCatLabel() {
		return catLabel;
	}

	public void setCatLabel(CatLabel catLabel) {
		this.catLabel = catLabel;
	}
	
}
