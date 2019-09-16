package homework5;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.*;

public class Problem2_practice {

	public static void main(String[] args) {
		JFrame jframe = new JFrame("Rainbow Color Frame");
		//JPanel panel = new JPanel();
		jframe.setLayout(new FlowLayout(FlowLayout.LEFT));
		//define buttons
		JButton red = new JButton();
		red.setBackground(Color.RED);
		red.setBounds(0, 0, 0, 200);
		
		JButton orange = new JButton();
		orange.setBackground(Color.ORANGE);
		
		JButton yellow = new JButton();
		yellow.setBackground(Color.YELLOW);
		
		JButton green = new JButton();
		green.setBackground(Color.GREEN);
		
		JButton blue = new JButton();
		blue.setBackground(Color.BLUE);
		
		JButton indigo = new JButton();
		indigo.setBackground(Color.PINK);
		
		JButton violet = new JButton();
		violet.setBackground(Color.MAGENTA);
		
		//set button sizes
		
		
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
		jframe.setSize(400, 100);
		jframe.setVisible(true);

	}

}
