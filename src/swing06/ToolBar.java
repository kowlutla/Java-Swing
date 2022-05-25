package swing06;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ToolBar extends JPanel {

	private JButton helloButton;
	private JButton goodByeButton;
	
	public ToolBar()
	{
		helloButton=new JButton("Hello");
		goodByeButton=new JButton("Good Bye");
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(helloButton);
		add(goodByeButton);
	}
}
