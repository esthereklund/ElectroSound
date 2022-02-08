package view.menu_components;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;

public class FirstPage extends JPanel{
	private Newness news;
	private Specials special;
	private Action action;
	private JTextArea textMain;
	
	public FirstPage() {
		this.setLayout(null);
		this.setBounds(0, 0, 1120, 595);
		this.setOpaque(false);
		
		this.setNews(new Newness());
		this.add(this.getNews());
		
		this.setSpecial(new Specials());
		this.add(this.getSpecial());
		
		this.setAction(new Action());
		this.add(this.getAction());		

		this.setTextMain(new JTextArea());
		this.getTextMain().setBounds(40, 400, 1050, 258);
		this.getTextMain().setForeground(Color.white);
		this.getTextMain().setEditable(false);
		this.getTextMain().setColumns(95);
		this.getTextMain().setLineWrap(true);
		this.getTextMain().setOpaque(false);
		this.getTextMain().setText("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\r\nSed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. ");
		this.add(this.getTextMain());
		

		
	}

	public Newness getNews() {
		return news;
	}

	public void setNews(Newness news) {
		this.news = news;
	}

	public Specials getSpecial() {
		return special;
	}

	public void setSpecial(Specials special) {
		this.special = special;
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	public JTextArea getTextMain() {
		return textMain;
	}

	public void setTextMain(JTextArea textMain) {
		this.textMain = textMain;
	}


	
	
}
