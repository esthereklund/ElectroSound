package view.menu_components.footer;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import view.menu_components.labels.MyLabel16;

public class PayingBlock extends JPanel{
	private MyLabel16 label;
	private MyLabel16 payment;
	private JComboBox labelSearch;
	private JButton rechnung;
	private JButton vorkasse;
	private JButton paypal;
	private JButton klarna;
	
	
	public PayingBlock() {
		this.setBounds(940, 0, 364, 183);
		this.setOpaque(false);
		this.setLayout(null);
		
		this.setLabel(new MyLabel16("Label"));
		this.getLabel().setBounds(101, 11, 46, 14);
		this.add(this.getLabel());
		
		this.setPayment(new MyLabel16("Zahlungsweisen"));
		this.getPayment().setBounds(101, 64, 130, 18);
		this.add(this.getPayment());
	
		this.setLabelSearch(new JComboBox());
		this.getLabelSearch().setBounds(101, 25, 136, 22);
		this.add(this.getLabelSearch());

		this.setRechnung(new JButton("Rechnung"));
		this.getRechnung().setBounds(101, 85, 93, 23);
		this.getRechnung().setBackground(Color.black);
		this.getRechnung().setEnabled(false);
		this.add(this.getRechnung());
		
		this.setVorkasse(new JButton("Vorkasse"));
		this.getVorkasse().setEnabled(false);
		this.getVorkasse().setBackground(Color.black);
		this.getVorkasse().setBounds(210, 85, 93, 23);
		this.add(this.getVorkasse());
		
		this.setPaypal(new JButton());
		this.getPaypal().setBounds(101, 119, 93, 23);
		ImageIcon unscaledPaypal = new ImageIcon(getClass().getResource("/images/PayPal-Logo.jpg"));
		Image scaledPaypal = unscaledPaypal.getImage().getScaledInstance(93, 23, 0);
		this.getPaypal().setIcon(new ImageIcon(scaledPaypal));
		this.add(this.getPaypal());
		
		this.setKlarna(new JButton());
		this.getKlarna().setBounds(210, 119, 93, 23);
		ImageIcon unscaledKlarna = new ImageIcon(getClass().getResource("/images/klarna.png"));
		Image scaledKlarna = unscaledKlarna.getImage().getScaledInstance(93, 23, 0);
		this.getKlarna().setIcon(new ImageIcon(scaledKlarna));
		this.add(this.getKlarna());
		
		

	}


	public MyLabel16 getLabel() {
		return label;
	}


	public void setLabel(MyLabel16 label) {
		this.label = label;
	}


	public MyLabel16 getPayment() {
		return payment;
	}


	public void setPayment(MyLabel16 payment) {
		this.payment = payment;
	}


	public JComboBox getLabelSearch() {
		return labelSearch;
	}


	public void setLabelSearch(JComboBox labelSearch) {
		this.labelSearch = labelSearch;
	}


	public JButton getRechnung() {
		return rechnung;
	}


	public void setRechnung(JButton rechnung) {
		this.rechnung = rechnung;
	}


	public JButton getVorkasse() {
		return vorkasse;
	}


	public void setVorkasse(JButton vorkasse) {
		this.vorkasse = vorkasse;
	}


	public JButton getPaypal() {
		return paypal;
	}


	public void setPaypal(JButton paypal) {
		this.paypal = paypal;
	}


	public JButton getKlarna() {
		return klarna;
	}


	public void setKlarna(JButton klarna) {
		this.klarna = klarna;
	}
	
	
}
