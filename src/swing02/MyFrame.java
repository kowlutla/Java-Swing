package swing02;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

class MyFrame2 extends JFrame
{
	private JButton btn;
	private JTextArea txt;
	public MyFrame2()
	{
		super("Adding Components");
		setLayout(new BorderLayout());
		btn=new JButton("Click Here");
		txt=new JTextArea();
		add(txt,BorderLayout.CENTER);
		add(btn,BorderLayout.SOUTH);
		setVisible(true);
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
