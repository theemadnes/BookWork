import javax.swing.*;
import java.awt.event.*;

public class EventObject extends JFrame
{
	private JButton button1;
	private JButton button2;
	private JButton button3;
	
	private JPanel panel;
	
	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_HEIGHT = 75;
	
	public EventObject()
	{
		setTitle("Event Object demonstration");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button1 = new JButton("Button 1");
		button2 = new JButton("Button 2");
		button3 = new JButton("Button 3");
		
		button1.addActionListener(new ButtonListener());
		button2.addActionListener(new ButtonListener());
		button3.addActionListener(new ButtonListener());
		
		panel = new JPanel();
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		
		add(panel);
		setVisible(true);
	}
	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if (e.getSource() == button1)
			{
				JOptionPane.showMessageDialog(null, "Button 1");
			}
			else if (e.getSource() == button2)
			{
				JOptionPane.showMessageDialog(null, "Button 2");
			}
			else if (e.getSource() == button3)
			{
				JOptionPane.showMessageDialog(null, "Button 3");
			}
		}
	}
	
	public static void main(String[] args)
	{
		new EventObject();
	}
}


