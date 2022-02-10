package view.menu_components;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class CategoryButtons extends JPanel{
	private MyLabel18 category;
	private ButtonKat specials;
	private ButtonKat ambient;
	private ButtonKat breakbeat;
	private ButtonKat downbeat;
	private ButtonKat house;
	private ButtonKat industrial;
	private ButtonKat trance;
	private ButtonKat techno;
	
	public CategoryButtons() {
		this.setLayout(new GridLayout(9,1,0,2));
		this.setOpaque(true);
		this.setBounds(920, 31, 200, 267);
		this.setBackground(new Color(0, 102, 102));
		
		this.setCategory(new MyLabel18("KATEGORIEN"));
		this.getCategory().setHorizontalAlignment(SwingConstants.CENTER);
		this.setSpecials(new ButtonKat("Specials"));
		this.setAmbient(new ButtonKat("Ambient"));
		this.setBreakbeat(new ButtonKat("Breakbeat"));
		this.setDownbeat(new ButtonKat("Downbeat"));
		this.setHouse(new ButtonKat("House"));
		this.setIndustrial(new ButtonKat("Industrial"));
		this.setTrance(new ButtonKat("Trance"));
		this.setTechno(new ButtonKat("Techno"));
		
		this.add(this.getCategory());
		this.add(this.getSpecials());
		this.add(this.getAmbient());
		this.add(this.getBreakbeat());
		this.add(this.getDownbeat());
		this.add(this.getHouse());
		this.add(this.getIndustrial());
		this.add(this.getTrance());
		this.add(this.getTechno());
	}

	public MyLabel18 getCategory() {
		return category;
	}

	public void setCategory(MyLabel18 category) {
		this.category = category;
	}

	public ButtonKat getSpecials() {
		return specials;
	}

	public void setSpecials(ButtonKat specials) {
		this.specials = specials;
	}

	public ButtonKat getAmbient() {
		return ambient;
	}

	public void setAmbient(ButtonKat ambient) {
		this.ambient = ambient;
	}

	public ButtonKat getBreakbeat() {
		return breakbeat;
	}

	public void setBreakbeat(ButtonKat breakbeat) {
		this.breakbeat = breakbeat;
	}

	public ButtonKat getDownbeat() {
		return downbeat;
	}

	public void setDownbeat(ButtonKat downbeat) {
		this.downbeat = downbeat;
	}

	public ButtonKat getHouse() {
		return house;
	}

	public void setHouse(ButtonKat house) {
		this.house = house;
	}

	public ButtonKat getIndustrial() {
		return industrial;
	}

	public void setIndustrial(ButtonKat industrial) {
		this.industrial = industrial;
	}

	public ButtonKat getTrance() {
		return trance;
	}

	public void setTrance(ButtonKat trance) {
		this.trance = trance;
	}

	public ButtonKat getTechno() {
		return techno;
	}

	public void setTechno(ButtonKat techno) {
		this.techno = techno;
	}
	
	
}
