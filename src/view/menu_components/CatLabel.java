package view.menu_components;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

public class CatLabel extends JLabel{
	private MyLabel18Bold labelText;
	public CatLabel() {
		this.setBounds(1, 1, 308, 308);
		this.setLabelText(new MyLabel18Bold(""));
		this.getLabelText().setBounds(0, 270, 308, 20);
		this.getLabelText().setHorizontalAlignment(SwingConstants.CENTER);
		this.add(this.getLabelText());
		
	}
	public CatLabel(String label, String path) {
		this();
		ImageIcon unscaled = new ImageIcon(getClass().getResource(path));
		Image scaled = unscaled.getImage().getScaledInstance(308, 308, 0);
		this.setIcon(new ImageIcon(scaled));
		this.getLabelText().setText(label);
		
	}
	
	public MyLabel18Bold getLabelText() {
		return labelText;
	}
	public void setLabelText(MyLabel18Bold labelText) {
		this.labelText = labelText;
	}
	
}
