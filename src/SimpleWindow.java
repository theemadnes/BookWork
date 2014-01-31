import javax.swing.*;


public class SimpleWindow extends JFrame{
	public SimpleWindow()
	{
		final int WINDOW_WIDTH = 350;
		final int WINDOW_HEIGHT = 250;
		
		JFrame window = new JFrame();
		window.setTitle("test app");
		window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		window.setVisible(true);
	}
}
