package swing04;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextPanel extends JPanel {
	
	private JTextArea text;
	private JButton btn;
	public TextPanel()
	{
		text=new JTextArea();
		btn=new JButton("Jpanel button");
		setLayout(new BorderLayout());
		add(new JScrollPane(text),BorderLayout.CENTER);
		add(btn,BorderLayout.NORTH);
	}
	
	public void appendText(String s)
	{
		text.append(s);
	}

}
