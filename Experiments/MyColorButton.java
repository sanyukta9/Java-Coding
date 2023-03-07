import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Write a Java Program to create a color palette. 
 * Declare a grid of Buttons to set the color names. 
 * Change the background color by clicking on the color button. 
 */
public class MyColorButton extends JFrame {
		JPanel colorPanel;
		JButton redButton,greenButton,blueButton;
	
		public MyColorButton() {
			colorPanel= new JPanel();
			add(colorPanel, BorderLayout.CENTER);
			redButton=new JButton("Red");
			greenButton=new JButton("Green");
			blueButton=new JButton("Blue");
			JPanel controlPanel=new JPanel();
			controlPanel.setLayout(new GridLayout(3,2));
			controlPanel.add(new JLabel("Red"));
			controlPanel.add(redButton);
			controlPanel.add(new JLabel("Green"));
			controlPanel.add(greenButton);
			controlPanel.add(new JLabel("Blue"));
			controlPanel.add(blueButton);
			add(controlPanel,BorderLayout.SOUTH);
			
			redButton.addActionListener(new ColorListener(Color.RED));
			greenButton.addActionListener(new ColorListener(Color.GREEN));
			blueButton.addActionListener(new ColorListener(Color.BLUE));
			setSize(300, 400);
			setVisible(true);
		}
	
		class ColorListener implements ActionListener{
			Color color;
			ColorListener(Color color){
				this.color=color;
			}
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				colorPanel.setBackground(color);
			}
		}
		
		public static void main(String[] args) {
			new MyColorButton();
		}
}
