package homework5;

import javax.swing.*;

public class Problem1 {
	public static void main(String [] args) {
		JFrame jframe = new JFrame("String Untility");
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		//need 3 button
		JButton countletters = new JButton("Count Letters");
		JButton reverse = new JButton("Reverse Letters");
		JButton removeduplicate = new JButton("Remove Duplicates");
		//set bounds
		countletters.setBounds(10, 20, 160, 30);
		reverse.setBounds(10, 60, 160, 30);
		removeduplicate.setBounds(10, 100, 160, 30);
		//add to panel
		panel.add(countletters);
		panel.add(reverse);
		panel.add(removeduplicate);
		
		//need 2 textfields
		JTextField input = new JTextField();
		JTextField output = new JTextField();
		//set bounds for textfields
		input.setBounds(200, 50, 150, 30);
		output.setBounds(200, 90, 150, 30);
		
		//add textfields to panel
		panel.add(input);
		panel.add(output);
		
		//add panel to jframe
		jframe.add(panel);
		
		
		jframe.setSize(400, 200);
		jframe.setResizable(false);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set jframe to visible
		jframe.setVisible(true);
		
		//implement listeners
		countletters.addActionListener((e) -> {
			String inputstring = input.getText();
			output.setText(inputstring.length()+"");
		});
		reverse.addActionListener((e) -> {
			String inputstring = input.getText();
			String outputstring = "";
			int x = 0;
			while(x < inputstring.length())
				outputstring += inputstring.charAt(inputstring.length() - ++x); 
			output.setText(outputstring);
		});
		
		removeduplicate.addActionListener((e) -> {
			String inputstring = input.getText();
			String outputstring = "";
			int x = 0;
			while(x < inputstring.length()) {
				if(!outputstring.contains(inputstring.charAt(x)+""))
					outputstring += inputstring.charAt(x);
				x++;
			}
			output.setText(outputstring);
		});
		
	}
}
