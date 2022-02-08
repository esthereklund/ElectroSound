package view.menu_components;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class Newness extends JPanel{
	private JLabel newness;
	
	public Newness() {
		this.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.setBounds(28, 37, 310, 310);
		this.setLayout(null);
		
		this.setNewness(new JLabel());
		this.getNewness().setBounds(1, 1, 308, 308);
		ImageIcon u_left = new ImageIcon(getClass().getResource("/images/left.jpg"));
		Image left = u_left.getImage().getScaledInstance(308, 308, 0);
		
		this.getNewness().setIcon(new ImageIcon(left));
		this.add(this.getNewness());
	}

	public JLabel getNewness() {
		return newness;
	}

	public void setNewness(JLabel newness) {
		this.newness = newness;
	}
	
}
