package swing08;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ToolBar extends JPanel implements ActionListener
{
	
	private JButton helloButton;
	private JButton goodByeButton;
	private StringListener textListener;
	
	public ToolBar()
	{
		this.helloButton=new JButton("Hello");
		this.goodByeButton=new JButton("Good Bye");
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(helloButton);
		add(goodByeButton);
		helloButton.addActionListener(this);
		goodByeButton.addActionListener(this);
	}
	
	public void setStringListener(StringListener listener)
	{
		this.textListener=listener;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton btn=(JButton)e.getSource();
		if(btn==helloButton)
		{
			if(textListener!=null)
			{
				textListener.textEmitted("Hello\n");
			}
		}
		else if(btn==goodByeButton)
		{
			if(textListener!=null)
			{
				textListener.textEmitted("Good Bye\n");
			}
		}
		
	}
	


}
