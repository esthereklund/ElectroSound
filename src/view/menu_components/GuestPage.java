package view.menu_components;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GuestPage extends JPanel{
	private TitelLabel title;
	private JPanel formular;
	private JPanel formularTitle;
	private MyLabel18 formularTextTitle;
	private JTextArea welcomeText;
	
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
	
	private YelButton confirmButton;
	
	public GuestPage() {
		this.setLayout(null);
		this.setBounds(0, 0, 1120, 595);
		this.setOpaque(false);
		
		this.setTitle(new TitelLabel("Ich möchte als Gast bestellen"));
		this.add(this.getTitle());
		
		this.setFormular(new JPanel());
		this.getFormular().setLayout(null);
		this.getFormular().setBounds(0, 40, 1120, 500);
		this.add(this.getFormular());
		
		this.setFormularTitle(new JPanel());
		this.getFormularTitle().setBounds(0,  0, 1120, 35);
		this.getFormularTitle().setLayout(null);
		this.getFormularTitle().setBackground(new Color(0, 102, 102));
		this.getFormular().add(this.getFormularTitle());
			
		this.setFormularTextTitle(new MyLabel18("Füllen Sie bitte das Formular aus"));
		this.getFormularTextTitle().setBounds(10, 5, 300, 30);
		this.getFormularTitle().add(this.getFormularTextTitle());
		
		this.setWelcomeText(new JTextArea());
		this.getWelcomeText().setBounds(80, 60, 960, 68);
		this.getWelcomeText().setEditable(false);
		this.getWelcomeText().setLineWrap(true);
		this.getWelcomeText().setText("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\r\nSed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. ");
		this.getFormular().add(this.getWelcomeText());
		
		
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
		
		this.getFormular().add(this.getMail());
		this.getFormular().add(this.getGName());
		this.getFormular().add(this.getSurname());
		this.getFormular().add(this.getStreet());
		this.getFormular().add(this.getNumber());
		this.getFormular().add(this.getIndex());
		this.getFormular().add(this.getCity());
		
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
		
		this.getFormular().add(this.getMail_());
		this.getFormular().add(this.getName_());
		this.getFormular().add(this.getSurname_());
		this.getFormular().add(this.getStreet_());
		this.getFormular().add(this.getNumber_());
		this.getFormular().add(this.getIndex_());
		this.getFormular().add(this.getCity_());
		
		this.setConfirmButton(new YelButton("Verbindlich bestellen"));
		this.getConfirmButton().setBounds(750, 380, 160, 35);
		this.getFormular().add(this.getConfirmButton());
	}

	public TitelLabel getTitle() {
		return title;
	}

	public void setTitle(TitelLabel title) {
		this.title = title;
	}

	public JPanel getFormular() {
		return formular;
	}

	public void setFormular(JPanel formular) {
		this.formular = formular;
	}

	public JPanel getFormularTitle() {
		return formularTitle;
	}

	public void setFormularTitle(JPanel formularTitle) {
		this.formularTitle = formularTitle;
	}

	public MyLabel18 getFormularTextTitle() {
		return formularTextTitle;
	}

	public void setFormularTextTitle(MyLabel18 formularTextTitle) {
		this.formularTextTitle = formularTextTitle;
	}

	public JTextArea getWelcomeText() {
		return welcomeText;
	}

	public void setWelcomeText(JTextArea welcomeText) {
		this.welcomeText = welcomeText;
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

	public YelButton getConfirmButton() {
		return confirmButton;
	}

	public void setConfirmButton(YelButton confirmButton) {
		this.confirmButton = confirmButton;
	}
	
	
}
