package swing09;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TextPanel extends JPanel
{

		private JTextArea textArea;
		public TextPanel()
		{
			textArea=new JTextArea();
			setLayout(new BorderLayout());
			add(textArea,BorderLayout.CENTER);
			//setVisible(true);
		}
		
		public void appendText(String txt)
		{
			this.textArea.append(txt);
		}
}
