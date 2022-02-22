package view.menu_components.listItem;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

import view.menu_components.buttons.ConfirmButton;
import view.menu_components.front.ProductPicture;

public class ProductItem extends JPanel{
	private JLabel title;
	private JLabel interpret;
	private JLabel price;
	private ConfirmButton basket;
	private JLabel picture;

	//Parameterloser Konstruktor von Produkt Panel
	public ProductItem() {
		this.setPreferredSize(new Dimension(220, 250));
		this.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		this.setLayout(null);
		
		Font f6= new Font("Calibri", Font.BOLD, 14); 
		this.setTitle(new JLabel(""));
		this.getTitle().setBounds(0, 180, 220, 14);
		this.getTitle().setHorizontalAlignment(SwingConstants.CENTER);
		this.getTitle().setFont(f6);
		this.add(this.getTitle());
		
		this.setInterpret(new JLabel(""));
		this.getInterpret().setBounds(82, 200, 220, 14);
		this.getInterpret().setFont(f6);
		this.add(this.getInterpret());
		
		this.setPrice(new JLabel(""));
		this.getPrice().setBounds(0, 210, 220, 23);
		this.getPrice().setHorizontalAlignment(SwingConstants.CENTER);
		this.getPrice().setFont(f6);
		add(this.getPrice());
		
		this.setBasket(new ConfirmButton("Kaufen"));
		this.getBasket().setBounds(67, 230, 85, 20);
		add(this.getBasket());
		
		this.setPicture(new JLabel());
		this.getPicture().setBounds(35, 20, 150, 150);
		add(this.getPicture());
	}
	//Konstruktor vom Produkt mit Parametern
	public ProductItem(int cdId, String titleText, double priceText){
		this();
		this.getTitle().setText(titleText);
		this.getPrice().setText(""+priceText);
			
	}
	
	public ProductItem(ImageIcon picture, int cdId, String titleText, double priceText){
		this();
		this.getPicture().setIcon(picture);
		this.getTitle().setText(titleText);
		this.getPrice().setText(""+priceText);
			
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

	public JLabel getPicture() {
		return picture;
	}

	public void setPicture(JLabel picture) {
		this.picture = picture;
	}

	
	
}
