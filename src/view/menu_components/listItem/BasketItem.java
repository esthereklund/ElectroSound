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
import javax.swing.border.BevelBorder;

public class BasketItem extends JPanel{
	private JLabel picture;
	private JLabel title;
	private JLabel interpret;
	private JLabel article;
	private JLabel lieferzeit;
	private JButton trash;
	private JLabel price;
	private JLabel total;
	private JComboBox number; 
	
	public BasketItem() {
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
		
		this.setPrice(new JLabel("24,90"));
		this.getPrice().setBounds(651, 53, 46, 20);
		this.getPrice().setFont(f1);
		add(this.getPrice());
		
		this.setTotal(new JLabel("49,80"));
		this.getTotal().setBounds(757, 53, 46, 20);
		this.getTotal().setFont(f1);
		add(this.getTotal());
		
		this.setNumber(new JComboBox());
		this.getNumber().setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		this.getNumber().setBounds(455, 51, 46, 22);
		add(this.getNumber());
	}

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

	public JComboBox getNumber() {
		return number;
	}

	public void setNumber(JComboBox number) {
		this.number = number;
	}
	
	
}
