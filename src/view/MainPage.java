package view;

import java.awt.*;

import javax.swing.*;


public class MainPage extends JFrame{
	MainPage(){
		JLabel backGround;
		setSize(1400, 1010);
		setResizable(false);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		ImageIcon img = new ImageIcon(getClass().getResource("/images/night.jpg"));
		backGround = new JLabel("", img, JLabel.CENTER);
		setContentPane(backGround);
		
		setVisible(true);
	}
	
	public static void main(String args[]) {
		
		new MainPage();
	}
	
	
	
}	

