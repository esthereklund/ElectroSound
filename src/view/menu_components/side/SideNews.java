package view.menu_components.side;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import view.menu_components.labels.MyLabel18Bold;

public class SideNews extends JLabel{
	private MyLabel18Bold labelText;
	public SideNews() {
		this.setBounds(1, 1, 200, 200);
		this.setLabelText(new MyLabel18Bold(""));
		this.getLabelText().setBounds(920, 329, 200, 200);
		this.getLabelText().setHorizontalAlignment(SwingConstants.CENTER);
		this.add(this.getLabelText());
		
	}
	
	public SideNews(String label, String path) {
		this();
		ImageIcon unscaled = new ImageIcon(getClass().getResource(path));
		Image scaled = unscaled.getImage().getScaledInstance(200, 200, 0);
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
