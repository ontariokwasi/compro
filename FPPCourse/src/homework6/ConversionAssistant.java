package homework6;

import java.awt.event.*;

import javax.swing.*;

public class ConversionAssistant extends JFrame {

	private JFrame frame = new JFrame();
	private JLabel mileLabel = new JLabel("Mile:");
	private JTextField mileTextField = new JTextField();
	private JLabel kilometerLabel = new JLabel("Kilometer:");
	private JTextField kilometerTextField = new JTextField();
	private JLabel poundLabel = new JLabel("Pound: ");
	private JTextField poundTextField = new JTextField();
	private JLabel kilogramLabel = new JLabel("Kilogram:");
	private JTextField kilogramTextField = new JTextField();
	private JLabel gallonLabel = new JLabel("Gallon:");
	private JTextField gallonTextField = new JTextField();
	private JLabel litersLabel = new JLabel("Liters:");
	private JTextField litersTextField = new JTextField("");
	private JLabel fahrenheitLabel = new JLabel("Fahrenheit:");
	private JTextField fahrenheitTextField = new JTextField();
	private JLabel centrigradeLabel = new JLabel("Centrigrade: ");
	private JTextField centrigradeTextField = new JTextField();
	private JButton convertButton = new JButton("Convert");

	/**
	 * 
	 */
	public ConversionAssistant() {
		frame.setTitle("Metric Conversion Assistant");
		frame.setSize(600, 500);
		frame.setLayout(null);

		// Mile Label and TextField
		mileLabel.setBounds(20, 10, 70, 40);
		mileTextField.setBounds(70, 20, 150, 25);
		frame.add(mileLabel);
		frame.add(mileTextField);

		// Kilometer Label and TextField
		kilometerLabel.setBounds(270, 10, 70, 40);
		kilometerTextField.setBounds(350, 20, 150, 25);
		frame.add(kilometerLabel);
		frame.add(kilometerTextField);

		// Pound Label and Input
		poundLabel.setBounds(20, 60, 70, 40);
		poundTextField.setBounds(70, 70, 150, 25);
		frame.add(poundLabel);
		frame.add(poundTextField);

		// Kilogram Label and TextField
		kilogramLabel.setBounds(270, 60, 70, 40);
		kilogramTextField.setBounds(350, 70, 150, 25);
		frame.add(kilogramLabel);
		frame.add(kilogramTextField);

		// Gallon Label and TextField
		gallonLabel.setBounds(20, 110, 70, 40);
		gallonTextField.setBounds(70, 120, 150, 25);
		frame.add(gallonLabel);
		frame.add(gallonTextField);

		// Liters Label and TextField
		litersLabel.setBounds(270, 110, 70, 40);
		litersTextField.setBounds(350, 120, 150, 25);
		frame.add(litersLabel);
		frame.add(litersTextField);

		// Fahrenheit Label and TextField
		fahrenheitLabel.setBounds(1, 160, 70, 40);
		fahrenheitTextField.setBounds(70, 170, 150, 25);
		frame.add(fahrenheitLabel);
		frame.add(fahrenheitTextField);

		// Centrigrade Label and TextField
		centrigradeLabel.setBounds(270, 160, 70, 40);
		centrigradeTextField.setBounds(350, 170, 150, 25);
		frame.add(centrigradeLabel);
		frame.add(centrigradeTextField);

		convertButton.setBounds(200, 240, 100, 40);
		frame.add(convertButton);
		
		ButtonHandler btnHandler = new ButtonHandler();
		convertButton.addActionListener(btnHandler);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new ConversionAssistant();

	}
	
	
	private class ButtonHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(!mileTextField.getText().toString().isEmpty()) {
				int mile = Integer.parseInt(mileTextField.getText().toString());
				double kilometers = mile * 1.6093;
				kilometerTextField.setText(String.valueOf(kilometers));
			}
			
			if(!poundTextField.getText().toString().isEmpty()) {
				int pound = Integer.parseInt(poundTextField.getText().toString());
				double kilograms = pound * 0.45359237;
				kilogramTextField.setText(String.valueOf(kilograms));
			}
			
			if(!gallonTextField.getText().toString().isEmpty()) {
				int gallon = Integer.parseInt(gallonTextField.getText().toString());
				double litre = gallon * 3.78541;
				litersTextField.setText(String.valueOf(litre));
			}
			
			if(!fahrenheitTextField.getText().toString().isEmpty()) {
				int fahrenheit = Integer.parseInt(fahrenheitTextField.getText().toString());
				double centrigrade = (fahrenheit - 32) * 5/9;
				centrigradeTextField.setText(String.valueOf(centrigrade));
			}
			
		}
		
	}

}