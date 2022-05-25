package swing07;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MyFrame7 extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TextPanel textPanel; 
	private ToolBar toolbar;
	
	public MyFrame7()
	{
		super("Simple ToolBars");
		textPanel=new TextPanel();
		toolbar=new ToolBar();
		toolbar.setTextPanel(textPanel);
		setLayout(new BorderLayout());
		add(textPanel,BorderLayout.CENTER);
		add(toolbar,BorderLayout.NORTH);
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	

}
