package view.menu_components;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ProductPage extends JPanel{
	private ProductPicture productPicture;
	private JPanel productDetails;
	private JPanel productDescription;
	private CategoryButtons categoryButtons;
	private SidePanel newness;
	private JPanel title;
	private MyLabel18 titleText;
	
	public ProductPage() {
		this.setLayout(null);
		this.setBounds(0, 0, 1120, 595);
		this.setOpaque(false);

		this.setProductPicture(new ProductPicture("/images/product.jpg"));
		this.getProductPicture().setBounds(10, 31, 267, 267);
		this.getProductPicture().setLayout(null);
		this.getProductPicture().setOpaque(true);
		this.add(this.getProductPicture());
		
		this.setProductDetails(new JPanel());
		this.getProductDetails().setLayout(null);
		this.getProductDetails().setBounds(330, 31, 515, 267);
		this.getProductDetails().setOpaque(true);
		this.add(this.getProductDetails());
		
		this.setProductDescription(new JPanel());
		this.getProductDescription().setLayout(null);
		this.getProductDescription().setBounds(10, 329, 835, 200);
		this.getProductDescription().setOpaque(true);
		this.add(this.getProductDescription());
		
		this.setCategoryButtons(new CategoryButtons());
		this.add(this.getCategoryButtons());
		
		this.setNewness(new SidePanel());
		this.add(this.getNewness());
	
	
		this.setTitle(new JPanel());
		this.getTitle().setBounds(0,  0, 1120, 35);
		this.getTitle().setLayout(null);
		this.getTitle().setBackground(new Color(0, 102, 102));
		this.getProductDescription().add(this.getTitle());
			
		this.setTitleText(new MyLabel18("Produktbeschreibung"));
		this.getTitleText().setBounds(10, 5, 300, 30);
		this.getTitle().add(this.getTitleText());
		
//		this.setWelcomeText(new JTextArea());
//		this.getWelcomeText().setBounds(80, 60, 960, 68);
//		this.getWelcomeText().setEditable(false);
//		this.getWelcomeText().setLineWrap(true);
//		this.getWelcomeText().setText("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\r\nSed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. ");
//		this.getFormular().add(this.getWelcomeText());
//		
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

	public CategoryButtons getCategoryButtons() {
		return categoryButtons;
	}

	public void setCategoryButtons(CategoryButtons categoryButtons) {
		this.categoryButtons = categoryButtons;
	}

	public SidePanel getNewness() {
		return newness;
	}

	public void setNewness(SidePanel newness) {
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
	
}
