package com.simple;

import javax.swing.JFrame;
import javax.swing.JLabel;

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
		
		SwingDemo obj = new SwingDemo();

	}

}
