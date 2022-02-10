package view;

import java.awt.Color;

import javax.swing.JPanel;

import view.menu_components.*;

public class CenterPanel extends JPanel{
	private FirstPage first;
	private GuestPage guest;
	private ProductPage product;
	
	public CenterPanel() {
		this.setLayout(null);
		this.setBounds(140, 240, 1120, 595);
//		this.setBackground(Color.blue);
		this.setOpaque(false);
		
//		this.setFirst(new FirstPage());
//		this.add(this.getFirst());
		
//		this.setGuest(new GuestPage());
//		this.add(this.getGuest());
		
		this.setProduct(new ProductPage());
		this.add(this.getProduct());
			
		
	}

	public FirstPage getFirst() {
		return first;
	}

	public void setFirst(FirstPage first) {
		this.first = first;
	}

	public GuestPage getGuest() {
		return guest;
	}

	public void setGuest(GuestPage guest) {
		this.guest = guest;
	}

	public ProductPage getProduct() {
		return product;
	}

	public void setProduct(ProductPage product) {
		this.product = product;
	}
	
}
