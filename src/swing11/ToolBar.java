package swing11;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ToolBar extends JPanel implements ActionListener
{
	private JButton helloButton;
	private JButton goodbyeButton;
	private StringListener textListener;
	
	public ToolBar()
	{
		setBorder(BorderFactory.createEtchedBorder());
		this.helloButton=new JButton("Hello");
		this.goodbyeButton=new JButton("Good BYE");
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(helloButton);
		add(goodbyeButton);
		helloButton.addActionListener(this);
		goodbyeButton.addActionListener(this);
	}
	
	public void setTextListener(StringListener listener)
	{
		this.textListener=listener;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton b=(JButton)e.getSource();
		if(b==helloButton)
		{
			if(this.textListener!=null)
			{
				this.textListener.textEmitted("Hello\n");
			}
		}
		else if(b==goodbyeButton)
		{
			if(this.textListener!=null)
			{
				this.textListener.textEmitted("Good Bye\n");
			}
		}
		
	}
}
