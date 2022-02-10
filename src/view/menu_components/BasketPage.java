package view.menu_components;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import view.menu_components.buttons.*;
import view.menu_components.labels.*;
import view.menu_components.listItem.ProductItem;
import view.menu_components.side.SideNews;
import view.menu_components.side.SidePanel;

public class BasketPage extends JPanel{
	private TitelLabel title;
	private SideButton actualize;
	private SideButton back;
	private ConfirmButton purchase;
	private JPanel basketHeader;
	private MyLabel18 basketText;
	private JPanel scrollbase;
	private SidePanel sidePanel;
	private SideNews sideNews;
	
	public BasketPage() {
		this.setLayout(null);
		this.setBounds(0, 0, 1120, 595);
		this.setOpaque(false);
		
		this.setTitle(new TitelLabel("Warenkorb"));
		this.add(this.getTitle());
		
		//Buttons
		this.setBack(new SideButton("Weiter einkaufen"));
		this.getBack().setBounds(516, 0, 135, 22);
		this.setActualize(new SideButton("Aktualisieren"));;
		this.getActualize().setBounds(661, 0, 115, 22);
		this.setPurchase(new ConfirmButton("Zur Kasse"));
		this.getPurchase().setBounds(786, 0, 100, 22);
		
		this.add(this.getBack());
		this.add(this.getActualize());
		this.add(this.getPurchase());
		//Panels
		
		
		this.setBasketHeader(new JPanel());
		this.getBasketHeader().setBounds(0, 31, 886, 35);
		this.getBasketHeader().setLayout(null);
		this.getBasketHeader().setBackground(new Color(0, 102, 102));
		this.add(this.getBasketHeader());
			
		this.setBasketText(new MyLabel18("Einzelpreis                Gesamtpreis"));
		this.getBasketText().setBounds(586, 5, 300, 30);
		this.getBasketHeader().add(this.getBasketText());
		
		
		this.setScrollbase(new JPanel());
		this.getScrollbase().setBounds(0, 66, 886, 494);
		this.getScrollbase().setLayout(null);
		this.add(this.getScrollbase());
		
		JScrollPane spaneHere = new JScrollPane();
		spaneHere.setBounds(0, 0, 886, 494);
		spaneHere.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	//	spaneHere.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		this.getScrollbase().add(spaneHere);
		int numberItems = 10;
		
		JPanel results = new JPanel();
		spaneHere.setViewportView(results);
		results.setLayout(new GridLayout(0, 4, 2, 2));	
	//	results.setLayout(new FlowLayout(FlowLayout.CENTER, 2, 2));
	//	results.setLayout(new BoxLayout());
		
		for(int i = 0; i<numberItems; i++) {
			results.add(new ProductItem());
		}
		
																			//Side Panels
		this.setSidePanel(new SidePanel());
		this.add(this.getSidePanel());
		
		this.setSideNews(new SideNews());
		this.add(this.getSideNews());
		
	}

	public TitelLabel getTitle() {
		return title;
	}

	public void setTitle(TitelLabel title) {
		this.title = title;
	}

	public SideButton getActualize() {
		return actualize;
	}

	public void setActualize(SideButton actualize) {
		this.actualize = actualize;
	}

	public SideButton getBack() {
		return back;
	}

	public void setBack(SideButton back) {
		this.back = back;
	}

	public ConfirmButton getPurchase() {
		return purchase;
	}

	public void setPurchase(ConfirmButton purchase) {
		this.purchase = purchase;
	}

	public JPanel getBasketHeader() {
		return basketHeader;
	}

	public void setBasketHeader(JPanel basketHeader) {
		this.basketHeader = basketHeader;
	}

	public MyLabel18 getBasketText() {
		return basketText;
	}

	public void setBasketText(MyLabel18 basketText) {
		this.basketText = basketText;
	}

	public JPanel getScrollbase() {
		return scrollbase;
	}

	public void setScrollbase(JPanel scrollbase) {
		this.scrollbase = scrollbase;
	}

	public SidePanel getSidePanel() {
		return sidePanel;
	}

	public void setSidePanel(SidePanel sidePanel) {
		this.sidePanel = sidePanel;
	}

	public SideNews getSideNews() {
		return sideNews;
	}

	public void setSideNews(SideNews sideNews) {
		this.sideNews = sideNews;
	}
	
}
