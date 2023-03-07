import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox; 
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.JTree;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
public class JavaSwingDemo implements ActionListener {
 JRadioButton rb1,rb2;
 JMenu menu,submenu;
 JMenuItem i1,i2,i3,i4,i5,i6;
 public JavaSwingDemo() {
 //Step 1: Create a Frame
 JFrame f= new JFrame("Swing Example");
 // f.setSize(1080,720);
 f.setExtendedState(JFrame.MAXIMIZED_BOTH);
 f.setLayout(null);
 f.setVisible(true);

 //Step 2: Add Button
 JButton b=new JButton("Submit!");
 b.setBounds(200, 100, 140, 40);
 f.add(b);

 //Step 3: Add a Label

 JLabel label= new JLabel();
 label.setText("Label:");
 label.setBounds(50, 100, 50, 40);
 f.add(label);

 //Step 5: CheckBox
 JCheckBox checkBox1 =new JCheckBox("C++");
 checkBox1.setBounds(50, 150, 50, 50);
 JCheckBox checkBox2 =new JCheckBox("Java");
 checkBox2.setBounds(50, 200, 50, 50);
 f.add(checkBox1);
 f.add(checkBox2);

 //Step6: RadioButton
 rb1=new JRadioButton("Good");
 rb1.setBounds(50, 250, 100, 30); 
rb2=new JRadioButton("Bad");
 rb2.setBounds(50, 300, 100, 30);
 ButtonGroup bg=new ButtonGroup();
 bg.add(rb1);
 bg.add(rb2);
 b=new JButton("Click");
 b.setBounds(100, 350, 80, 30);
 b.addActionListener(this);
 f.add(rb1);
 f.add(rb2);
 f.add(b);

 JFrame f2=new JFrame("JScroll Pane with Jlist");
 String languages[]= {

 "Sanyukta","Language","Java","Python","PHP","Algorithm","C Sharp","JavaScript","C++"
 };

 JList list=new JList(languages);

 JScrollPane scrollpane=new JScrollPane(list);
 f2.getContentPane().add(scrollpane,BorderLayout.CENTER);
 f2.setSize(320,200);
 f2.setLocationRelativeTo(null);
 f2.setVisible(true);

 JFrame frame=new JFrame("JScroll Pane with JTable");
 String [] index= new String[]{"Sr.No",
"Continent","Area sqkm","Percent Total"};
 JLabel label1=new JLabel("continenets Largest to Smallest",JLabel.CENTER);
 Object[][] data=new Object[][] {
 {"Sr.No","Continent","Area sqkm","Percent Total"},
 {"1","Asia","345,5677,575","50%"},
 {"2","Africa","343,53,232","40%"},
 };
 //Create a Table Model
 DefaultTableModel TableModel=new
DefaultTableModel(data,index);
 //initializa our table
 JTable table =new JTable(TableModel);
 //Adjust the contents in each cell in Centre
 DefaultTableCellRenderer tablecellRenderer=new
DefaultTableCellRenderer();

tablecellRenderer.setHorizontalAlignment(JLabel.CENTER);
 table.setDefaultRenderer(Object.class,
tablecellRenderer);

 JPanel panel=new JPanel(new BorderLayout());
 panel.add(table,BorderLayout.CENTER);
 
 JScrollPane scrollPane1= new JScrollPane(panel);
 frame.add(label1,BorderLayout.NORTH);
 frame.add(scrollPane1,BorderLayout.CENTER);

 frame.setSize(320,200);
 frame.setLocationRelativeTo(null);
 frame.setVisible(true);

 JMenuBar mb=new JMenuBar();
 menu= new JMenu("Menu");
 submenu=new JMenu("Sub Menu");
 i1=new JMenuItem("Item 1");
 i2=new JMenuItem("Item 2");
 i3=new JMenuItem("Item 3");
 i4=new JMenuItem("Item 4");
 i5=new JMenuItem("Item 5");
 menu.add(i1);
 menu.add(i2);
 menu.addSeparator();
 menu.add(i3);
 submenu.add(i4);
 submenu.add(i5);
 menu.add(submenu);
 mb.add(menu);
 f.setJMenuBar(mb);
 f.setVisible(true);

 JToolBar toolbar=new JToolBar();
 JButton button=new JButton("File");
 toolbar.add(button);
 toolbar.add(new JButton("Edit"));
 toolbar.add(new JComboBox(new String[] {"Opt-1","Opt2","Opt-3","Opt-4"}));
 toolbar.setBounds(20,20,300,30);
 f.getContentPane().add(toolbar,BorderLayout.NORTH);
 f.setVisible(true);

 Frame treeframe = new JFrame();
 DefaultMutableTreeNode style=new
DefaultMutableTreeNode("Style");
 DefaultMutableTreeNode color=new
DefaultMutableTreeNode("Color");
 DefaultMutableTreeNode font=new
DefaultMutableTreeNode("Font");
 style.add(color);
 style.add(font);

 DefaultMutableTreeNode red=new
DefaultMutableTreeNode("Red");
 DefaultMutableTreeNode blue=new
DefaultMutableTreeNode("Blue");
 DefaultMutableTreeNode black=new
DefaultMutableTreeNode("Black"); 
 DefaultMutableTreeNode green=new
DefaultMutableTreeNode("Green");

 color.add(red);
 color.add(blue);
 color.add(black);
 color.add(green);

 JTree jt=new JTree(style);
 treeframe.add(jt);
 treeframe.setSize(200,200);
 treeframe.setVisible(true);

 }

 public static void main(String[] args) {
 new JavaSwingDemo();
 }
 @Override
 public void actionPerformed(ActionEvent e) {
 // TODO Auto-generated method stub
 if(rb1.isSelected()) {
 JOptionPane.showMessageDialog(null, "You are Good" );
 }
 if(rb2.isSelected()) {
 JOptionPane.showMessageDialog(null, "You are Bad" );
 }
 }
} 
