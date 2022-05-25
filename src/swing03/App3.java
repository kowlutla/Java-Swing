package swing03;

import javax.swing.SwingUtilities;

/*
 * Responding to Buttons
 * */

public class App3 {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable()
				{
					public void run()
					{
						new MyFrame3();
					}
				});
	}

}
