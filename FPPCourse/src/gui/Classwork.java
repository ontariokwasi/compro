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
		passwordlabel.setBounds(10, 60, 100, 20);
		userfiled.setBounds(100, 20, 120, 20);
		passwordfield.setBounds(100, 60, 120, 20);
		login.setBounds(10, 120, 80, 40);
		register.setBounds(140, 120, 100, 40);
		jpanel.add(userlabel);
		jpanel.add(passwordlabel);
		jpanel.add(userfiled);
		jpanel.add(passwordfield);
		jpanel.add(login);
		jpanel.add(register);
		jframe.add(jpanel);
		jframe.setSize(300,300);
		jframe.setResizable(false);
		jframe.setVisible(true);
		
		
	}

}
