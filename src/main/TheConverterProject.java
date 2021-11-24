package main;

import java.awt.EventQueue;

import view.ConverterWindow;

public class TheConverterProject {


//main should call the controller
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConverterWindow frame = new ConverterWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
