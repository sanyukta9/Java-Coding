import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class JavaSwingDemoHomePage{
	
	JavaSwingDemoHomePage(){
		JFrame f= new JFrame();
		f.setTitle("HOTEL MANAGEMENT SYSTEM: HOME PAGE");
		f.setBounds(100, 100, 1000, 700);
		f.setLocationRelativeTo(null);//opens frame at centre of screen
		f.getContentPane().setLayout(null);
		f.setVisible(true);
		
		//Add button
		JButton b=new JButton("Submit!");
		b.setBounds(200, 100, 140, 40);
		f.getContentPane().add(b);
		
		//Add Labels
		JLabel label=new JLabel("Label:");
		label.setBounds(50, 100, 50, 40);
		f.getContentPane().add(label);
		
		JRadioButton rb1 = new JRadioButton("Book!");
		rb1.setBounds(103, 217, 103, 21);
		f.getContentPane().add(rb1);
		
		JRadioButton rb2 = new JRadioButton("Cancel");
		rb2.setBounds(103, 251, 103, 21);
		f.getContentPane().add(rb2);
		
		ButtonGroup bg= new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		JButton b2=new JButton("Radio Button Click!");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rb1.isSelected()) {
					JOptionPane.showMessageDialog(null, "You have selected Book!");
				}
				if(rb2.isSelected()) {
					JOptionPane.showMessageDialog(null, "You have selected Cancel");
				}
			}
		});
		b2.setBounds(103, 350, 150, 30);
		f.getContentPane().add(b2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("C++");
		chckbxNewCheckBox.setBounds(377, 217, 93, 21);
		f.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Java");
		chckbxNewCheckBox_1.setBounds(377, 251, 93, 21);
		f.getContentPane().add(chckbxNewCheckBox_1);
		
		
		//JScroll Pane with Jlist
		JFrame f2=new JFrame("JScroll Pane with Jlist");
		String languages[]= {"Java","Python","PHP","C","Java","Python","PHP","C","Java","Python","PHP","C"};
		JList list= new JList(languages);
		
		JScrollPane scrollpane= new JScrollPane(list);
		f2.getContentPane().add(scrollpane);
		f2.setSize(320,200);
		f2.setLocationRelativeTo(null);
		f2.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new JavaSwingDemoHomePage();
	}
}
