import javax.swing.*;

public class ShowWindow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int WINDOW_WIDTH = 350;
		final int WINDOW_HEIGHT = 250;
		
		JFrame window = new JFrame();
		window.setTitle("test app");
		window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		window.setVisible(true);

	}

}
