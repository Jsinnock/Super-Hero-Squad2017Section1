package controllers;

import javax.swing.JFrame;

import view.View;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			View frame = new View();
			Controller c=new Controller(frame);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.pack();
			//frame.pack();
			frame.setVisible(true);
			frame.getConsole().addController(c);
			frame.getTab().getINV().addController(c);
			frame.getTab().getCMD().addController(c);
			frame.getLogin().addController(c);
			frame.getStart().addController(c);
		
		
			
			
		
	}

}
