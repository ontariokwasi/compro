package gui;

import java.awt.*;

//import javax.swing.JFrame;
import javax.swing.*;


public class Testgui{
	public static void main(String [] args) {
		
		JFrame jframe = new JFrame();
		jframe.setTitle("Login Screen");
		jframe.setSize(300,300);
		jframe.setResizable(false);
		
		//Container cpane = jframe.getContentPane();
		//jframe.setLayout(new FlowLayout(FlowLayout.LEFT));
		//cpane.setLayout(new BorderLayout());
		//cpane.setBackground(Color.lightGray);
		//jframe.add(new JButton("Click1"),"North");
		//
		JPanel panel = new JPanel();
		  panel.setLayout(null);
			  
		  JLabel label1 = new JLabel("Java Swing");
		  JTextField field = new JTextField(20);
		  JButton button1 = new JButton("OK");
		  JButton button2 = new JButton("Cancel");
		  JTextArea comment = new JTextArea(2,10);
		  JScrollPane scrolltext = new JScrollPane(comment);
		  label1.setBounds(0, 0, 100, 50);
		  field.setBounds(75, 10, 200, 25);
		  button1.setBounds(40, 200, 75, 25);
		  button2.setBounds(200, 200, 75, 25);
		  comment.setBounds(100, 100, 100,100);
		  scrolltext.setBounds(100, 100, 100,100);
		  //panel.add(comment);
		  panel.add(scrolltext);
		  panel.add(label1);
		  panel.add(field);
		  panel.add(button1);
		  panel.add(button2);
		  jframe.add(panel);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	/*JButton b1=new JButton("Red"),
			b2=new JButton("Green"),b3=new JButton("Blue"),
			b4=new JButton("Yellow"),b5=new JButton("Pink");
		   public Testgui() {
		      setTitle("FlowLayout Test");
		      setBounds(0,0,400,100);
		      setLayout(new FlowLayout(FlowLayout.RIGHT));
		      add(b1);
		      add(b2);
		      add(b3);
		      add(b4);
		      add(b5);
		      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		      }
		   public static void main(String args[]) {
			   Testgui f = new Testgui();
		      f.setVisible(true);
		   }*/
}
