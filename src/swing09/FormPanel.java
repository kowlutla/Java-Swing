package swing09;

import java.awt.Dimension;

import javax.swing.JPanel;

public class FormPanel extends JPanel {

	public FormPanel() {
		Dimension dim = getPreferredSize();
		dim.width=200;
		setPreferredSize(dim);
	}
}
