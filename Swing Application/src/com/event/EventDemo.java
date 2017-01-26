package com.event;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

// Handle an event in a Swing program


public class EventDemo {
	
	//create a reference of Jlabel
	JLabel label = new JLabel();
	
	//creating a constructor of class
	public EventDemo()
	{
		//create a new jframe container
		JFrame frame = new JFrame("Event Demo");
		
		//Specify FlowLayout for the layout manager
		frame.setLayout(new FlowLayout());
		
		// Give the frame initial size
		frame.setSize(200, 200);
		
		//terminate the window when user close the window
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		// make two buttons
		JButton bAlpha = new JButton("Alpha");
		JButton bBeta =  new JButton("Beta");
		
		//Add action listener for alpha
		bAlpha.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("Alpha is Pressed");
				
			}
		});
		
		// Add action listener for beta
			bBeta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("Beta is Pressed");
				
			}
		});
			
		// Add button to the content page
		frame.add(bAlpha);
		frame.add(bBeta);
			
		// create a text based label
		label.setText("Press a button");
		
		//add the label to the content page 
		frame.add(label);
		
		// Display the frame 
		frame.setVisible(true);
	}
	

	public static void main(String[] args) {
		

		//create the event on event dispatcher
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new EventDemo(); 
				
			}
		});
	}

}
