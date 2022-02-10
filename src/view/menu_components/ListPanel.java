package view.menu_components;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JPanel;

import view.menu_components.front.ProductPicture;
import view.menu_components.labels.MyLabel18;
import view.menu_components.labels.TitelLabel;
import view.menu_components.listItem.ProductItem;
import view.menu_components.side.SideNews;
import view.menu_components.side.SidePanel;

public class ListPanel extends JPanel{
	private SidePanel sidePanel;
	private SideNews sideNews;
	private TitelLabel title;
	private JPanel scrollbase;

	
	public ListPanel() {
		this.setLayout(null);
		this.setBounds(0, 0, 1120, 595);
		this.setOpaque(false);
		
		this.setTitle(new TitelLabel("Neue Produkte"));
		this.add(this.getTitle());
		
		this.setScrollbase(new JPanel());
		this.getScrollbase().setBounds(10, 31, 835, 529);
//		this.setOpaque(true);
		this.getScrollbase().setLayout(null);
		this.add(this.getScrollbase());
		
		JScrollPane spaneHere = new JScrollPane();
		spaneHere.setBounds(0, 0, 835, 529);
		this.getScrollbase().add(spaneHere);
		int numberItems = 4;
		
		JPanel results = new JPanel();
		spaneHere.setViewportView(results);
		results.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));		
		
		for(int i = 0; i<numberItems; i++) {
			results.add(new ProductItem());
		}
		
																			//Side Panels
		this.setSidePanel(new SidePanel());
		this.add(this.getSidePanel());
		
		this.setSideNews(new SideNews());
		this.add(this.getSideNews());
	
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

	public TitelLabel getTitle() {
		return title;
	}

	public void setTitle(TitelLabel title) {
		this.title = title;
	}

	public JPanel getScrollbase() {
		return scrollbase;
	}

	public void setScrollbase(JPanel scrollbase) {
		this.scrollbase = scrollbase;
	}


	
}
