package swing01;

import javax.swing.JFrame;

/*Create basic swing programming
 * */
class App {

	public static void main(String[] args) {
		
		/* TO RUN FRAME IN SEPERATE THREAD
		SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
				JFrame frame=new JFrame("Hello World");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				frame.setSize(700,500);
			}
		});*/
		
		JFrame frame=new JFrame("Hello World ");
		frame.setSize(600,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
		
	}

}
