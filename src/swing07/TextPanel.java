package swing07;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TextPanel extends JPanel
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea txt;
	public TextPanel()
	{
		txt=new JTextArea();
		setLayout(new BorderLayout());
		add(txt,BorderLayout.CENTER);	
	}
	
	public void appendText(String s)
	{
		txt.append(s);
	}
}
