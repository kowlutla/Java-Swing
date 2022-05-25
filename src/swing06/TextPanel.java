package swing06;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TextPanel extends JPanel
{
	private JTextArea txt;
	public TextPanel()
	{
		txt=new JTextArea();
		setLayout(new BorderLayout());
		add(txt,BorderLayout.CENTER);	
	}
	
	public void append(String s)
	{
		txt.append(s);
	}
}
