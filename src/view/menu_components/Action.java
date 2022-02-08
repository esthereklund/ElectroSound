package view.menu_components;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class Action extends JPanel{
	private JLabel action;
	public Action() {
		this.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.setBounds(784, 37, 310, 310);
		this.setLayout(null);

		this.setAction(new JLabel());
		this.getAction().setBounds(1, 1, 308, 308);
		ImageIcon u_right = new ImageIcon(getClass().getResource("/images/right.jpg"));
		Image right = u_right.getImage().getScaledInstance(308, 308, 0);
		this.getAction().setIcon(new ImageIcon(right));
		this.add(this.getAction());
		
	

	}
	public JLabel getAction() {
		return action;
	}
	public void setAction(JLabel action) {
		this.action = action;
	}
	
}
