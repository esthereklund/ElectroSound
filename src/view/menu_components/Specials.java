package view.menu_components;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class Specials extends JPanel{
	private JLabel special;
	
	public Specials() {
		this.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.setBounds(406, 37, 310, 310);
		this.setLayout(null);

		this.setSpecial(new JLabel());
		this.getSpecial().setBounds(1, 1, 308, 308);
		ImageIcon u_central = new ImageIcon(getClass().getResource("/images/central.jpg"));
		Image central = u_central.getImage().getScaledInstance(308, 308, 0);
		this.getSpecial().setIcon(new ImageIcon(central));
		this.add(this.getSpecial());
		
		
	}

	public JLabel getSpecial() {
		return special;
	}

	public void setSpecial(JLabel special) {
		this.special = special;
	}

	
}
