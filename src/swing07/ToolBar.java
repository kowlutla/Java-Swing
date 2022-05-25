package swing07;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ToolBar extends JPanel implements ActionListener
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton helloButton;
	private JButton goodByeButton;
	private TextPanel textPanel;
	public ToolBar()
	{
		helloButton=new JButton("Hello");
		goodByeButton=new JButton("Good Bye");
		helloButton.addActionListener(this);
		goodByeButton.addActionListener(this);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(helloButton);
		add(goodByeButton);
	}

	public void setTextPanel(TextPanel textPanel)
	{
		this.textPanel=textPanel;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton btn=(JButton) e.getSource();
		if(btn==helloButton)
		{
			textPanel.appendText("Hello\n");
		}
		else if(btn==goodByeButton)
		{
			textPanel.appendText("Good Bye\n");
		}
	}
}
