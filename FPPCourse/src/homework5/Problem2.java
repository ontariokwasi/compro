package homework5;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Problem2 extends JFrame {

	private static JFrame frame = new JFrame();
	private static JButton redButton = new JButton();
	private static JButton orangeButton = new JButton();
	private static JButton lightGreenButton = new JButton();
	private static JButton blueButton = new JButton();
	private static JButton yellowButton = new JButton();
	private static JButton voiletButton = new JButton();
	private static JButton purpleButton = new JButton();
	private static FlowLayout flowLayout = new FlowLayout();

	public static void main(String[] args) {
		new Problem2();
	}

	public Problem2() {
		frame.setTitle("Rainbow Color Frame");
		frame.setSize(410, 100);
		frame.setLayout(flowLayout);
		frame.setResizable(false);
		flowLayout.setAlignment(FlowLayout.LEFT);
		
		Dimension buttonDim = new Dimension(50,50);
		
		//Custom colors
		final Color purple = new Color(102,0,153);
		final Color voilet    = new Color(238,130,238);

		// Buttons
		redButton.setBackground(Color.RED);
		redButton.setPreferredSize(buttonDim);
		frame.add(redButton);

		orangeButton.setBackground(Color.ORANGE);
		orangeButton.setPreferredSize(buttonDim);
		frame.add(orangeButton);
		
		lightGreenButton.setBackground(Color.GREEN);
		lightGreenButton.setPreferredSize(buttonDim);
		frame.add(lightGreenButton);
		
		blueButton.setBackground(Color.BLUE);
		blueButton.setPreferredSize(buttonDim);
		frame.add(blueButton);
		
		yellowButton.setBackground(Color.YELLOW);
		yellowButton.setPreferredSize(buttonDim);
		frame.add(yellowButton);
		
		voiletButton.setBackground(voilet);
		voiletButton.setPreferredSize(buttonDim);
		frame.add(voiletButton);
		
		purpleButton.setBackground(purple);
		purpleButton.setPreferredSize(buttonDim);
		frame.add(purpleButton);
		
		//listeners
		ButtonHandler buttonHandler = new ButtonHandler();
		redButton.addActionListener(buttonHandler);
		orangeButton.addActionListener(buttonHandler);
		lightGreenButton.addActionListener(buttonHandler);
		blueButton.addActionListener(buttonHandler);
		yellowButton.addActionListener(buttonHandler);
		voiletButton.addActionListener(buttonHandler);
		purpleButton.addActionListener(buttonHandler);
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton source = (JButton) e.getSource();
			if(e.getSource() == redButton) {
				JOptionPane.showMessageDialog(source, "Red signifies passion,vitality,enthusiasm and security");
			}else if(e.getSource() == orangeButton) {
				JOptionPane.showMessageDialog(source, "Orange signifies sunshine,balance,joy,expression");
			}else if(e.getSource() == lightGreenButton) {
				JOptionPane.showMessageDialog(source, "Green signifies life,renewal and energy");
			}else if(e.getSource() == blueButton) {
				JOptionPane.showMessageDialog(source, "Blue signifies confident,intelligence,faith");
			}else if(e.getSource() == yellowButton) {
				JOptionPane.showMessageDialog(source, "Yellow signifies energy,optimism and joy");
			}else if(e.getSource() == voiletButton) {
				JOptionPane.showMessageDialog(source, "Voilet signifies imagination,emotions and calming");
			}else {
				JOptionPane.showMessageDialog(source, "Purple signifies stability and calmness");
			}
			
		}
		
		
		
	}
	
	

}
