package view.menu_components;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class InfoPanel extends JPanel{
	
	Font f1 = new Font("Calibri", Font.TRUETYPE_FONT, 14);
	Font f2 = new Font("Calibri", Font.BOLD, 11);
	Font f3 = new Font("Calibri", Font.TRUETYPE_FONT, 10);
	
	public InfoPanel() {
		this.setBounds(60, 840, 300, 300);
		this.setOpaque(false);
		this.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 0));
		
		JTextArea kontakt = new JTextArea("Kontakt\n"); 	
		kontakt.append("Electrosound GmbH");
		
		
	
		
		
		JTextArea text = new JTextArea();
		text.setEditable(false);
		text.setForeground(Color.white);
		text.setOpaque(false);
	//	text.setText("Informationen\n");
		text.setFont(f2);
		text.append("- Unsere AGB\n");
		text.append("- Liefer- und Verdsandkosten\n");
		text.append("- Zahlungsmöglichkeiten\n");
		text.append("- Impressum\n");
		text.append("- Privatspäre und Datenschutz\n");
		text.append("- Kontakt\n");
		text.append("- Widerrufsrecht\n");
		this.add(kontakt);
		this.add(text);
	}
			
}
