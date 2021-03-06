package com.simple;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

// A simple Swing Application


public class SwingDemo {
	
	public SwingDemo() {
		// Create A new JFrame container
		JFrame frame = new JFrame("A Simple Swing Application");
		
		// Give The frame Initial size
		frame.setSize(300, 300);
		
		// Terminate the application when user close the window
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		// create a text based label
		JLabel label = new JLabel("Swing is a powerful gui");
		
		// Add the lebel to the content pane
		frame.add(label);
		
		// display the frame
		frame.setVisible(true);
		
	}

	public static void main(String[] args) {
		
		//SwingDemo obj = new SwingDemo(); it can be avoided by not calling the object from main handler
		//rather we can put it in any event As,
		//Create the frame on the event dispatching thread 
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new SwingDemo();
				
			}
		});
		

	}

}
