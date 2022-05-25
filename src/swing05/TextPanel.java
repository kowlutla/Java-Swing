package swing05;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPanel extends JPanel {
	
	private JTextArea text;
	public TextPanel()
	{
		text=new JTextArea();
		setLayout(new BorderLayout());
		add(new JScrollPane(text),BorderLayout.CENTER);
	}
	
	public void appendText(String s)
	{
		text.append(s);
	}

}
