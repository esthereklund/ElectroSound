package view.menu_components.header;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import view.menu_components.buttons.MenuButton;

public class MenuPanel extends JPanel{

	private Color petrol; 
	private MenuButton specials;
	private MenuButton ambient;
	private MenuButton breakbeat;
	private MenuButton downbeat;
	private MenuButton house;
	private MenuButton industrial;
	private MenuButton trance;
	private MenuButton techno;
	
	public MenuPanel(){
		
		this.setBounds(0, 150, 1400, 60);
		this.setPetrol(new Color(0, 102, 102));
		this.setBackground(petrol);
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 20));
		
		this.setSpecials(new MenuButton("Specials"));
		this.getSpecials().setName("Specials");
		this.setAmbient(new MenuButton("Ambient"));
		this.setBreakbeat(new MenuButton("Breakbeat"));
		this.setDownbeat(new MenuButton("Downbeat"));
		this.setHouse(new MenuButton("House"));
		this.setIndustrial(new MenuButton("Industrial"));
		this.setTrance(new MenuButton("Trance"));
		this.setTechno(new MenuButton("Techno"));	
		
		this.add(this.getSpecials());
		this.add(this.getAmbient());
		this.add(this.getBreakbeat());
		this.add(this.getDownbeat());
		this.add(this.getHouse());
		this.add(this.getIndustrial());
		this.add(this.getTrance());
		this.add(this.getTechno());
		
	}

	public Color getPetrol() {
		return petrol;
	}

	public void setPetrol(Color petrol) {
		this.petrol = petrol;
	}

	public MenuButton getSpecials() {
		return specials;
	}

	public void setSpecials(MenuButton specials) {
		this.specials = specials;
	}

	public MenuButton getAmbient() {
		return ambient;
	}

	public void setAmbient(MenuButton ambient) {
		this.ambient = ambient;
	}

	public MenuButton getBreakbeat() {
		return breakbeat;
	}

	public void setBreakbeat(MenuButton breakbeat) {
		this.breakbeat = breakbeat;
	}

	public MenuButton getDownbeat() {
		return downbeat;
	}

	public void setDownbeat(MenuButton downbeat) {
		this.downbeat = downbeat;
	}

	public MenuButton getHouse() {
		return house;
	}

	public void setHouse(MenuButton house) {
		this.house = house;
	}

	public MenuButton getIndustrial() {
		return industrial;
	}

	public void setIndustrial(MenuButton industrial) {
		this.industrial = industrial;
	}

	public MenuButton getTrance() {
		return trance;
	}

	public void setTrance(MenuButton trance) {
		this.trance = trance;
	}

	public MenuButton getTechno() {
		return techno;
	}

	public void setTechno(MenuButton techno) {
		this.techno = techno;
	}
	
	
	
}
