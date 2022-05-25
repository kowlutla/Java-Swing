package swing08;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MyFrame8 extends JFrame
{
	private ToolBar toolBar;
	private TextPanel textPanel;
	
	public MyFrame8()
	{
		super("Custom Compenents");
		this.toolBar=new ToolBar();
		this.textPanel=new TextPanel();
		toolBar.setStringListener((text)->textPanel.appendText(text));
		setLayout(new BorderLayout());
		add(toolBar,BorderLayout.NORTH);
		add(textPanel,BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,500);
		setVisible(true);
	}

}
