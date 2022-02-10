package view.menu_components.header;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import view.menu_components.labels.MyLabel16;

public class LabelPanel extends JPanel {
	private MyLabel16 link0;
	private MyLabel16 link1;
	private MyLabel16 link2;
	
	public LabelPanel() {
		this.setBounds(900, 0, 500, 100);
		this.setOpaque(false);
		this.setLayout(new FlowLayout(FlowLayout.RIGHT, 30 ,10 ));
		
		this.setLink0(new MyLabel16("Zur Kasse"));
		this.setLink1(new MyLabel16("Ihr Konto"));
		this.setLink2(new MyLabel16("Anmelden"));
		
		this.add(this.getLink0());
		this.add(this.getLink1());
		this.add(this.getLink2());
	}

	public MyLabel16 getLink0() {
		return link0;
	}

	public void setLink0(MyLabel16 link0) {
		this.link0 = link0;
	}

	public MyLabel16 getLink1() {
		return link1;
	}

	public void setLink1(MyLabel16 link1) {
		this.link1 = link1;
	}

	public MyLabel16 getLink2() {
		return link2;
	}

	public void setLink2(MyLabel16 link2) {
		this.link2 = link2;
	}
	
}
