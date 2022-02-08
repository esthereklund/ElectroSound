package view;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import view.menu_components.InfoPanel;
import view.menu_components.LabelPanel;
import view.menu_components.Logo;
import view.menu_components.MenuPanel;
import view.menu_components.MiddlePanel;
import view.menu_components.SmallPanel;
import view.menu_components.Vinyl;

public class MainPanel extends JPanel{
	
	private UpperPanel upperPanel;
	private JLabel backGround;
	private DownPanel downPanel;
	
	public MainPanel() {
		this.setLayout(null);
		this.setBounds(0, 0, 1400, 1050);
		this.setBackground(Color.black);
		this.setUpperPanel(new UpperPanel());
		this.setBackGround(new JLabel());
		this.getBackGround().setBounds(0, 0, 1400, 933);
		this.getBackGround().setLayout(null);
		ImageIcon u_night = new ImageIcon(getClass().getResource("/images/night.jpg"));
		Image night = u_night.getImage().getScaledInstance(1400, 933, 0);
		this.getBackGround().setIcon(new ImageIcon(night));
		this.add(this.getBackGround());
		this.getBackGround().add(this.getUpperPanel());
		
		
		

//		//Add Info Panel
//		JPanel infoPanel = new InfoPanel();
//		add(infoPanel);
//		
//		//Add Middle Panel
//		JPanel middlePanel = new MiddlePanel();
//		add(middlePanel);
		
	}
	
	public UpperPanel getUpperPanel() {
		return upperPanel;
	}

	public void setUpperPanel(UpperPanel upperPanel) {
		this.upperPanel = upperPanel;
	}

	public JLabel getBackGround() {
		return backGround;
	}

	public void setBackGround(JLabel backGround) {
		this.backGround = backGround;
	}
}
