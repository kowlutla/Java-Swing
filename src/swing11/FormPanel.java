package swing11;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class FormPanel extends JPanel {

	private JLabel nameLable;
	private JLabel occupationLable;
	private JTextField namefield;
	private JTextField occupationField;
	private JButton okbtn;
	public FormPanel() {
		
		this.occupationLable=new JLabel("Occupation");
		this.nameLable=new JLabel("Name");
		this.namefield=new JTextField(10);
		this.occupationField=new JTextField(10);
		this.okbtn=new JButton("OK");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(nameLable);
		add(occupationField);
		Dimension dim = getPreferredSize();
		dim.width=250;
		setPreferredSize(dim);
		
		Border inner=BorderFactory.createTitledBorder("Add Person");
		Border outer=BorderFactory.createEmptyBorder();
		setBorder(BorderFactory.createCompoundBorder(inner, outer));
		//setBorder(BorderFactory.createEtchedBorder());
	}
}
