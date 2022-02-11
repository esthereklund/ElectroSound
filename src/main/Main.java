package main;

import java.awt.EventQueue;

import controller.MainController;
import view.MainPage;

public class Main {

	public static void main(String args[]) {
		EventQueue.invokeLater(()->
		new MainController());
	}
}
