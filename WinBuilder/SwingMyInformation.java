import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class SwingMyInformation extends JFrame {

	private JPanel contentPane;
	private JTextField nametxt;
	private JTextField streetTxt;
	private JTextField citytxt;
	private JTextField pintxt;
	JTextArea output_textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingMyInformation frame = new SwingMyInformation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public SwingMyInformation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 894, 670);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nametxt = new JTextField();
		nametxt.setBounds(207, 102, 96, 19);
		contentPane.add(nametxt);
		nametxt.setColumns(10);
		
		streetTxt = new JTextField();
		streetTxt.setBounds(207, 189, 96, 19);
		contentPane.add(streetTxt);
		streetTxt.setColumns(10);
		
		citytxt = new JTextField();
		citytxt.setBounds(207, 300, 96, 19);
		contentPane.add(citytxt);
		citytxt.setColumns(10);
		
		pintxt = new JTextField();
		pintxt.setBounds(207, 407, 96, 19);
		contentPane.add(pintxt);
		pintxt.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(77, 105, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Street");
		lblNewLabel_1.setBounds(77, 192, 45, 13);
		contentPane.add(lblNewLabel_1);
		JLabel lblNewLabel_2 = new JLabel("City");
		lblNewLabel_2.setBounds(77, 303, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("PinCode");
		lblNewLabel_3.setBounds(77, 410, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("MyInfo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				submit_action(e);
			}

			
		});
		btnNewButton.setBounds(207, 497, 85, 21);
		contentPane.add(btnNewButton);
		
		output_textArea = new JTextArea();
		output_textArea.setFont(new Font("Arial", Font.ITALIC, 32));
		output_textArea.setBounds(456, 99, 349, 358);
		contentPane.add(output_textArea);
	}
	
	private void submit_action(ActionEvent e) {
		String name=nametxt.getText();
		String sname=streetTxt.getText();
		String cname=citytxt.getText();
		String pincode=pintxt.getText();
		
		output_textArea.setText("Name:"+name+"\n\n Street:"+sname+"\n\n City: "+cname+"\n\n Pincode: "+pincode);
	}
}
