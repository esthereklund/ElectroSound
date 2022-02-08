package view;

import javax.swing.JPanel;

import view.menu_components.*;

public class CenterPanel extends JPanel{
	private FirstPage first;
	
	public CenterPanel() {
		this.setLayout(null);
		this.setBounds(140, 240, 1120, 595);
		this.setOpaque(false);
		
		this.setFirst(new FirstPage());
		this.add(this.getFirst());
	}

	public FirstPage getFirst() {
		return first;
	}

	public void setFirst(FirstPage first) {
		this.first = first;
	}
	
}
