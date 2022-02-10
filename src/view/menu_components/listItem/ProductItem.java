package view.menu_components.listItem;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import view.menu_components.buttons.ConfirmButton;
import view.menu_components.front.ProductPicture;

public class ProductItem extends JPanel{
	private JLabel title;
	private JLabel interpret;
	private JLabel price;
	private ConfirmButton basket;
	private ProductPicture picture;
	
	public ProductItem() {
		this.setPreferredSize(new Dimension(220, 250));
		this.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setLayout(null);
		
		Font f6= new Font("Calibri", Font.BOLD, 14); 
		this.setTitle(new JLabel("Titel"));
		this.getTitle().setBounds(95, 155, 36, 14);
		this.getTitle().setFont(f6);
		this.add(this.getTitle());
		
		this.setInterpret(new JLabel("Interpret"));
		this.getInterpret().setBounds(82, 173, 66, 14);
		this.getInterpret().setFont(f6);
		this.add(this.getInterpret());
		
		this.setPrice(new JLabel("24,90 EUR"));
		this.getPrice().setBounds(79, 189, 66, 23);
		this.getPrice().setFont(f6);
		add(this.getPrice());
		
		this.setBasket(new ConfirmButton("In den Warenkorb"));
		this.getBasket().setBounds(57, 216, 116, 23);
		add(this.getBasket());
		
		
//		
//		lblNewLabel_2.setIcon(new ImageIcon(Product_cut.class.getResource("/images/db.jpg")));
//		ImageIcon disc_u = new ImageIcon(getClass().getResource("/images/db.jpg"));
//		Image disc = disc_u.getImage().getScaledInstance(124, 124, 0);
//		lblNewLabel_2.setIcon(new ImageIcon(disc));
//		lblNewLabel_2.setBounds(49, 23, 124, 124);
//		add(lblNewLabel_2);
//		
	
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

	public JLabel getPrice() {
		return price;
	}

	public void setPrice(JLabel price) {
		this.price = price;
	}

	public ConfirmButton getBasket() {
		return basket;
	}

	public void setBasket(ConfirmButton basket) {
		this.basket = basket;
	}

	public ProductPicture getPicture() {
		return picture;
	}

	public void setPicture(ProductPicture picture) {
		this.picture = picture;
	}
	
	
}
