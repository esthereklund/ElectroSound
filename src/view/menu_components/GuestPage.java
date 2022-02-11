package view.menu_components;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import view.menu_components.buttons.ConfirmButton;
import view.menu_components.labels.MyLabel18;
import view.menu_components.labels.TitelLabel;

public class GuestPage extends JPanel{
	
	
	private JLabel mail;
	private JLabel gName;
	private JLabel surname;
	private JLabel street;
	private JLabel number;
	private JLabel index;
	private JLabel city;
	private JLabel infos;
	
	private JTextField mail_;
	private JTextField name_;
	private JTextField surname_;
	private JTextField street_;
	private JTextField number_;
	private JTextField index_;
	private JTextField city_;
	
	private ConfirmButton confirmButton;
	
	public GuestPage() {
		this.setLayout(null);
		this.setBounds(0, 0, 1120, 595);
		this.setOpaque(false);
		
		TitelLabel titel = new TitelLabel("Ich möchte als Gast bestellen");
		this.add(titel);
		
		JPanel formular = new JPanel();
		formular.setLayout(null);
		formular.setBounds(0, 40, 1120, 500);
		this.add(formular);
		
		JPanel formularTitle= new JPanel();
		formularTitle.setBounds(0,  0, 1120, 35);
		formularTitle.setLayout(null);
		formularTitle.setBackground(new Color(0, 102, 102));
		formular.add(formularTitle);
			
		MyLabel18 formularTextTitle = new MyLabel18("Füllen Sie bitte das Formular aus");
		formularTextTitle.setBounds(10, 5, 300, 30);
		formularTitle.add(formularTextTitle);
		
		JTextArea welcomeText = new JTextArea();
		welcomeText.setBounds(80, 60, 960, 68);
		welcomeText.setEditable(false);
		welcomeText.setLineWrap(true);
		welcomeText.setText("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\r\nSed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. ");
		formular.add(welcomeText);
		
		
		// Labels
		
		this.setMail(new JLabel("Email*"));		
		this.setGName(new JLabel("Name*"));
		this.setSurname(new JLabel("Vorname*"));
		this.setStreet(new JLabel("Strasse*"));
		this.setNumber(new JLabel("Hausnummer*"));
		this.setIndex(new JLabel("PLZ*"));
		this.setCity(new JLabel("Ort*"));
		
		this.getMail().setBounds(90, 150, 75, 23);
		this.getGName().setBounds(90, 250, 75, 23);
		this.getSurname().setBounds(90, 350, 75, 23);
		this.getStreet().setBounds(430, 150, 75, 23);
		this.getNumber().setBounds(750, 150, 85, 23);
		this.getIndex().setBounds(430, 250, 75, 23);
		this.getCity().setBounds(430, 350, 75, 23);
		
		formular.add(this.getMail());
		formular.add(this.getGName());
		formular.add(this.getSurname());
		formular.add(this.getStreet());
		formular.add(this.getNumber());
		formular.add(this.getIndex());
		formular.add(this.getCity());
		
		//Fields
		this.setMail_(new JTextField());
		this.setName_(new JTextField());
		this.setSurname_(new JTextField());
		this.setStreet_(new JTextField());
		this.setNumber_(new JTextField());
		this.setIndex_(new JTextField());
		this.setCity_(new JTextField());
		
		this.getMail_().setBounds(90, 180, 260, 35);
		this.getName_().setBounds(90, 280, 260, 35);
		this.getSurname_().setBounds(90, 380, 260, 35);
		this.getStreet_().setBounds(430, 180, 260, 35);
		this.getNumber_().setBounds(750, 180, 60, 35);
		this.getIndex_().setBounds(430, 280, 260, 35);
		this.getCity_().setBounds(430, 380, 260, 35);
		
		formular.add(this.getMail_());
		formular.add(this.getName_());
		formular.add(this.getSurname_());
		formular.add(this.getStreet_());
		formular.add(this.getNumber_());
		formular.add(this.getIndex_());
		formular.add(this.getCity_());
		
		this.setConfirmButton(new ConfirmButton("Verbindlich bestellen"));
		this.getConfirmButton().setBounds(750, 380, 160, 35);
		formular.add(this.getConfirmButton());
	}


	public JLabel getMail() {
		return mail;
	}

	public void setMail(JLabel mail) {
		this.mail = mail;
	}

	public JLabel getGName() {
		return gName;
	}

	public void setGName(JLabel gName) {
		this.gName = gName;
	}

	public JLabel getSurname() {
		return surname;
	}

	public void setSurname(JLabel surname) {
		this.surname = surname;
	}

	public JLabel getStreet() {
		return street;
	}

	public void setStreet(JLabel street) {
		this.street = street;
	}

	public JLabel getNumber() {
		return number;
	}

	public void setNumber(JLabel number) {
		this.number = number;
	}

	public JLabel getIndex() {
		return index;
	}

	public void setIndex(JLabel index) {
		this.index = index;
	}

	public JLabel getCity() {
		return city;
	}

	public void setCity(JLabel city) {
		this.city = city;
	}

	public JLabel getInfos() {
		return infos;
	}

	public void setInfos(JLabel infos) {
		this.infos = infos;
	}

	public JTextField getMail_() {
		return mail_;
	}

	public void setMail_(JTextField mail_) {
		this.mail_ = mail_;
	}

	public JTextField getName_() {
		return name_;
	}

	public void setName_(JTextField name_) {
		this.name_ = name_;
	}

	public JTextField getSurname_() {
		return surname_;
	}

	public void setSurname_(JTextField surname_) {
		this.surname_ = surname_;
	}

	public JTextField getStreet_() {
		return street_;
	}

	public void setStreet_(JTextField street_) {
		this.street_ = street_;
	}

	public JTextField getNumber_() {
		return number_;
	}

	public void setNumber_(JTextField number_) {
		this.number_ = number_;
	}

	public JTextField getIndex_() {
		return index_;
	}

	public void setIndex_(JTextField index_) {
		this.index_ = index_;
	}

	public JTextField getCity_() {
		return city_;
	}

	public void setCity_(JTextField city_) {
		this.city_ = city_;
	}

	public ConfirmButton getConfirmButton() {
		return confirmButton;
	}

	public void setConfirmButton(ConfirmButton confirmButton) {
		this.confirmButton = confirmButton;
	}
	
	
}
