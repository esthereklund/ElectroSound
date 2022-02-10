package view.menu_components;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import view.menu_components.buttons.ConfirmButton;
import view.menu_components.front.ProductPicture;
import view.menu_components.labels.*;
import view.menu_components.side.SidePanel;
import view.menu_components.side.SideNews;

public class ProductPage extends JPanel{
	private ProductPicture productPicture;
	private JPanel productDetails;
	private JPanel productDescription;
	private SidePanel categoryButtons;
	private SideNews newness;
	private JPanel title;
	private MyLabel18 titleText;
	private JLabel productTitle;
	private JLabel productPrice;
	private MyLabel18b interpret;
	private MyLabel16b genre;
	private MyLabel12 steuer;
	private JLabel lieferZeit;
	private ConfirmButton buy;
	
	private JTextArea description;
	
	public ProductPage() {
		this.setLayout(null);
		this.setBounds(0, 0, 1120, 595);
		this.setOpaque(false);
																			//Product Picture Panel
		this.setProductPicture(new ProductPicture("/images/product.jpg"));
		this.getProductPicture().setBounds(10, 31, 267, 267);
		this.getProductPicture().setLayout(new GridLayout(0,1,0,0));
		this.getProductPicture().setOpaque(true);
		this.add(this.getProductPicture());
																			//Product Details Panel
		this.setProductDetails(new JPanel());
		this.getProductDetails().setLayout(null);
		this.getProductDetails().setBounds(330, 31, 515, 267);
		this.getProductDetails().setOpaque(true);
		this.add(this.getProductDetails());
																			//Product Description Panel
		this.setProductDescription(new JPanel());
		this.getProductDescription().setLayout(null);
		this.getProductDescription().setBounds(10, 329, 835, 200);
		this.getProductDescription().setOpaque(true);
		this.add(this.getProductDescription());
		
		this.setTitle(new JPanel());
		this.getTitle().setBounds(0,  0, 1120, 35);
		this.getTitle().setLayout(null);
		this.getTitle().setBackground(new Color(0, 102, 102));
		this.getProductDescription().add(this.getTitle());
			
		this.setTitleText(new MyLabel18("Produktbeschreibung"));
		this.getTitleText().setBounds(10, 5, 300, 30);
		this.getTitle().add(this.getTitleText());		
		
		
																			//Side Panels
		this.setCategoryButtons(new SidePanel());
		this.add(this.getCategoryButtons());
		
		this.setNewness(new SideNews());
		this.add(this.getNewness());
	
		
																			//Product Details Contents
		this.setProductTitle(new JLabel("Open Space"));
		this.getProductTitle().setFont(new Font("Calibri", Font.BOLD, 22));
		this.getProductTitle().setBounds(20, 20, 300, 25);
		this.setProductPrice(new JLabel("24,90 EUR"));
		this.getProductPrice().setFont(new Font("Calibri", Font.BOLD, 20));
		this.getProductPrice().setBounds(20, 60, 300, 25);		
		this.setInterpret(new MyLabel18b("Len Faki"));
		this.getInterpret().setBounds(20, 100, 300, 25);
		this.setGenre(new MyLabel16b("Progressive Techno"));
		this.getGenre().setBounds(20, 120, 300, 25);		
		this.setSteuer(new MyLabel12());
		this.getSteuer().setText("inkl. 19% MwSt");
		this.getSteuer().setBounds(20, 160, 300, 25);
		this.setLieferZeit(new JLabel("Lieferzeit 1-2 Tage"));
		this.getLieferZeit().setBounds(20, 180, 300, 25);
		this.setBuy(new ConfirmButton("In den Warenkorb"));
		this.getBuy().setBounds(20, 220, 200, 25);	
		this.getProductDetails().add(this.getProductTitle());
		this.getProductDetails().add(this.getProductPrice());
		this.getProductDetails().add(this.getInterpret());
		this.getProductDetails().add(this.getGenre());
		this.getProductDetails().add(this.getSteuer());
		this.getProductDetails().add(this.getLieferZeit());
		this.getProductDetails().add(this.getBuy());
		

																			//Product Description Contents
		this.setDescription(new JTextArea());
		this.getDescription().setBounds(10, 45, 815, 155);
		this.getDescription().setEditable(false);
		this.getDescription().setLineWrap(true);
		this.getDescription().setText("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\r\nSed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. ");
		this.getProductDescription().add(this.getDescription());
		
	}

	public ProductPicture getProductPicture() {
		return productPicture;
	}

	public void setProductPicture(ProductPicture productPicture) {
		this.productPicture = productPicture;
	}

	public JPanel getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(JPanel productDetails) {
		this.productDetails = productDetails;
	}

	public JPanel getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(JPanel productDescription) {
		this.productDescription = productDescription;
	}

	public SidePanel getCategoryButtons() {
		return categoryButtons;
	}

	public void setCategoryButtons(SidePanel categoryButtons) {
		this.categoryButtons = categoryButtons;
	}

	public SideNews getNewness() {
		return newness;
	}

	public void setNewness(SideNews newness) {
		this.newness = newness;
	}

	public JPanel getTitle() {
		return title;
	}

	public void setTitle(JPanel title) {
		this.title = title;
	}

	public MyLabel18 getTitleText() {
		return titleText;
	}

	public void setTitleText(MyLabel18 titleText) {
		this.titleText = titleText;
	}

	public JLabel getProductTitle() {
		return productTitle;
	}

	public void setProductTitle(JLabel productTitle) {
		this.productTitle = productTitle;
	}

	public JLabel getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(JLabel productPrice) {
		this.productPrice = productPrice;
	}

	public MyLabel18b getInterpret() {
		return interpret;
	}

	public void setInterpret(MyLabel18b interpret) {
		this.interpret = interpret;
	}

	public MyLabel16b getGenre() {
		return genre;
	}

	public void setGenre(MyLabel16b genre) {
		this.genre = genre;
	}

	public MyLabel12 getSteuer() {
		return steuer;
	}

	public void setSteuer(MyLabel12 steuer) {
		this.steuer = steuer;
	}

	public JLabel getLieferZeit() {
		return lieferZeit;
	}

	public void setLieferZeit(JLabel lieferZeit) {
		this.lieferZeit = lieferZeit;
	}

	public ConfirmButton getBuy() {
		return buy;
	}

	public void setBuy(ConfirmButton buy) {
		this.buy = buy;
	}

	public JTextArea getDescription() {
		return description;
	}

	public void setDescription(JTextArea description) {
		this.description = description;
	} 
	
}
