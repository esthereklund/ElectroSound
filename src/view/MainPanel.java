package view;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.data.Cd;
import view.menu_components.footer.InfoPanel;
import view.menu_components.header.LabelPanel;
import view.menu_components.header.Logo;
import view.menu_components.header.MenuPanel;
import view.menu_components.header.SmallPanel;
import view.menu_components.header.Vinyl;

public class MainPanel extends JPanel{
	
	private HeaderPanel upperPanel;
	private JLabel backGround;
	private FooterPanel downPanel;
	private CenterPanel centerPanel;

	public MainPanel() {
		this.setLayout(null);
		this.setBounds(0, 0, 1400, 1050);
		this.setBackground(Color.black);
		
		this.setUpperPanel(new HeaderPanel());
		this.setDownPanel(new FooterPanel());
		this.add(this.getDownPanel());
		this.setCenterPanel(new CenterPanel());
		this.add(this.getCenterPanel());
		this.add(this.getUpperPanel());
		
		this.setBackGround(new JLabel());
		this.getBackGround().setBounds(0, 0, 1400, 933);
		this.getBackGround().setLayout(null);
		ImageIcon u_night = new ImageIcon(getClass().getResource("/images/night.jpg"));
		Image night = u_night.getImage().getScaledInstance(1400, 933, 0);
		this.getBackGround().setIcon(new ImageIcon(night));
		this.add(this.getBackGround());
		
	//	this.getBackGround().add(this.getUpperPanel());
		
		
	}
	
	
	//GETTER, SETTER
	
	public HeaderPanel getUpperPanel() {
		return upperPanel;
	}

	public void setUpperPanel(HeaderPanel upperPanel) {
		this.upperPanel = upperPanel;
	}

	public JLabel getBackGround() {
		return backGround;
	}

	public void setBackGround(JLabel backGround) {
		this.backGround = backGround;
	}
	
	public FooterPanel getDownPanel() {
		return downPanel;
	}

	public void setDownPanel(FooterPanel downPanel) {
		this.downPanel = downPanel;
	}

	public CenterPanel getCenterPanel() {
		return centerPanel;
	}

	public void setCenterPanel(CenterPanel centerPanel) {
		this.centerPanel = centerPanel;
	}


	
}
