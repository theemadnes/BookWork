import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ColorWindow extends JFrame {

	private JPanel panel;
	private JLabel messageLabel;
//	private JTextField kiloTextField;
//	private JButton calcButton; 
	private JButton redButton;
	private JButton blueButton;
	private JButton yellowButton;
	private final int WINDOW_WIDTH = 200;
	private final int WINDOW_HEIGHT = 125;
	
	public ColorWindow()
	{
		setTitle("Colors");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		messageLabel = new JLabel("Click a button to select a color.");
		
		redButton = new JButton("Red");
		blueButton = new JButton("Blue");
		yellowButton = new JButton("Yellow");
		
		redButton.addActionListener(new RedButtonListener());
		blueButton.addActionListener(new BlueButtonListener());
		yellowButton.addActionListener(new YellowButtonListener());
		
		panel = new JPanel();
		panel.add(messageLabel);
		panel.add(redButton);
		panel.add(blueButton);
		panel.add(yellowButton);
		
		add(panel);
		setVisible(true);
		
	}
	
	
	private class RedButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			panel.setBackground(Color.RED);
			messageLabel.setForeground(Color.BLUE);
		}
	}
	
	private class BlueButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			panel.setBackground(Color.BLUE);
			messageLabel.setForeground(Color.YELLOW);
		}
	}
	
	private class YellowButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			panel.setBackground(Color.YELLOW);
			messageLabel.setForeground(Color.BLACK);
		}
	}
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ColorWindow();
	}

}