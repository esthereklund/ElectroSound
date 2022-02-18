package view.menu_components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import model.data.Cd;
import model.interfaces.Article;

import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
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
	private JComboBox combobox;
	
	private JPanel scrollbase;
	private List<ProductItem> results;
	private JPanel cdList;
	
	public ListPanel() {
		this.setLayout(null);
		this.setBounds(0, 0, 1120, 595);
		this.setOpaque(false);
		
		this.setTitle(new TitelLabel(""));
//		this.getCenterPanel().getListPanel().getTitle().setText((this.getUpperPanel().getMenuPanel().getSpecials().getName()));

		this.add(this.getTitle());
		
		this.setCombobox(new JComboBox());
		this.getCombobox().setModel(new DefaultComboBoxModel(new String[] {"Preis aufsteigend", "Preis absteigend", "Titel aufsteigend", "Titel absteigend", "Artikel aufsteigend", "Artikel absteigend"}));
		this.getCombobox().setBounds(731,0, 155, 22);
		this.add(this.getCombobox());
		
		this.setScrollbase(new JPanel());
		this.getScrollbase().setBounds(0, 31, 886, 529);
		this.getScrollbase().setLayout(null);
		this.getScrollbase().setOpaque(false);
		this.add(this.getScrollbase());

		
		JScrollPane spane = new JScrollPane();
		spane.setBounds(0, 0, 886, 529);
		spane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
//		spane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
		this.getScrollbase().add(spane);	
		this.setResults(new ArrayList<>());


		this.setCdList(new JPanel());
		spane.setViewportView(this.getCdList());

//		results.setLayout(new FlowLayout(FlowLayout.CENTER, 2, 2));

		
																			//Side Panels
		this.setSidePanel(new SidePanel());
		this.add(this.getSidePanel());
		
		this.setSideNews(new SideNews());
		this.add(this.getSideNews());
	
	}
	
	public void displayResults(List<Article> list) {
		this.getResults().clear();
		System.out.println("all clear");
		list.forEach((Article a)-> this.getResults().add(
				new ProductItem(a.getArticleId(), a.getArticleTitle(), a.getArticlePrice())));
		this.getCdList().removeAll();
		
		this.getCdList().setLayout(new GridLayout(0, 4));	
		this.getResults().forEach((ProductItem res)->this.getCdList().add(res));
		this.repaint();
	}
	
	public void alAddToBasket(ActionListener al) {
		this.getResults().forEach(r->r.getBasket().addActionListener(al));
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

	public JComboBox getCombobox() {
		return combobox;
	}

	public void setCombobox(JComboBox combobox) {
		this.combobox = combobox;
	}

	public List<ProductItem> getResults() {
		return results;
	}

	public void setResults(List<ProductItem> results) {
		this.results = results;
	}

	public JPanel getCdList() {
		return cdList;
	}

	public void setCdList(JPanel cdList) {
		this.cdList = cdList;
	}
	

	
}
