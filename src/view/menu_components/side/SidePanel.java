package view.menu_components.side;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import view.menu_components.buttons.SideButton;
import view.menu_components.labels.MyLabel18;

public class SidePanel extends JPanel{
	private MyLabel18 category;
	private SideButton specials;
	private SideButton ambient;
	private SideButton breakbeat;
	private SideButton downbeat;
	private SideButton house;
	private SideButton industrial;
	private SideButton trance;
	private SideButton techno;
	
	public SidePanel() {
		this.setLayout(new GridLayout(9,1,0,2));
		this.setOpaque(true);
		this.setBounds(920, 31, 200, 267);
		this.setBackground(new Color(0, 102, 102));
		
		this.setCategory(new MyLabel18("KATEGORIEN"));
		this.getCategory().setHorizontalAlignment(SwingConstants.CENTER);
		this.setSpecials(new SideButton("Specials"));
		this.setAmbient(new SideButton("Ambient"));
		this.setBreakbeat(new SideButton("Breakbeat"));
		this.setDownbeat(new SideButton("Downbeat"));
		this.setHouse(new SideButton("House"));
		this.setIndustrial(new SideButton("Industrial"));
		this.setTrance(new SideButton("Trance"));
		this.setTechno(new SideButton("Techno"));
		
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

	public SideButton getSpecials() {
		return specials;
	}

	public void setSpecials(SideButton specials) {
		this.specials = specials;
	}

	public SideButton getAmbient() {
		return ambient;
	}

	public void setAmbient(SideButton ambient) {
		this.ambient = ambient;
	}

	public SideButton getBreakbeat() {
		return breakbeat;
	}

	public void setBreakbeat(SideButton breakbeat) {
		this.breakbeat = breakbeat;
	}

	public SideButton getDownbeat() {
		return downbeat;
	}

	public void setDownbeat(SideButton downbeat) {
		this.downbeat = downbeat;
	}

	public SideButton getHouse() {
		return house;
	}

	public void setHouse(SideButton house) {
		this.house = house;
	}

	public SideButton getIndustrial() {
		return industrial;
	}

	public void setIndustrial(SideButton industrial) {
		this.industrial = industrial;
	}

	public SideButton getTrance() {
		return trance;
	}

	public void setTrance(SideButton trance) {
		this.trance = trance;
	}

	public SideButton getTechno() {
		return techno;
	}

	public void setTechno(SideButton techno) {
		this.techno = techno;
	}
	
	
}
