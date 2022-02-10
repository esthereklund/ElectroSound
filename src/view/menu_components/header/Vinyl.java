package view.menu_components.header;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Vinyl extends JLabel{
	
	public Vinyl() {
		
		ImageIcon unscaled = new ImageIcon(getClass().getResource("/images/vinyl.png"));
		Image scaled = unscaled.getImage().getScaledInstance(130, 130, 0);
		ImageIcon vinyl = new ImageIcon(scaled);
		
		this.setText("");
		this.setIcon(vinyl);
		this.setBounds(1250, 10, 150, 150);
	}
}
