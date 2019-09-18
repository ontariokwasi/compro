package homework5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

public class Problem2 {

	public static void main(String[] args) {
		JFrame jframe = new JFrame("Rainbow Color Frame");
		//JPanel panel = new JPanel();
		jframe.setLayout(new FlowLayout(FlowLayout.LEFT));
		//dimension
		Dimension btndim = new Dimension(50,80);
		//define buttons
		JButton red = new JButton();
		red.setBackground(Color.RED);
		red.setBounds(0, 0, 0, 200);
		red.setPreferredSize(btndim);
		red.setOpaque(true);
		red.setBorderPainted(false);
		
		JButton orange = new JButton();
		orange.setBackground(Color.ORANGE);
		orange.setPreferredSize(btndim);
		orange.setOpaque(true);
		orange.setBorderPainted(false);
		
		JButton yellow = new JButton();
		yellow.setBackground(Color.YELLOW);
		yellow.setPreferredSize(btndim);
		yellow.setOpaque(true);
		yellow.setBorderPainted(false);
		
		JButton green = new JButton();
		green.setBackground(Color.GREEN);
		green.setPreferredSize(btndim);
		green.setOpaque(true);
		green.setBorderPainted(false);
		
		JButton blue = new JButton();
		blue.setBackground(Color.BLUE);
		blue.setPreferredSize(btndim);
		blue.setOpaque(true);
		blue.setBorderPainted(false);
		
		JButton indigo = new JButton();
		indigo.setBackground(new Color(120,0,255));
		indigo.setPreferredSize(btndim);
		indigo.setOpaque(true);
		indigo.setBorderPainted(false);
		
		JButton violet = new JButton();
		violet.setBackground(new Color(102,0,153));
		violet.setPreferredSize(btndim);
		violet.setOpaque(true);
		violet.setBorderPainted(false);
		
		//add action listerners
		red.addActionListener((e) -> {JOptionPane.showMessageDialog(green, "Red signifies passion,vitality,enthusiasm and security");});
		orange.addActionListener((e) -> {JOptionPane.showMessageDialog(green, "Orange signifies sunshine,balance,joy,expression");});
		yellow.addActionListener((e) -> {JOptionPane.showMessageDialog(green, "Yellow signifies energy,optimism and joy");});
		green.addActionListener((e) -> {JOptionPane.showMessageDialog(green, "Green signifies life,renewal and energy");});
		blue.addActionListener((e) -> {JOptionPane.showMessageDialog(green, "Blue signifies confidence,intelligence,faith");});
		indigo.addActionListener((e) -> {JOptionPane.showMessageDialog(green, "Purple signifies stability and calmness");});
		violet.addActionListener((e) -> {JOptionPane.showMessageDialog(green, "Violet signifies imagination,emotions and calming");});
		
		
		//add buttons to panel
		jframe.add(red);
		jframe.add(orange);
		jframe.add(yellow);
		jframe.add(green);
		jframe.add(blue);
		jframe.add(indigo);
		jframe.add(violet);
		
		//add panel to jframe
		//jframe.add(panel);
		
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(400, 120);
		jframe.setResizable(false);
		jframe.setLocation(400, 300);
		jframe.setVisible(true);

	}

}
