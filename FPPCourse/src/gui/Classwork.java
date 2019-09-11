package gui;

import javax.swing.*;

public class Classwork {

	public static void main(String[] args) {
		JFrame jframe = new JFrame();
		JPanel jpanel = new JPanel();
		jpanel.setLayout(null);
		
		//
		JLabel userlabel = new JLabel("User");
		JLabel passwordlabel = new JLabel("Password");
		JTextField userfiled = new JTextField();
		JPasswordField passwordfield = new JPasswordField();
		JButton login = new JButton("Login");
		JButton register = new JButton("Register");
		
		userlabel.setBounds(10, 20, 40, 20);
		jpanel.add(userlabel);
		jframe.add(jpanel);
		jframe.setVisible(true);
		
		
	}

}
