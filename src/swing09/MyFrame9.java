package swing09;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MyFrame9 extends JFrame
{
	
	private TextPanel textPanel;
	private ToolBar toolBar;
	private FormPanel formPanle;
	
	public MyFrame9()
	{
		super("Component sizes");
		this.textPanel=new TextPanel();
		this.toolBar=new ToolBar();
		this.formPanle=new FormPanel();
		setLayout(new BorderLayout());
		add(formPanle,BorderLayout.WEST);
		add(textPanel,BorderLayout.CENTER);
		add(toolBar,BorderLayout.NORTH);
		setVisible(true);
		setSize(600,500);
		toolBar.setTextListener((text)->textPanel.appendText(text));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
