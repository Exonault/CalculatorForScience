import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StandCalcDisplay {
	public StandCalcDisplay()
	{
		JTextField display = new JTextField();
		display.setEditable( false );
		display.setHorizontalAlignment(JTextField.RIGHT);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout( new GridLayout(0, 4) );
		
		JButton[] buttons=new JButton[20];
		buttonPanel.add(new JButton("CE"));
		buttonPanel.add(new JButton("/"));
		buttonPanel.add(new JButton("*"));
		buttonPanel.add(new JButton("-"));

		for (int i = 1; i < 4; i++)
		{
			String text = String.valueOf(i);
			 JButton button = new JButton( text ); 		
			 button.setFont(new Font("Arial", Font.PLAIN, 40));
			 button.setMnemonic( text.charAt(0) );
			 buttons[i] = button;
			 buttonPanel.add( button );
		}
		buttonPanel.add(new JButton("+") );
		for (int i = 4; i < 7; i++)
		{
			String text = String.valueOf(i);
			 JButton button = new JButton( text ); 		
			 button.setFont(new Font("Arial", Font.PLAIN, 40));
			 button.setMnemonic( text.charAt(0) );
			 buttons[i] = button;
			 buttonPanel.add( button );
		}
		buttonPanel.add(new JButton("√"));
		for (int i = 7; i < 10; i++)
		{
			String text = String.valueOf(i);
			 JButton button = new JButton( text ); 	
			 button.setFont(new Font("Arial", Font.PLAIN, 40));
			 button.setMnemonic( text.charAt(0) );
			 buttons[i] = button;
			 buttonPanel.add( button );
		}
		buttonPanel.add(new JButton("x*x"));
		buttonPanel.add(new JButton("±"));
		buttonPanel.add(new JButton("0"));
		buttonPanel.add(new JButton("."));
		buttonPanel.add(new JButton("="));
		buttonPanel.setSize(new Dimension(35,15));
		frame.getContentPane().add(display, BorderLayout.NORTH);
		frame.getContentPane().add(buttonPanel);
	}

}
