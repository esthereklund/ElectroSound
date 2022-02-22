package view.menu_components.listItem;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.BevelBorder;

public class BasketPanelItem extends JPanel{
	private JLabel picture;
	private JLabel title;
	private JLabel interpret;
	private JLabel article;
	private JLabel lieferzeit;
	private JButton trash;
	private JLabel price;
	private JLabel total;
	private JSpinner number; 
	
	//Konstruktor Paremeterlos
	public BasketPanelItem() {
		Font f1 = new Font("Calibri", Font.BOLD, 18);
		Font f2 = new Font("Calibri", Font.BOLD, 16);
		Font f3 = new Font("Calibri", Font.PLAIN, 12);
		
		this.setPreferredSize(new Dimension(900, 180));
		this.setLayout(null);
		this.setBounds(0,0,900,170);
		this.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
//		JLabel lblNewLabel = new JLabel();
//		ImageIcon cd_u = new ImageIcon(getClass().getResource("/images/product.jpg"));
//		Image cd = cd_u.getImage().getScaledInstance(135, 135, 0);
//		lblNewLabel.setIcon(new ImageIcon(cd));
//		lblNewLabel.setBounds(27, 22, 135, 135);
//		add(lblNewLabel);
		
		this.setTitle(new JLabel("Open Space"));
		this.getTitle().setBounds(195, 30, 100, 20);
		this.getTitle().setFont(f1);
		add(this.getTitle());
		
		this.setInterpret(new JLabel("Len Faki"));
		this.getInterpret().setBounds(195, 54, 80, 20);
		this.getInterpret().setFont(f2);
		add(this.getInterpret());
		
		this.setArticle(new JLabel("Art. Nr. 123"));
		this.getArticle().setBounds(195, 110, 80, 20);
		add(this.getArticle());
		
		this.setLieferzeit(new JLabel("Lieferzeit 1-2 Tage"));
		this.getLieferzeit().setFont(f3);
		this.getLieferzeit().setBounds(195, 130, 120, 20);
		add(this.getLieferzeit());
		
		this.setTrash(new JButton());
		this.getTrash().setIcon(new ImageIcon(new ImageIcon(this.getClass().getResource("/images/trash.png")).getImage().getScaledInstance(13, 21, 0)));
		this.getTrash().setBounds(560, 43, 35, 31);
		add(this.getTrash());
		
		this.setPrice(new JLabel(""));
		this.getPrice().setBounds(651, 53, 46, 20);
		this.getPrice().setFont(f1);
		add(this.getPrice());
		
		this.setTotal(new JLabel(""));
		this.getTotal().setBounds(757, 53, 46, 20);
		this.getTotal().setFont(f1);
		add(this.getTotal());
																	//Spinner
		this.setNumber(new JSpinner());
		SpinnerModel model = new SpinnerNumberModel(1, 0, 10, 1); 
		this.getNumber().setBounds(455, 51, 46, 22);
		this.getNumber().setModel(model);
		add(this.getNumber());
		
		this.setPicture(new JLabel());
		this.getPicture().setBounds(20, 20, 150, 150);
		this.add(this.getPicture());
	}
	
	//Konstruktor BasketPanel Item mit Parametern
	public BasketPanelItem(String title, double price) {
		this();
		this.getTitle().setText(title);
		this.getPrice().setText(""+price);
	}
	
	public BasketPanelItem(ImageIcon icon, String title, double price) {
		this();
		this.getPicture().setIcon(icon);
		this.getTitle().setText(title);
		this.getPrice().setText(""+price);
	}
	
	//GETTER, SETTER
	public JLabel getPicture() {
		return picture;
	}

	public void setPicture(JLabel picture) {
		this.picture = picture;
	}

	public JLabel getTitle() {
		return title;
	}

	public void setTitle(JLabel title) {
		this.title = title;
	}

	public JLabel getInterpret() {
		return interpret;
	}

	public void setInterpret(JLabel interpret) {
		this.interpret = interpret;
	}

	public JLabel getArticle() {
		return article;
	}

	public void setArticle(JLabel article) {
		this.article = article;
	}

	public JLabel getLieferzeit() {
		return lieferzeit;
	}

	public void setLieferzeit(JLabel lieferzeit) {
		this.lieferzeit = lieferzeit;
	}

	public JButton getTrash() {
		return trash;
	}

	public void setTrash(JButton trash) {
		this.trash = trash;
	}

	public JLabel getPrice() {
		return price;
	}

	public void setPrice(JLabel price) {
		this.price = price;
	}

	public JLabel getTotal() {
		return total;
	}

	public void setTotal(JLabel total) {
		this.total = total;
	}

	public JSpinner getNumber() {
		return number;
	}

	public void setNumber(JSpinner number) {
		this.number = number;
	}
	
	
}
