package view.menu_components;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.ScrollPaneConstants;

import view.menu_components.buttons.*;
import view.menu_components.labels.*;
import view.menu_components.listItem.BasketItem;
import view.menu_components.listItem.ProductItem;
import view.menu_components.side.SideNews;
import view.menu_components.side.SidePanel;

public class BasketPage extends JPanel{
	
	private SideButton actualize;
	private SideButton back;
	private ConfirmButton purchase;
	
	private MyLabel18 basketText;
	private JPanel scrollbase;
	private SidePanel sidePanel;
	private SideNews sideNews;
	private JLabel totalCalc;
	private JLabel mwstCalc;
	private JLabel numberCalc;
	public BasketPage() {
		this.setLayout(null);
		this.setBounds(0, 0, 1120, 595);
		this.setOpaque(false);
		
		TitelLabel title = new TitelLabel("Warenkorb");
		this.add(title);
		
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
		
		JPanel basketHeader= new JPanel();
		basketHeader.setBounds(0, 31, 886, 35);
		basketHeader.setLayout(null);
		basketHeader.setBackground(new Color(0, 102, 102));
		this.add(basketHeader);
			
		MyLabel18 basketText = new MyLabel18("Einzelpreis        Gesamtpreis");
		basketText.setBounds(630, 5, 300, 30);
		basketHeader.add(basketText);
		
		
		this.setScrollbase(new JPanel());
		this.getScrollbase().setBounds(0, 66, 886, 394);
		this.getScrollbase().setLayout(null);
		this.add(this.getScrollbase());
		
		JScrollPane spaneHere = new JScrollPane();
		spaneHere.setBounds(0, 0, 886, 394);
		spaneHere.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	//	spaneHere.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		this.getScrollbase().add(spaneHere);
		
		int numberItems = 3;
		
		JPanel results = new JPanel();
		spaneHere.setViewportView(results);
		results.setLayout(new GridLayout(0, 1, 0, 3));	
	//	results.setLayout(new FlowLayout(FlowLayout.CENTER, 2, 2));
	//	results.setLayout(new BoxLayout());
		
		for(int i = 0; i<numberItems; i++) {
			results.add(new BasketItem());
		}
		
		JPanel totalPanel = new JPanel();
		totalPanel.setBounds(0, 494, 886, 93);
		this.add(totalPanel);
		totalPanel.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(33, 33, 826, 8);
		totalPanel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(33, 66, 826, 8);
		totalPanel.add(separator_1);
		
		JLabel lblNewLabel_18 = new JLabel("Gesamtbetrag");
		lblNewLabel_18.setBounds(629, 11, 100, 18);
		totalPanel.add(lblNewLabel_18);
		
		JLabel mwst = new JLabel("inkl. MwSt 19%");
		mwst.setBounds(629, 45, 100, 14);
		mwst.setFont(new Font("Calibri", Font.TRUETYPE_FONT, 12));
		totalPanel.add(mwst);
		
		JLabel lblNewLabel_20 = new JLabel("Anzahl");
		lblNewLabel_20.setBounds(629, 70, 100, 18);
		totalPanel.add(lblNewLabel_20);
		
		this.setTotalCalc(new JLabel("50 EUR"));
		this.getTotalCalc().setBounds(770, 12, 50, 18);
		this.getTotalCalc().setFont(new Font("Calibri", Font.BOLD, 16));
		totalPanel.add(this.getTotalCalc());
		
		this.setMwstCalc(new JLabel("5,8 EUR"));
		this.getMwstCalc().setBounds(770, 41, 50, 18);
		totalPanel.add(this.getMwstCalc());
		
		this.setNumberCalc(new JLabel("6"));
		this.getNumberCalc().setBounds(770, 72, 50, 18);
		this.getNumberCalc().setFont(new Font("Calibri", Font.BOLD, 16));
		totalPanel.add(this.getNumberCalc());
		
		//Side Panels
		this.setSidePanel(new SidePanel());
		this.add(this.getSidePanel());
		
		this.setSideNews(new SideNews());
		this.add(this.getSideNews());
		
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

	public JLabel getTotalCalc() {
		return totalCalc;
	}

	public void setTotalCalc(JLabel totalCalc) {
		this.totalCalc = totalCalc;
	}
	
	public JLabel getMwstCalc() {
		return mwstCalc;
	}

	public void setMwstCalc(JLabel mwstCalc) {
		this.mwstCalc = mwstCalc;
	}



	public JLabel getNumberCalc() {
		return numberCalc;
	}

	public void setNumberCalc(JLabel numberCalc) {
		this.numberCalc = numberCalc;
	}
	
}
