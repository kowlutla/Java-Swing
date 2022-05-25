package swing06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame6 extends JFrame
{
	private JButton btn;
	private TextPanel textPanel; 
	private ToolBar toolbar;
	
	public MyFrame6()
	{
		super("Simple ToolBars");
		btn=new JButton("Click Here");
		textPanel=new TextPanel();
		toolbar=new ToolBar();
		setLayout(new BorderLayout());
		add(textPanel,BorderLayout.CENTER);
		add(toolbar,BorderLayout.NORTH);
		add(btn,BorderLayout.SOUTH);
		btn.addActionListener(new ActionListener()
				{

					@Override
					public void actionPerformed(ActionEvent e) {
						textPanel.append("You are Clicking me...\n");
						
					}
			
				});
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	

}
