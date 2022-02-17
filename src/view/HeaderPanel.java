package view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import view.menu_components.*;
import view.menu_components.buttons.ConfirmButton;
import view.menu_components.header.LabelPanel;
import view.menu_components.header.Logo;
import view.menu_components.header.MenuPanel;
import view.menu_components.header.SearchField;
import view.menu_components.header.SmallPanel;
import view.menu_components.header.Vinyl;


public class HeaderPanel extends JPanel {
	private Logo logo;
	private Vinyl vinyl;
	private MenuPanel menuPanel;
	private SmallPanel smallPanel;
	private LabelPanel labelPanel;
	private SearchField search; 
	private JLabel warenkorb;
	private ConfirmButton searchButton;
	
	public HeaderPanel() {

		this.setLayout(null);
		this.setBounds(0, 0, 1400, 400);
		this.setOpaque(false);
		
		//Add logo
		this.setLogo(new Logo());
		this.getLogo().setName("Logo");
		this.add(this.getLogo());
		
		// Add basket
		this.setVinyl(new Vinyl());
		this.getVinyl().setName("Vinyl");
		this.add(this.getVinyl());
		
		//Add menuPanel
		this.setMenuPanel(new MenuPanel());
		this.add(this.getMenuPanel());
		
		//Add submenuPanel
		this.setSmallPanel(new SmallPanel());
		this.add(this.getSmallPanel());
		
		//Add Links
		this.setLabelPanel(new LabelPanel());
		this.add(this.getLabelPanel());
		
		//Add Search field
		this.setSearch(new SearchField());
		this.add(this.getSearch());

		this.setSearchButton(new ConfirmButton("Suche"));
		this.getSearchButton().setBounds(960, 120, 70, 25);
		this.add(this.getSearchButton());
	}

	public Logo getLogo() {
		return logo;
	}

	public void setLogo(Logo logo) {
		this.logo = logo;
	}

	public Vinyl getVinyl() {
		return vinyl;
	}

	public void setVinyl(Vinyl vinyl) {
		this.vinyl = vinyl;
	}

	public MenuPanel getMenuPanel() {
		return menuPanel;
	}

	public void setMenuPanel(MenuPanel menuPanel) {
		this.menuPanel = menuPanel;
	}

	public SmallPanel getSmallPanel() {
		return smallPanel;
	}

	public void setSmallPanel(SmallPanel smallPanel) {
		this.smallPanel = smallPanel;
	}

	public LabelPanel getLabelPanel() {
		return labelPanel;
	}

	public void setLabelPanel(LabelPanel labelPanel) {
		this.labelPanel = labelPanel;
	}

	public SearchField getSearch() {
		return search;
	}

	public void setSearch(SearchField search) {
		this.search = search;
	}

	public JLabel getWarenkorb() {
		return warenkorb;
	}

	public void setWarenkorb(JLabel warenkorb) {
		this.warenkorb = warenkorb;
	}

	public ConfirmButton getSearchButton() {
		return searchButton;
	}

	public void setSearchButton(ConfirmButton searchButton) {
		this.searchButton = searchButton;
	}


	
	
}
