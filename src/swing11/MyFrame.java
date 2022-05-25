package swing11;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MyFrame extends JFrame
{
	
	private TextPanel textPanel;
	private ToolBar toolBar;
	private FormPanel formPanle;
	
	public MyFrame()
	{
		super("Labels and textFields");
		this.textPanel=new TextPanel();
		this.toolBar=new ToolBar();
		this.formPanle=new FormPanel();
		setLayout(new BorderLayout());
		add(formPanle,BorderLayout.WEST);
		add(textPanel,BorderLayout.CENTER);
		add(toolBar,BorderLayout.NORTH);
		setVisible(true);
		setSize(700,600);
		toolBar.setTextListener((text)->textPanel.appendText(text));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
