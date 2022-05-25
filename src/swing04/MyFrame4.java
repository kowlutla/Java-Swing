package swing04;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame4 extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3652606294175024769L;
	private JButton btn;
	private TextPanel textPanel;
	
	public MyFrame4()
	{
		super("Custom Components");
		btn=new JButton("Click Here");
		textPanel=new TextPanel();
		setSize(600,500);
		setVisible(true);
		setLayout(new BorderLayout());
		
		add(btn,BorderLayout.SOUTH);
		add(textPanel,BorderLayout.CENTER);
		btn.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						textPanel.appendText("I am kowlutla\n");
					}
				});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

}
