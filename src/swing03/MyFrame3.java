package swing03;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;


class MyFrame3 extends JFrame
{
	private JTextArea textArea;
	private JButton btn;
	int count=0;
	public MyFrame3()
	{
		super("Responding to Buttons");
		textArea=new JTextArea();
		btn=new JButton("Click Me");
		setLayout(new BorderLayout());
		add(btn,BorderLayout.SOUTH);
		add(textArea,BorderLayout.CENTER);
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.append("You are cliking Button for time"+(++count)+"\n");
				
			}
			
		});
		setVisible(true);
		setSize(600,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
