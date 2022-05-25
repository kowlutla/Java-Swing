package swing05;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class MyFrame5 extends JFrame
{
	private JButton btn;
	private TextPanel textPanel;
	private Toolbar toolbar;
	public MyFrame5()
	{
		super("Simple Toolbars");
		btn=new JButton("Click me");
		textPanel=new TextPanel();
		toolbar=new Toolbar();
		setLayout(new BorderLayout());
		add(toolbar,BorderLayout.NORTH);
		add(textPanel,BorderLayout.CENTER);
		add(btn,BorderLayout.SOUTH);
		
		btn.addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) {
						textPanel.appendText("You Are Clicking Me...\n");	
					}
				});
		setVisible(true);
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
