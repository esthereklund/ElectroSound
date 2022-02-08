package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import view.menu_components.*;

public class DownPanel extends JPanel{
	private JTextArea kontakt;
	private JTextArea info;
	private SocialMedia socialMedia;
	private PayingBlock payingBlock;
	
	public DownPanel() {
		Font f3 = new Font("Calibri", Font.PLAIN, 12);
		this.setLayout(null);
		this.setBounds(0, 850, 1400, 400);
		this.setOpaque(false);
		
														//Kontakt
		this.setKontakt(new JTextArea());
		this.getKontakt().setEditable(false);
		this.getKontakt().setOpaque(false);
		this.getKontakt().setText("Kontakt\r\n\r\nElectroSound\r\nGrünstrasse 22\r\n40777 Düsseldorf\r\nTel: (+49)0221-12345\r\n\r\nKontaktformular");
		this.getKontakt().setBounds(180, 30, 200, 156);
		this.getKontakt().setFont(f3);
		this.add(this.getKontakt());

														//Informationen
		this.setInfo(new JTextArea());
		this.getInfo().setEditable(false);
		this.getInfo().setOpaque(false);
		this.getInfo().setText("Informationen\r\n- Unsere AGB\r\n- Liefer und Versandkosten\r\n- Impressum\r\n- Zahlungsmöglichkeiten\r\n- Privatshäre und Datenschutz\r\n- Kontakt\r\n- Widerrufsrecht\r\n");
		this.getInfo().setBounds(320, 30, 242, 156);
		this.getInfo().setFont(f3);
		this.add(this.getInfo());
		
														//Social Media
		this.setSocialMedia(new SocialMedia());
		this.add(this.getSocialMedia());
														//Label/ Zahlungsweise
		this.setPayingBlock(new PayingBlock());
		this.add(this.getPayingBlock());
	}

	public JTextArea getKontakt() {
		return kontakt;
	}

	public void setKontakt(JTextArea kontakt) {
		this.kontakt = kontakt;
	}

	public JTextArea getInfo() {
		return info;
	}

	public void setInfo(JTextArea info) {
		this.info = info;
	}

	public SocialMedia getSocialMedia() {
		return socialMedia;
	}

	public void setSocialMedia(SocialMedia socialMedia) {
		this.socialMedia = socialMedia;
	}

	public PayingBlock getPayingBlock() {
		return payingBlock;
	}

	public void setPayingBlock(PayingBlock payingBlock) {
		this.payingBlock = payingBlock;
	}
	
	
}


