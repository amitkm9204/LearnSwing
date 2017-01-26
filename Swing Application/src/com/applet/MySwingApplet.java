package com.applet;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class MySwingApplet extends JApplet{

	JButton jAlpha;
	JButton jBeta;
	
	JLabel label;
	
	// Initialise the applet
	public void init(){
		try{
			SwingUtilities.invokeAndWait(new Runnable() {
				
				@Override
				public void run() {
					makeGUI();//initialise the gui
					
				}
			});
		}catch(Exception exc)
		{
			System.out.println("cant create because of "+exc);
		}
	}
	//this applet doesnot need to override	start(),stop() or destroy()
	
	//setup and initialize the gui
	private void makeGUI()
	{
		//set the applt to use flow layout
		setLayout(new FlowLayout());
		
		//make two buttons
		jAlpha = new JButton("Alpha");
		jBeta = new JButton("Beta");
		
		//Add action listener for Alpha
		jAlpha.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("Alpha was processed");
				
			}
		});
		
		//Add action for beta
		jBeta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("Beta was processed");
				
			}
		});
		
		//Add the button to content pane
		add(jAlpha);
		add(jBeta);
		
		// create a text based lebel
		label = new JLabel("Press a Button");
		
		//Add the level to content pane
		add(label);
	}
}
